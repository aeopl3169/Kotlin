fun main() {

    var a = "Shiva"
    var b = "Shashi"

    println("The person name is : "+b.length)
    // String interpolation
    println("The person name is : $b.length")
    println("The person name is : ${b.length}")
    println("Name: $b $a")
    println("Name is : ${b + a}")

    val c = "abc"
    val d = "Hello $c"
    println(d)
}
