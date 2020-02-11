fun main(){
    val b : String? = "shiva"
    println(b?.length)

    val l = b?.length ?: 10
    println(l)
}