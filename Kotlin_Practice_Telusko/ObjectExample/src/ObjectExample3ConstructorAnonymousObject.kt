open class Persons(name: String, age: Int) {
    init {
        println("name: $name, age: $age")
    }
    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying god.")
}
fun main(args: Array<String>) {
    val atheist = object : Persons("Jack", 29) {
        override fun pray() = println(" I am an atheist.")
    }
    atheist.eat()
    atheist.talk()
    atheist.pray()
}