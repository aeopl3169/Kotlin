// Safe call ?.
// and elvis operator ?:
fun main(){
    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call


    val l = b?.length ?: 55
    println(l)
}