// Implementing Two or More Interfaces in a Class
// Kotlin does not allow true multiple inheritance. However,
// it's possible to implement two or more interfaces in a single class.
interface A {
    fun callMe() {
        println("From interface A")
    }
}
interface B  {
    fun callMeToo() {
        println("From interface B")
    }
}
// implements two interfaces A and B
class Child: A, B
fun main(args: Array<String>) {
    val obj = Child()
    obj.callMe()
    obj.callMeToo()
}