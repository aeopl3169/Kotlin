class A {
    companion object {
        // returns the object of A
        fun create(): A = A()
    }

    fun show() {
        print("in show")
    }
}

fun main() {
    var obj = A.create()
    obj.show()
}