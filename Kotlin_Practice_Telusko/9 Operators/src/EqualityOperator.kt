fun main(args: Array<String>) {

    val style = buildString { "Bold" }
    val style2 = buildString { "Bold" }

    var result = style.equals(style2) // true
    println(result)

    result = style === "Bold" // false
    println(result)

    result = style === style2 // false
    println(result)

    result = "Bold" === "Bold" // true
    println(result)

    println()

    var num1 : Float = 5.6F
    var num2 : Float = 5.6F
    result = num1 == num2 // true
    println(result)

    result = num1.equals(num2)  // true
    println(result)
}