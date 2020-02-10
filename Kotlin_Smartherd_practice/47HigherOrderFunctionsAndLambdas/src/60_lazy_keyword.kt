/* Lazy keyword - memory will not be allocated until we use/call it.
* lazy is thread safe - It is initialized in the thread when it is used for the first time,
* other threads use the same value stored in the cache.
* It can be used with mutable (var) and immutable(val)
* It can be used for nullable and non- nullable */
val pi: Float by lazy { 3.14f }
// We can use nullable data too i.e. "?"
val num: Int? by lazy { null }
val pi2: Float = 3.14f

fun main() {
    println("Some code....")

    // If the "lazy" keyword is used then it will be saved in the cash memory.
    val area = pi * 4 * 4
    println(area)
    // It (pi) is initialized only once. For the second time, it will get from cache memory.
    val area1 = pi * 2 * 2
    println(area1)
}