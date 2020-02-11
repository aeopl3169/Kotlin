interface Aa {
    fun callMe() {
        println("From interface Aa")
    }
}
interface Bb : Aa {
    override fun callMe() {
        println("From interface Ba")
    }
}
class Perfect: Aa, Bb{
    override fun callMe() {
//        super<Aa>.callMe()
        super<Bb>.callMe()
    }
}
fun main(args: Array<String>) {
    val obj = Perfect()
    obj.callMe()
}