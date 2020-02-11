fun main(){
    // Here the generic type is Int
//    var values: List<Int> = listOf<Int>(8,9,10,5,1)
    // In mutableListOf we can add value
    var values: MutableList<Int> = mutableListOf<Int>(8,5,1)
    values.add(3)
    for (i in values){
        println(i)
    }

    println()
    println(values.removeAt(0))
    println()

    for (i in values){
        println(i)
    }
}