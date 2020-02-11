// static keyword in java dos not support in kotlin

class D {
    companion object {
        // @JvmStatic annotation makes the show method as static
        // we can use this annotation only in companion object
        @JvmStatic
        fun show() {
            println("Hello")
        }
    }
}

fun main() {
    D.show()
}