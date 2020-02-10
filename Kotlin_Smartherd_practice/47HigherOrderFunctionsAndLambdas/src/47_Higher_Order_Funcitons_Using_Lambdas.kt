fun main() {
    val program1 = Program1()
    program1.addTwoNumbers(2, 7)
    program1.addTwoNumbers(2, 3, object : MyInterface1 {
        override fun execute(a: Int) {
            println("Addition of two numbers - Object Oriented way: $a")
        }
    })
    val test: String = "Hello"
    // Defining lambda expression/ function
    val myLambda: (Int) -> Unit = { s: Int -> println(s) }  // The two curly brackets are called lambda expression/ function
    program1.addTwoNumbers(4,4, myLambda)
    program1.addTwoNumbers(5,5, { s: Int -> println(s) })
}

class Program1 {
    fun addTwoNumbers(a: Int, b: Int, actn:(Int)->Unit) {   // Higher level function with lambda as parameter i.e function within the function
        val sum = a + b
        println("Before: $sum")
        actn(sum)
        println("After: $sum")
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface1) {   //Using interface object oriented way
        val sum = a + b
        println("Addition before : $sum")
        action.execute(sum)
        println("Addition after : $sum")
    }

    fun addTwoNumbers(a: Int, b: Int) {
        val sum = a + b
        println(sum)
    }
}

interface MyInterface1 {
    fun execute(sum: Int)
}