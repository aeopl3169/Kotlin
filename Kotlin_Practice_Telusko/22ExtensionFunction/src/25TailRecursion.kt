// Tail recursion mean we will not hold any value. Since there is nutting in pending computation will increase.
import java.math.BigInteger

fun main() {
    var num = BigInteger("70000")
    var number = 50
    var fact = 1
    for (i in 1..number) {
        fact = fact * i
    }
    println(fact)
    println(fac(num, BigInteger.ONE))
}
// Tail recursion
// By using the tailrec in the prefix of function, the compile will optimize to run the code.
tailrec fun fac(num: BigInteger, result: BigInteger): BigInteger {
    if (num == BigInteger.ZERO)
        return result
    else
//        println("Hello " + num)
    return fac(num - BigInteger.ONE, num * result)
}