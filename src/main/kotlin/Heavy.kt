class Heavy (private val name: String, private val loops: Long) {

    fun run() {
        println("Starting $name")
        for (i in 0 until loops) {
            //do nothing
        }
        println("Ending $name")
    }
}