import java.math.BigInteger

fun main() {
    var num = 16
    var fact = 1
    for (i in 1..num) {
        fact = fact * i
    }
    println(fact)
    println(factFun(num))
}

fun factFun(num: Int): Int {
    if (num == 0)
        return 1;
    else
        return num * factFun(num - 1)
}