// By default all the classes are final in Kotlin.
// Abstract classes are always open. You do not need to explicitly use open keyword to inherit subclasses from them.
abstract class Huma {
    abstract fun think()

    fun talk(){
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