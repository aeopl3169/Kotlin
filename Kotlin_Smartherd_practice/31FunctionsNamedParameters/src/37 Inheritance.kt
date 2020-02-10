/* By default all classes are public and final in kotlin
* For inheriting a class we need to open the class by declare "open" keyword.
* By default every class has a super class of "Any" in kotlin.
* "Any" class contains functions like, equals(), hashCode(), toString() */

fun main(){
}
class Dog{
    var color: String = ""
    var breed: String = ""
    fun bark(){
        println("Bark")
    }
    fun eat(){
        println("Eat")
    }
}

class Cat{
    var color: String = ""
    var age: Int = -1
    fun meow(){
        println("Meow")
    }
    fun eat(){
        println("Eat")
    }
}