interface X {
    fun callMe() {
        println("From interface X")
    }
}
interface Y {
    fun callMe() {
        println("From interface Y")
    }
}
class More: X, Y{
    override fun callMe() {
        super<X>.callMe()
        super<Y>.callMe()
    }
}
fun main(args: Array<String>) {
    val obj = More()
    obj.callMe()
}