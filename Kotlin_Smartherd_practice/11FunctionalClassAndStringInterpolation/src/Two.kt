fun main() {
    val person = Person()
    person.name = "Jon"
    person.display()
}

class Person {
    var name: String = "default"
    fun display() {
        println(name)
    }
}