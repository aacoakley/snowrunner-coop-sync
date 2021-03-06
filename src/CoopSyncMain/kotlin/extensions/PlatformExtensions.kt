package extensions

import data.SavePath
import kotlinx.cinterop.*
import platform.posix.*

inline fun SavePath.readFile(path: String = this.path, name: String = this.name): String {
    val fp = openPipe("type $path\\$name")
    val file = fp.readToString()

    if (file.isEmpty()) {
        throw IllegalArgumentException("Save file empty: ${this@readFile}")
    }

    return file
}

fun writeAllText(filePath:String, text:String) {
    val file = fopen(filePath, "w")
        ?: throw IllegalArgumentException("Cannot open output file $filePath")
    try {
        memScoped {
            if(fputs(text, file) == EOF) throw Error("File write error")
        }
    } finally {
        fclose(file)
    }
}


inline fun openPipe(str: String): CPointer<FILE> = _popen(str, "r")
    ?: throw IllegalArgumentException("Unable to parse string: \"$str\".")

inline fun CPointer<FILE>.close() = _pclose(this)

inline fun String.executeCommand(): String {
    infoln("Executing \"$this\"")
    return openPipe(this).readToString()
}

inline fun CPointer<FILE>.readToString(): String {
    val returnBuffer = StringBuilder()

    try {
        memScoped {
            val length = 4096
            val buffer = allocArray<ByteVar>(length)
            var scan = fgets(buffer, length, this@readToString)?.toKString()

            while (scan != null) {
                returnBuffer.append(scan)
                scan = fgets(buffer, length, this@readToString)?.toKString()
            }
        }
    } finally {
        this.close()
    }
    return returnBuffer.toString()
}
