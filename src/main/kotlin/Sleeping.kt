import java.util.concurrent.TimeUnit

class Sleeping (private val name: String, private val millis: Long) {

    suspend fun run() {
        println("Starting $name")
        delay(millis, TimeUnit.MILLISECONDS)
        println("Ending $name")
    }
}