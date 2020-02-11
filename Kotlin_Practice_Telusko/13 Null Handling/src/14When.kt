fun main(args : Array<String>){
    val num : Int = 3
    when(num){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Give a proper input.")
    }

    val number : Int = 2
    when(number){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> println("Give a proper input.")
    }
    println("number is $number")
}