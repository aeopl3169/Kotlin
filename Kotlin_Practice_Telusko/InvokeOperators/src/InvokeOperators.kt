
fun main(args: Array<String>) {
    val gree = Greeter(greeting = "Welcome")
    gree(name = "Kotlin") //this calls the invoke function which takes String as a parameter
}

class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting $name")
    }
}