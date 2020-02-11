open class Person() {
    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying god.")
}
fun main(args: Array<String>) {
    val atheist = object : Person() {
        override fun pray() = println("I don't pray. I am an atheist.")
    }
    atheist.eat()
    atheist.talk()
    atheist.pray()
}