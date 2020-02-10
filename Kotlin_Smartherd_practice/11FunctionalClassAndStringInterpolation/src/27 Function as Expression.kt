fun main() {
    var largeNum = max(4, 6)
    println(largeNum)

    var num = maxx(5, 15)
    println(num)

    var number = maxxx(6, 13)
    println(number)

    var minimum = min(2, 3)
    println(minimum)
}

fun max(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

// function as expression
fun maxx(a: Int, b: Int): Int = if (a > b) a else b

fun maxxx(a: Int, b: Int): Any = if (a > b) {
    println("$a is greater")
    a
} else {
    println("$b is greater")
    b // Here the b value 13 will become redundant
    99 // the data which is present in the end will be returned.
}

fun min(a: Int, b: Int): Int = if (a < b) {
    a
} else {
    b
}