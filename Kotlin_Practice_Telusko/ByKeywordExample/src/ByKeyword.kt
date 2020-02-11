interface Base {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int) : Base {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
}

class Derived(b: Base) : Base by b {
    override fun printMessage() {
        print("abc")
    }
}

fun main() {
    val obj = BaseImpl(10)
    Derived(obj).printMessage()
    Derived(obj).printMessageLine()
}