/* By default all classes are public and final in kotlin
* For inheriting a class we need to open the class by declare "open" keyword.
* By default every class has a super class of "Any" in kotlin.
* Any class contains functions like, equals(), hashCode(), toString() */

fun main() {
    var dog = Dog("Black", "Pug")
}

// By declaring "open" keyword, we can inherit Animal class.
open class Animal() { // Super class
    var color: String = ""

    // Secondary constructor can not have properties.
    constructor(color: String) : this() {
        this.color = color
        println("From animal, color: $color")
    }
}

class Dog : Animal { //Derived class
    var breed: String = ""
    init {
        println("Dog init block, color: $color and breed: $breed")
    }
    // Secondary constructor can not have properties.
    // We should call super constructor when using secondary constructor
    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
        println("From dog, color: $color and breed: $breed")
    }
}