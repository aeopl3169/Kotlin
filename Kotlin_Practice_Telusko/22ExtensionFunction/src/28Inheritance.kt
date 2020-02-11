// By default all the classes are final in Kotlin.
// by using open keyword the class will be open for inherit to other class.
open class Humans {
    fun think(){
        println("Real thinking...")
    }
}
class Aliens : Humans() {
}
class Ali : Humans(){}

fun main(args : Array<String>)
{
    var shiva = Humans()
    shiva.think()

    var sh = Aliens()
    sh.think()

    var obj = Ali(); obj.think()
}