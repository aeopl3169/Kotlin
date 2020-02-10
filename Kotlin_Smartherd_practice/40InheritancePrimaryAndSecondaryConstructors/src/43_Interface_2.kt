fun main() {
    var obj = Button2()
    obj.onClick()
    obj.onTouch()
}

interface MyInterfaceListener2 { // we can not create instance/object of interface
    abstract fun onTouch() // Methods in interface are abstract by default.
    //    public final open fun clik(){}    // Modifier final is not applicable in interface
    public open fun onClick() { // Normal methods are public and open by default in interface NOT FINAL
        println("onClick called in interface 2")
    }
}

interface MyInterfaceListener3 { // we can not create instance/object of interface

    fun onTouch() {
        println("onTouch in interface 3")
    }

    //    public final open fun clik(){}    // Modifier final is not applicable in interface
    public open fun onClick() { // Normal methods are public and open by default in interface NOT FINAL
        println("onClick called in interface 3")
    }
}

class Button2 : MyInterfaceListener2, MyInterfaceListener3 {
    // We should compulsory override onTouch because it contains no body.
    override fun onTouch() {
        println("onTouch called")
        super.onTouch()
    }

    // This is optional we can override the super class onClick or leave it.
    override fun onClick() {
        println("onClick called")
        super<MyInterfaceListener3>.onClick()
        super<MyInterfaceListener2>.onClick()
    }
}