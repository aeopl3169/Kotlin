// By default all the classes are final in Kotlin.
// by using open keyword the class will be open for inherit to other class.
open class Huma {
    open fun think() {
        println("Real thinking...")
    }
}

class Alie : Huma() {
    override fun think(){
        println("Virtual thinking.")
    }
}

fun main(args: Array<String>) {
    var shiva = Huma()
    shiva.think()

    var sh = Alie()
    sh.think()
}