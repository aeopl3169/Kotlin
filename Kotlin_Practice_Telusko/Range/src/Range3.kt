// It is also possible to iterate over numbers with an arbitrary step (not necessarily 1).
// This is done via the step function.
fun main() {
    for (i in 1..8 step 2)
        print(i)

    println()

    for (i in 8 downTo 1 step 2)
        print(i)
}