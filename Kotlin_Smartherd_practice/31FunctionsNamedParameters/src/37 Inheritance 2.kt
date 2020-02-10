/* By default all classes are public and final in kotlin
* For inheriting a class we need to open the class by declare "open" keyword.
* By default every class has a super class of "Any" in kotlin.
* Any class contains functions like, equals(), hashCode(), toString() */

fun main() {
    var dog = Dog1()
    dog.breed = "Labrader"
    dog.color = "black"
    dog.bark()
    dog.eat()

    println()

    var cat = Cat1()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()
}

// By declaring "open" keyword, we can inherit Animal class.
open class Animal {
    var color: String = ""
    fun eat() {
        println("Eat and color: $color")
    }
}

class Dog1 : Animal() {
    var breed: String = ""
    fun bark() {
        println("Bark $breed")
    }
}

class Cat1 : Animal() {
    var age: Int = -1
    fun meow() {
        println("Meow")
    }
}