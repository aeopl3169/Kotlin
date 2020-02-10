fun main() {
    val x = 2
    when (x) {
        1 -> println("x is one")
        2 -> {
            println("x is two")
            println("Use flower brackets if two print statements are there")
        }

        // the java default is represented with else in kotlin.
        else -> println("x is unknown")
    }
}