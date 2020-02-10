/* By default all classes are public and final in kotlin
* For inheriting a class we need to open the class by declare "open" keyword.
* By default every class has a super class of "Any" in kotlin.
* Any class contains functions like, equals(), hashCode(), toString() */

fun main() {
    var dog = Dog2()
    dog.eat()

    println()

    var cat = Cat2()
    cat.eat()
}

// By declaring "open" keyword, we can inherit Animal class.
open class Animals { // Super class
    open var color: String = ""
    open fun eat() {
        println("Animal eating")
    }
}

class Dog2 : Animals() {
    var breed: String = ""
    fun bark() {
        println("Bark")
    }

    override fun eat() {
        println("Dog is eating.")
    }
}

class Cat2 : Animals() {
    var age: Int = -1
    fun meow() {
        println("Meow")
    }

    override var color = "yellow"
    // overriding the eat method by declaring override in the prefix of the funciton
    // To override eat method, it should be declared open
    override fun eat() {
        super.eat()
        println("Cat is eating.")
    }
}