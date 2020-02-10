fun main() {
    val a = 2
    val b = 5
    var maxVal: Int = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }
    println(maxVal)
}