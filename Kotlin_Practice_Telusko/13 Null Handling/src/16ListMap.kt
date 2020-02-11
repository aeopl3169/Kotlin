fun main() {
    var nums = listOf(5, 6, 7, 8)

    for (i in nums)
        print(i)

    println()

    // To print the index number we use .withIndex() method.
    // .withIndex() returns index number and value too.
    for ((a, b) in nums.withIndex()) {
        println("$a : $b")
    }
}