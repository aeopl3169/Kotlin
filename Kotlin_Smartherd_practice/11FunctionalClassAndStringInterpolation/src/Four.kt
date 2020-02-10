import com.inter.Human

fun main() {

    var human = Human()
    human.name = "Jon"
    human.display()
    println("The person name is : "+human.name)
    // String interpolation
    println("The person name is : ${human.name}")
}
