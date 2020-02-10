// Arrays are fixed size and mutable.
fun main() {
    var myArray = Array<Int>(5) { 0 }
    myArray[0] = 10
    myArray[1] = 20
//    myArray[2] = 30
    myArray[3] = 40

    for ( i in myArray){
        print("$i \t")
    }
    println()
    for (i in 0..4){
        print("$i: ${myArray[i]} \t")
    }
}