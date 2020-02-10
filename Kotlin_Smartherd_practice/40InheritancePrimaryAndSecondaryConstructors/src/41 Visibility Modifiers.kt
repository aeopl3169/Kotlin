// protected is not applicable for top level functions and classes
//protected internal fun run(){
internal fun run() {}

fun main() {
    var indian = Indian()
    println(indian.c)
    println(indian.d)
    indian.test()
    println()
    var testClass = TestClass()
    testClass.testing()
}

class TestClass {
    // person.a, person.b are not visible because they are private and protected.
    // person.c, person.d are visible because they are internal and public.
    fun testing() {
        var person = Person()
//        println(person.a)   // Cannot access 'a': it is private in 'Person'
//        println(person.b) // Cannot access 'b': it is protected in 'Person'. Protected can be accessed by sub classes only.
        println(person.c)
        println(person.d)
    }
}

open class Person {
    private var a = 1
    protected val b = 2
    internal val c = 3
    public val d = 4
}

class Indian : Person() { // derived class
    fun test() {
        print(b)    // Protected can be accessed by sub classes only.
    }
}