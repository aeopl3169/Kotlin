/* Infix should have only single parameter and have a prefix of "infix"
    Infix functions can be a member function or extension function
    All infix functions are extension functions but all extension function are not infix
    */
fun main() {
    val x = 6
    val y = 20
    val grt = x.greater(y)
    println(grt)

    // By using the infix, we can write it as a statement.
    val great = x greater y
    println("Infix : $great")
}

// infix extension function
infix fun Int.greater(i1: Int): Int {
    if (this > i1)
        return this
    else
        return i1
}