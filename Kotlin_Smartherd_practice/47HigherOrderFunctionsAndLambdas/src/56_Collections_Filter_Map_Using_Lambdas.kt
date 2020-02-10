/* Predicates: is a condition that returns TRUE of FALSE
* Filter - returns a list containing only elements matching the given [predicates].
* Map - returns a list containing the results...  */
fun main() {
    val list = listOf<Int>(2, 3, 4, 6, 23, 15)  // Immutable list
    val mySmallNums = list.filter { it < 10 } // or { num -> num < 10 }
    for (i in mySmallNums) {
        print("$i \t")
    }

    println()
    val mySquare = list.map { it * it } // or{ num -> num * num }
    for (i in mySquare) {
        print("$i \t")
    }

    println()
//    val mySmallSquare = list.map { it * it }.filter { it < 10 }
    val mySmallSquare = list.filter { it < 10 }.map { it * it }
    for (i in mySmallSquare) {
        print("$i \t")
    }
}