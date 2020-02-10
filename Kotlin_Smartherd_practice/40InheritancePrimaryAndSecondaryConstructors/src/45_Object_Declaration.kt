fun main() {
//    var customersData = CustomersData()
//    customersData.count = 98
//    customersData.typeOfCustomers()
    CustomersData.count = 98
    println(CustomersData.count)
    CustomersData.count = 988
    println(CustomersData.count)
    println(CustomersData.typeOfCustomers())
    CustomersData.myMethod("Hello")
}

open class MySuperClass{
    open fun myMethod(str: String){
        println("MySuperClass")
    }
}
// Here the 'object' keyword will act as class and object to 'CustomerData' class.
// 'object' keyword acts as static in kotlin. It creates singleton for us.
object CustomersData : MySuperClass() { // object will also support inheritance
    var count: Int = -1 // behaves like STATIC variable
    fun typeOfCustomers(): String { // behaves like STATIC method
        return "Indian"
    }
    override fun myMethod(str: String) {    // Currently, behaves like STATIC method
        super.myMethod(str)
        println("Object CustomerData myMethod: $str")
    }
    init {  // we can also create init block in object class.
        println("init block")
    }
}