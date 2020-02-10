fun main() {
    println()
    val people = listOf<Person3>(
        Person3(10, "Jon"),
        Person3(23, "Annie"),
        Person3(17, "Sam")
    )
    var name = people.map { it.name } // or {p -> p.name}
    for (i in name) {
        print("$i \t")
    }
    println()
//    var name1 = people.filter { person3 -> person3.name.startsWith("S") }.map { a -> a.name }
    var name1 = people
        .filter { it.name.startsWith("S") }
        .map { it.name }
    for (i in name1) {
        print("$i \t")
    }
}

class Person3(var age: Int, var name: String) {}