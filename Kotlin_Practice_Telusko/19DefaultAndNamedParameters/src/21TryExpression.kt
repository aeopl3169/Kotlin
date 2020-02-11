fun main(){
    var str : String = "5b"
    var num: Int = try {
        str.toInt()
    } catch (e: Exception){
        10
    }
    num++
    println(num)
}