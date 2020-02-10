// list and Arraylist
// mutableListOf<>() is mutable and no fixed size. Read and write.
fun main() {
    var list = mutableListOf<String>("Yogi", "Jon", "Peter")
    var list1 = ArrayList<String>(5)
    var list2 = arrayListOf<Int>(10)

    list.add("aaaa")
    list.add("bbbb")
    list.add("jon2")

//    list.removeAt(1)
    list[0] = "Modi" // Yogi is replace with Modi.
    for (i in list) {
        print("$i \t")
    }
    println()
    for (i in 0..list.size - 1) {
        print("Index:$i  ${list[i]} \t\t")
//        print(list.get(i) + "\t")
    }
}