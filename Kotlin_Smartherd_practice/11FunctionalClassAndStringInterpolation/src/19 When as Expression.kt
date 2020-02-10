// JAVA's switch statement is replaced with when in kotlin
fun main() {
    val x = 4
    var str: String = when (x) {
        0, 1, 2 -> "x is zero or one or two"  // For multiple condition if the solution is single we use this.
        3 -> {
            "x is three ok" // this is not printed - redundant code.
            "Use flower brackets if two print statements are there"
        }
        4 -> {
            println("x is three")
            "why" // this is not printed - redundant code.
            "ok"
        }
        in 5..20 -> "x is in 5 to 20"
        // the java default is represented with else in kotlin.
        else -> "x is unknown"
    }
    println(str)
}