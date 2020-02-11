fun main() {
    var result = max(6, 10)
    println(result)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun add(a: Int, b: Int): Int = a + b