// By default all the classes are final in Kotlin.
// by using "open" keyword, class will be open for inherit to other class.
open class Human(age: Int) {
    // init is primary constructor block
    init {
        println("init in Human class $age")
    }
    open fun think() {
        println("Real thinking...")
    }
}

class Alien(age: Int) : Human(age) {
    init {
        println("init in Alien class $age")
    }
    override fun think(){
        println("Virtual thinking.")
    }
}

fun main(args: Array<String>) {
    var sh : Human = Alien(20)
    sh.think()

    println()
    var obj = Alien(28)
    obj.think()
}