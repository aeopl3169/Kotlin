fun main() {
    findVolume(height = 30, breadth = 3, length = 5)
    findVolume(3, 4, 5)
    findVolume(45,  40)
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height: Int = 10) {
    println("Length is $length, breadth is $breadth and height is $height")
}