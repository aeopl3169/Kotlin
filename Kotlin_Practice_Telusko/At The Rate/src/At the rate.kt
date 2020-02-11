// A break qualified with a label jumps to the execution point right after the loop marked with that label.
// A continue proceeds to the next iteration of that loop.
fun main() {
    loop@ for (i in 1..10) {
        print("Hi ")
    }

    println()

    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (1==1)
                print("Bye ")
            // Try removing the below two line.
//            break
            break@loop
        }
    }
}