fun main(args: Array<String>) {
    var num1: Int = 4
    var num2: Int = 5

    var result : Int

    if (num1 > num2)
        result = num1
    else
        result = num2

    println(result)

    // If else works as an expression in kotlin which returns a value.
    result = if (num1 > num2)
        num1
    else
        num2

    println("Return value: $result")
}