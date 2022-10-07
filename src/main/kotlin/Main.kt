import java.util.stream.Collectors

fun main() {
    println("starting")
    var list = listOf(
        Heavy("heavy1", 1000),
        Heavy("heavy2", 1000),
        Heavy("heavy3", 1000)
    )
    list.stream().peek { x ->
        x.run()
    }.collect(Collectors.toList())
    Thread.sleep(10000);
    println("ending")
    println("starting")
    var listSleep = listOf(
        Sleeping("sleeping1", 1000),
        Sleeping("sleeping2", 1000),
        Sleeping("sleeping3", 1000)
    )
    listSleep.parallelStream().peek { x ->
        x.run()
    }.collect(Collectors.toList())
    Thread.sleep(10000);
    println("ending")
}


