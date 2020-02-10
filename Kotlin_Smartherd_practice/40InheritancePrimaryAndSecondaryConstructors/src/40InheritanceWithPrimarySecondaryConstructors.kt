/* By default all classes are public and final in kotlin
* For inheriting a class we need to open the class by declare "open" keyword.
* By default every class has a super class of "Any" in kotlin.
* Any class contains functions like, equals(), hashCode(), toString() */

fun main() {
    var dog = Dog2("Black")
    dog.breed = "Pug"
}

// By declaring "open" keyword, we can inherit Animal class.
open class Animals(var color: String = "Default color") { // Super class
    init {
        println("Animal init block, color: $color")
    }
}

class Dog2(color: String, var breed: String = "Default breed") : Animals(color) { //Derived class
    init {
        println("Dog init block, color: $color and breed: $breed")
    }
}