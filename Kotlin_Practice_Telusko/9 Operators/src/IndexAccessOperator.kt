/*
a[i]    	            a.get(i)
a[i, n] 	            a.get(i, n)
a[i1, i2, ..., in]	    a.get(i1, i2, ..., in)
a[i] = b	            a.set(i, b)
a[i, n] = b	            a.set(i, n, b)
a[i1, i2, ..., in] = b	a.set(i1, i2, ..., in, b)
*/

fun main(args: Array<String>) {

    val a = intArrayOf(10, 20, 30, 40, -1)
    println(a[1])

    a[1] = 12
    println(a[1])

    println()
    println(a.get(1))
    a.set(1, 0)
    println(a.get(1))
}