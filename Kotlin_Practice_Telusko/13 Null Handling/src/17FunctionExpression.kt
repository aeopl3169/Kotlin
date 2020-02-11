fun main() {
    add(4, 6)
    var result = add2(5, 1)
    println(result)

    var rslt = add3(10, 8)
    println(rslt)

    var maxResult = max(10, 25)
    println("Max : $maxResult")

    var minResults = minOf(15, 20)
    println("Min : $minResults")
}

// function
fun add(a: Int, b: Int) {
    println(a + b)
}

// function with return type.
fun add2(a: Int, b: Int): Int {
    return a + b
}

fun add3(a: Int, b: Int): Int = a + b

// function as an expression
fun max(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b