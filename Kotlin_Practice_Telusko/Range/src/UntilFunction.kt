// To iterate a number range which does not include its end element, use the until function
fun main() {
    for (i in 1 until 10) {       // i in [1, 10], 10 is excluded
        print(i)
    }
}