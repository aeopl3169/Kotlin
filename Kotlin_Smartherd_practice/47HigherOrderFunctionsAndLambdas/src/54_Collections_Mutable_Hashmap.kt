// Maps and HashMaps
// Maps are of key value pairs
// HashMaps are mutable and no fixed size. Read and write.
// HashMaps doesn't maintain order.
fun main() {
    var map = HashMap<Int, String>()
    var map1 = mutableMapOf<Int, String>()  // Returns LinkedHashMap
    var map2 = hashMapOf<Int, String>()   //
    map.put(10, "Yogi")
    map.put(21, "Jon")
    map.put(15, "Peter")
    for (i in map) {
        print("$i \t")
    }
    map.replace(10, "Modi")
    println()
    for (i in 0..map.size - 1) {
        print("Index:$i  ${map.mapKeys { i }} \t\t")
//        print(map.get(i) + "\t")
    }
    println()
    for (i in map.keys) {
        print(map[i]+"\t")
    }
}