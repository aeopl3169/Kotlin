fun main() {
    var str1: String = buildString { "Shiva" }
    var str2: String = buildString { "Shiva" }

//    if (str1.equals(str2, true))
//    if (str1 == str2)
    if (str1 === str2)
        println("Same")
    else
        println("Not same")

    var result = str1.equals("Shiva") // true
    println(result)
    result = str2 === "Shiva" // false
    println(result)
    result = str1 === str2 // false
    println(result)
    result = "Bold" === "Bold" // true
    println(result)
}