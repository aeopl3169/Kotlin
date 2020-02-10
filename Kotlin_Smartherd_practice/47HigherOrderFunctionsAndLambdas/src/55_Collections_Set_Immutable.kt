// set contains only unique elements.
// setOf is immutable. Read only.
fun main() {
    var mySet = setOf<Int>(2, 5, 5, 5, 5, 55, 78, 9, 9, 9, 21, 86, 35, 79, 52)

    for (i in mySet) {
        print("$i \t")
    }
    println()
    for (i in mySet) {
//        print()
    }
}