
fun main() {
    var lambda = LambdaClass()
    // Here the outside variable res3 can not be modified in lambda method in case of java
    // but in kotlin we can modify in lambda functions
    var res3 = 0
    var res2 = lambda.addition(10, 10, { x, y -> res3 = x + y })
    println("Value of res2: $res2")
    println("Value is: $res3")
}

class LambdaClass {
    fun addition(a: Int, b: Int, act: (Int, Int) -> Unit) {
        var res = act(a, b)
        println(res)
    }
}