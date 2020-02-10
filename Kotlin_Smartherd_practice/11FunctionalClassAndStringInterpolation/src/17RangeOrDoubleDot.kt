fun main(){
    val r1 = 1..5
    val r11 = 1.rangeTo(10)
    val r2 = 1..10 step 2 // step will jump to directly the number of steps given.
    val r3 = 5 downTo 1
    val r31 = 15 downTo 1 step 3
    val r4 = 15.downTo(1) step 2
    val r5 = 'z' downTo 's'
    val r6 = "a".."z" // This will not work because of double quotes.
    val r7 = 'a'..'z'
    val r8 = 1 until 10 // 10 is excluded.

    for (i in r11){
        print("$i \t")
    }
}