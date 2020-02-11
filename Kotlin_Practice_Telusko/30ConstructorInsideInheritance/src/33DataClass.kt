// data class has default toString(), equals, hashcode, copy method and setters & getters.
data class Laptop(val brand: String, val price: Int) {
    fun show() {
        println("Awesome laptop")
    }
}

fun main() {
    var lap1 = Laptop("Dell", 20000)
    var lap2 = Laptop("Dell", 20000)

    // try deleting data keyword in the top and check the value of below == and .equals
    println(lap1.equals(lap2))
    println(lap1 == lap2)
    println(lap1 === lap2)
    println(lap1)  //This is equal to - println(lap1.toString())
    println(10 == 10)
    println(10.equals(10))

    // the ".copy" method will allow to copy the value only if
    // the Laptop class is declared with "data" keyword
    var lap3 = lap1.copy(price = 30000)
    println(lap3)
}