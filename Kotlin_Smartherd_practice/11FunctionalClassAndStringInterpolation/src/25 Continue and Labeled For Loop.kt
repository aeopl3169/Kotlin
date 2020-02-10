fun main() {
    for (i in 1..10) {
        if (i == 5)  // Here 5 will be skipped
            continue
        print("$i \t")
    }
    println()
    for (i in 1..10) {
        if (i % 2 == 0)
            continue
        print("$i \t")
    }
    println()
    for (i in 1..3) {
        for (j in 1..3) {
            print("$i $j \t")
        }
    }
    println()
    for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2)
                continue
            print("$i $j \t")
        }
    }
    println()
    /* Labelled for loop
    * By defining outerLoop@ we are assigning the name to the outer for loop
    * the loop will named as myLoop */
    outerLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2)
                continue@outerLoop
            print("$i $j \t")
        }
    }
}