// As mentioned above, an interface may also have a property that provide accessor implementation.

interface MyInterface2 {
    // property with implementation
    val prop: Int get() = 23
//    val prop: Int = 23  // Invalid
}
class InterfaceImp2 : MyInterface2 {
    // class body
}
fun main(args: Array<String>) {
    val obj = InterfaceImp2()
    println(obj.prop)
}