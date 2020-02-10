fun main() {
    val x = 1
    when (x) {
        0, 1, 2 -> println("x is zero or one") // For multiple condition if the solution is single we use this.
        3 -> {
            println("x is two")
            println("Use flower brackets if two print statements are there")
        }
        in 4..20 -> println("x is in 1 to 20")

        // the java default is represented with else in kotlin.
        else -> println("x is unknown")
    }
}