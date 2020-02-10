fun main() {
    val str1: String = "Hello "
    val str2: String = "World"
    val str3: String = "Hi "
    println(str3.addd(str1, str2))

    val x = 6
    val y = 10
    val grt = x.greaterValue(y)
    println(grt)
}
// Extension function
fun String.addd(s1: String, s2: String): String {
    return this + s1 + s2
}
// Extension function
fun Int.greaterValue(i1: Int): Int {
    if (this > i1)
        return this
    else
        return i1
}