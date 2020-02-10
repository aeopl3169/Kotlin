fun main() {
    val program2 = Program2()
    val rev: (String) -> String = { s -> s.reversed() }
    // The above can be written as below
    val rev1: (String) -> String = { it.reversed() }
//    program2.reverseAndDisp("hello", { s -> s.reversed() })
    // it keyword will work only for single parameter
    var result: String? = null
    program2.reverseAndDisp("hello", { result = it.reversed() })
    println("Reverse: $result")
    program2.display("hai",{it.reversed()})
}

class Program2 {
    fun reverseAndDisp(str: String, actn: (String) -> Unit) {
        var result = actn(str)
        println(result)
    }
    fun display(str: String, actn: (String) -> String) {
        var result = actn(str)
        println("Printing results: $result")
    }
}