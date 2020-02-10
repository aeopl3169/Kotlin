fun main(){
    var rect = Rectangle()
    rect.len = 15
    rect.breadth = 2
//    rect.length = "ok"
    println("The length is ${rect.len} and $rect.length")
    println("String is : ${rect.length} and ${rect.length}")
    println("String is : ${rect.length} and ${rect.length.length}")
    println("Another string is : ${rect.length} and ${rect.length.length}")
    println("Length of the given string is : ${rect.a.length}")
}

class Rectangle{
    var len: Int = 0
    var breadth: Int? = null
    var length: String = "shiva"
    var a : String = "shashi"
}