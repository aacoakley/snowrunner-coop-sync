import kotlinx.cinterop.*
import platform.posix.*

inline fun SaveFile.readFile(): String {
    val fp = openPipe("type ${this.path}\\${this.name}")
    val file = fp.readToString()

    if (file.isEmpty()) {
        throw IllegalArgumentException("Save file empty: ${this@readFile}")
    }

    return file
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
