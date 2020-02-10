fun main() {
    println(MyClass.count)
    println(MyClass.typeOfCustomers())

    // try removing comment to the below line
//    CustomerDataClass.count   // We can not call with class name if it is companion object.
}

class MyClass {
    companion object CustomerDataClass {    // Here class name is not required. It is redundant.
        var count: Int = -1
        @JvmStatic
        fun typeOfCustomers(): String {
            return "Indian"
        }
    }
}