fun main() {
    var lambda = Lambda()
    var res1 = lambda.join("shashi ", "shiva", { x, y -> x + y })
    println("Printing: $res1")
    var res3 = 0
    var res2 = lambda.addition(10, 10, { x, y -> res3 = x + y })
    println("Printing res2: $res2")
    println("Printing res3: $res3")
}

class Lambda {
    fun join(a: String, b: String, act: (String, String) -> String) {
        var res = act(a, b)
        println("Result: $res")
    }

    fun addition(a: Int, b: Int, act: (Int, Int) -> Unit) {
        var res = act(a, b)
        println("This value: $res")
    }
}