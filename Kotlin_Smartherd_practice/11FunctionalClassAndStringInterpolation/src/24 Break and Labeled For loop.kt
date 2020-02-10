fun main() {
    for (i in 1..10) {
        if (i == 5)
            break
        print("$i \t")
    }
    println()
    for (i in 1..3) {
        for (j in 1..3) {
            print("$i $j \t")
            if (i == 2 && j == 2)
                break
        }
    }
    println()
    /* Labelled for loop
    * By defining myLoop@ we are assigning the name to the outer for loop
    * the loop will named as myLoop */
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            print("$i $j \t")
            if (i == 2 && j == 2)
                break@myLoop
        }
    }
}