fun main() {
    var obj = Button()
    obj.onClick()
    obj.onTouch()
}

interface MyInterfaceListener { // we can not create instance/object of interface
    abstract var name: String    // Properties in interface are abstract by default
    abstract fun onTouch()
//    public final open fun clik(){}    // Modifier final is not applicable in interface
    public open fun onClick() { // Normal methods are public and open by default in interface NOT FINAL
        println("onClick called in interface")
    }
}

class Button: MyInterfaceListener{
    override var name = "Shiva"
    // We should compulsory override onTouch because it contains no body.
    override fun onTouch() {
        println("onTouch called")
    }
    // This is optional we can override the super class onClick or leave it.
    override fun onClick() {
        println("onClick called")
        super.onClick()
    }
}