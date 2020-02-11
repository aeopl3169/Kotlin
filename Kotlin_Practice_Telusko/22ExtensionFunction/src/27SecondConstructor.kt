// Primary Constructor
class HumanBrain(var nam: String) {
    var age: Int = 0
    var name: String = nam

    // secondary constructor
    // Here the below this keyword will call the primary constructor, this process is called constructor chaining.
    constructor(age: Int, name: String) : this(name) {
        this.age = age
    }
    // init is primary constructor block.
    init {
        println("Human Brain ...$nam $name $age")
    }

    fun think() {
        println("Kotlin... $nam and my age is $age")
        println("Kotlin... $name and my age is $age")
    }
}

fun main() {
    var shiva = HumanBrain(28, "Shiva")
    shiva.think()
}