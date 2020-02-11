import java.util.TreeMap

fun main() {
    var map = TreeMap<String, Int>()
    map["number"] = 30
    map["age"] = 28

    for ((ke, value) in map)
        println("$ke : $value")

}