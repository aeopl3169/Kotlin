fun main() {
    val program = Program()
    program.addTwoNumbers(2, 7)
    program.addTwoNumbers(2, 3, object : MyInterface{
        override fun execute(b: Int) {
            println("Printing here: $b")
        }
    })
}

class Program {
    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {    // Using interface/ object oriented way
        val sum = a + b
        println("Printing in Program class: $sum")
        action.execute(a+b)

    }
    fun addTwoNumbers(a: Int, b: Int) { // Normal way.
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}