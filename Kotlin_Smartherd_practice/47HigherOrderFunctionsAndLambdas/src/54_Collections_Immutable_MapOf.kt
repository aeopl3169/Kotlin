// Maps are of key value pairs
// MapOf<>() is immutable and fixed size. Read only.
fun main() {
    var map = mapOf<Int, String>(10 to "Yogi", 21 to "Jon", 15 to "Peter")

    for (i in map) {
        print("$i \t")
    }
    println()
    for (i in 0..map.size - 1) {
        print("Index:$i ${map.mapKeys { i }} \t\t")
//        print(map.get(i) + "\t")
    }
    println()
    for (i in map.keys) {
        print("${map[i]} \t\t")
    }
    println()
    for (i in map.values) {
        print("$i \t\t")
    }
}