// By using this annotation (JvmName), class file will be saved with the word First.class instead of Code2Kt.class
@file:JvmName("First")
fun main() {
    var result = max2(6, 20)
    println(result)
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b

fun add2(a: Int, b: Int): Int = a + b