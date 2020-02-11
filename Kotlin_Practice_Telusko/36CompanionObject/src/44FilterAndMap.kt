data class Human(var name: String, var points: Int)

fun main() {
    var values = listOf<Int>(4, 1, 2, 10, 5, 7, 6)
    var even = values.filter { it % 2 == 0 }
    even.forEach({ println(it) })

    println()

    var multiplyValue = even.map { it * 2 }
    multiplyValue.forEach({ println(it) })

    println()
    
    var results = values
        .filter { it % 2 == 0 }
        .map { it * 2 }
    results.forEach({ println(it)})
}