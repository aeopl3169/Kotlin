/* Predicates: is a condition that returns boolean value (TRUE of FALSE)
* all - Do all elements satisfy the condition/predicates
* any - Do any elements in the list satisfy the condition
* count - Total elements that satisfy the predicate
* find - returns the FIRST element that satisfy the predicate */
fun main() {
    val list = listOf<Int>(20, 1, 2, 3, 4, 5, 6, 26, 15)

    val myPredicate = { num: Int -> num > 10 } //This doesn't work{ it > 10}

    val boo = list.all (myPredicate)  // Are all element greater than 10 or not?
    println(boo)

    val boo1 = list.any (myPredicate)
    println(boo1)

    val boo2 = list.count (myPredicate)
    println(boo2)

    val boo3 = list.find (myPredicate)
    println(boo3)

}