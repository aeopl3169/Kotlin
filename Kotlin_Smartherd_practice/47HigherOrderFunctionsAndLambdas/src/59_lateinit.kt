/* lateinit should be used only with mutable data type i.e. var.
* It can be used only with non nullable data type.
* Lateinit should be initialize before using it or else throws exception (UninitializedPropertyAccessException) */

fun main() {
    val country = Country()
    // try calling/printing before initializing "name". It throws below error
    // Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property name has not been initialized
//    println(country.name)
    country.name = "India"
    println(country.name)
    country.setUp()
}

class Country {
//    var name: String
//    lateinit var name1: String? = null // 'lateinit' modifier is not allowed on properties of nullable types
//    lateinit var name2: String = "Hello" // 'lateinit' modifier is not allowed on properties with initializer
    lateinit var name: String

    fun setUp(){
        println("Name is: $name")
    }
}