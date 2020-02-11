interface Humans {
    fun think()
}

fun main() {
    // Here the "object" keyword allows to
    // create anonymous inner class (instance) and can use only once.
    var programmer: Humans = object : Humans {
        override fun think() {
            println("Thing virtually.")
        }
    }
    programmer.think()
}