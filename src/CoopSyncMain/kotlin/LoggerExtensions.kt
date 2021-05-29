inline fun <reified T> T.info(message: String = ""): T {
    return this.also { println("[INFO] $message$this") }
}

fun infoln(message: String) {
    message.info()
}

inline fun <reified T> T.error(message: String = ""): T {
    return this.also { println("[ERROR] $message$this") }
}

fun errorln(message: String) {
    message.error()
}
