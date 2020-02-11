fun main (args : Array<String>){
//    var nums = 1..5
    var nums = 'A'..'z'
    for(a in nums){
        print(a)
    }

println()

//    var number = 16 downTo 5
//    var number = 16.downTo (1)
//    var number = 1.until (16)
    var number = 1 until 8
    for(a in number){
        print("$a \t")
    }

    println()

    var num2 = 2 until 10
    for(a in num2.reversed()){
        print("$a \t")
    }
    println()
    print("Count is ${num2.count()}")
}