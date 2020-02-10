fun main() {

    var pers = Pers()
    pers.name = "Jon"
    pers.display()
    println("The person name is : "+pers.name)
    // String interpolation
    println("The person name is : ${pers.name}")
}

class Pers {
    var name: String = ""
    fun display() {
        println(name)
    }
}