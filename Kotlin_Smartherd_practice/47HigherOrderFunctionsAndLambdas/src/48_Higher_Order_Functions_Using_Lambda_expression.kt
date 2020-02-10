// High level function means, method accepts lambda function as a parameter
// or can return lambda function.
fun main() {
    val prgm = Prgm()
    val myLambda: (Int) -> Unit = { s: Int -> println(s) }
    prgm.addNumbers(2, 2, myLambda)

    val addition = Addition()
    val myLamb: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val myLamb2: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    addition.addNum(8, 8, myLamb)
    addition.addNum(5, 5, { x: Int, y: Int -> x + y })
    addition.addNum(3, 3, { x, y -> x + y })    // x,y are parameters and x+y is Method body.
    addition.addNum(9, 9) { x: Int, y: Int -> x + y }
}

class Addition {
    // High level function
    fun addNum(a: Int, b: Int, action: (Int, Int) -> Int) {
        val results = action(a, b)
        println(results)
    }
}

class Prgm {
    // High level function
    fun addNumbers(a: Int, b: Int, action: (Int) -> Unit) {
        action(a + b)
    }
}