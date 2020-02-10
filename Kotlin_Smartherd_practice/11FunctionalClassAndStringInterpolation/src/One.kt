fun main() {
    val name: String = "Jon"
    val persons = Persons()
    persons.display(name)
}

class Persons {
    fun display(name: String) {
        println(name)
    }
}