interface A {
    fun show()
    fun abc(){
        println("abc A")
    }
}

interface B {
    fun display()
    fun abc(){
        println("abc B")
    }
}

class C : A, B {
    override fun show() {
        println("show")
    }

    override fun display() {
        println("display")
    }

    override fun abc(){
        println("abc function in C")
        super<A>.abc()
        super<B>.abc()
    }
}

fun main() {
    var obj = C()
    obj.show()
    obj.display()
    obj.abc()
}