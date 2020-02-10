fun main() {
    var person = Person()
//    person.name = "Jon"
//    person.age = 23
    // "with" is a kotlin standard library. with is not kotlin language.
    with(person) {
        name = "Jon"
        age = 23
    }
    println("with: ${person.name}")
    println("with: ${person.age}")
    // "apply" is same as "with" but returns a receiver.
    // "apply" can call the methods present in the 'Person' class too.
    person.apply {
        name = "Henry"
        age = 43
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person {
    var name: String = ""
    var age: Int = -1
    fun startRun() {
        println("Now I am ready to run.")
    }
    fun start(){
        println("Start function.")
    }
}