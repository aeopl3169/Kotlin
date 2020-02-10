/* Predicates: is a condition that returns boolean value (TRUE of FALSE)
* all - Do all elements satisfy the condition/predicates
* any - Do any elements in the list satisfy the condition
* count - returns the size of total elements that satisfy the predicate
* find - returns the FIRST element that satisfy the predicate */
fun main() {
    val list = listOf<Int>(10, 20, 1, 2, 3, 4, 5, 6, 26, 15)

    val boo = list.all { it > 10 }  // Are all element greater than 10 or not?
    println(boo)

    val boo1 = list.any { it > 10 }
    println(boo1)

    val boo2 = list.count { it > 10 }
    println(boo2)

    val boo3 = list.find { it > 10 }
    println(boo3)

}