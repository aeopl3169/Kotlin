// Set and HashSet contains only unique elements.
// mutableSetOf and hashSetOf is mutable. Read and write.
fun main() {
    // mutableSetOf maintains insertion sequence
    var mySet = mutableSetOf<Int>(2, 5, 5, 5, 5, 55, 78, 9, 9, 9, 21, 86, 35, 79, 52)
    // hashSetOf doesn't maintain sequence
    var mySet1 = hashSetOf<Int>(2, 5, 5, 5, 5, 55, 78, 9, 9, 9, 21, 86, 35, 79, 52)
    mySet.remove(9)
    mySet.add(485)
    for (i in mySet) {
        print("$i \t")
    }
    println()
    for (i in mySet1) {
        print("$i \t")
    }
}