fun main() {
    var a = 1
    var b = 2
    println("Sum is : ${a + b}")

    var sum = add(5, 4)
    println(sum)

    println(add(2, 3))

    println(str("shashi", "shiva"))
}

fun add(c: Int, d: Int): Int {
    return c + d
}

fun str(e: String, f: String): String {
    return e + f
}