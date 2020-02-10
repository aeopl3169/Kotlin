import java.math.BigInteger

// To find out fibonacci series with the help of tail recursion
// 0 1 1 2 3 5 8 13 21 .....

fun main() {
    println(getFibonacci(10, BigInteger("1"), BigInteger("0")))
    println(getFibonacciTailRec(BigInteger("10000"), BigInteger("1"), BigInteger("0")))
}

fun getFibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0)
        return b
    else
        print("${a+b} \t")
        return getFibonacci(n - 1, a + b, a)
}

// tailrec will prevent from java.lang.StackOverflowError
tailrec fun getFibonacciTailRec(n: BigInteger, a: BigInteger, b: BigInteger): BigInteger {
    if (n == BigInteger.ZERO)
        return b
    else
        return getFibonacciTailRec(n - BigInteger.ONE, a + b, a)
}