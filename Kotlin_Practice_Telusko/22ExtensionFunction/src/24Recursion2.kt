import java.math.BigInteger

fun main() {
    var num = BigInteger("4")
    var number = 4
    var fact = 1
    for (i in 1..number) {
        fact = fact * i
    }
    println("Factorial: $fact")
    print(factn(num))
}

fun factn(num: BigInteger): BigInteger {
    if (num == BigInteger.ZERO)
        return BigInteger.ONE;
    else
        println("Hello "+num)
        return num * factn(num - BigInteger.ONE)
}