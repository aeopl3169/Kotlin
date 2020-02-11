interface MyInterface {
    val test: Int   // abstract property
    fun foo() : String  // abstract method (returns String)
    fun hello() {   // method with default implementation
        println("Hello there, pal!")
    }
    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }
}
class InterfaceImp : MyInterface {
    override val test: Int = 25
    override fun foo() = "Lol"
}
fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("test = ${obj.test}")
    print("Calling hello(): ")
    obj.hello()
    print("Calling and printing foo(): ")
    println(obj.foo())
    obj.displaySSN(23123)
}