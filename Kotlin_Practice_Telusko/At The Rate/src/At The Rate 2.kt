/*
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}
*/

// The return-expression returns from the nearest enclosing function, i.e. foo.
// (Note that such non-local returns are supported only for lambda expressions passed to inline functions.)
// If we need to return from a lambda expression, we have to label it and qualify the return:
/*
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}
*/

// Now, it returns only from the lambda expression.
// Oftentimes it is more convenient to use implicit labels:
// such a label has the same name as the function to which the lambda is passed.
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    println(" done with implicit label")
}

fun main() {
    foo()
}