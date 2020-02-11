import java.lang.NumberFormatException

fun main(args: Array<String>) {
    var str: String = "4"
    var num: Int = str.toInt()
    num++
    println(num)

    var str2: String = "4a"
    var num2 = 0
    try {
        num2 = str2.toInt()
    } catch (e: NumberFormatException) {
        println("Exception $e")
    }
}