fun main() {
    var human = Human("Shiva", 10)
    println("Name: ${human.name} and Id : ${human.id}")
}

class Human(var name: String) {
    var id: Int = -1

    init {
        println("Name is: $name and Id is $id")
    }

    // Secondary constructor
    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }
}