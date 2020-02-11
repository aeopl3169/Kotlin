// By default all the classes are final in Kotlin.
// Abstract classes are always open. You do not need to explicitly use open keyword to inherit subclasses from them.
abstract class Hum{
    open fun talk(){
        println("Talking form Huma2")
    }
}
abstract class Huma : Hum() {
    abstract fun think()

    override fun talk(){
        println("Talking")
    }
}

class Alie : Huma() {
    override fun think(){
        println("Virtual thinking.")
    }
}

fun main(args: Array<String>) {
    var sh : Huma = Alie()
    sh.think()
    sh.talk()
}