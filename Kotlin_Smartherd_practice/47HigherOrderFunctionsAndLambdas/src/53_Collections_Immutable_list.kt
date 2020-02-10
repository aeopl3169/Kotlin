// list
// listof<>() is immutable and fixed size. Read only.
fun main() {
    var list = listOf<String>("Yogi", "Jon", "Peter")

    for (i in list) {
        print("$i \t")
    }
    println()
    for (i in 0..list.size - 1) {
//        print("Index:$i  ${list[i]} \t\t")
        print(list.get(i) + "\t")
    }
}