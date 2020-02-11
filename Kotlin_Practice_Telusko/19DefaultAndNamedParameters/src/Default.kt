fun main() {
    var finalAmount = calcAmt(50, 0.03)
    // Even if the interest parameter is not passed, the default will be taken as given.
//    var finalAmount = calcAmt(50)
    // parameters can be passed in any order if mentioned by name type.
//    var finalAmount = calcAmt(interest = 0.09, amt = 50)
//    var finalAmount = calcAmt()
    println(finalAmount)

}

// the @JvmOverloads annotation will create two methods for the given function (calcAmt)
@JvmOverloads
fun calcAmt(amt: Int = 100, interest: Double = 0.04): Int {
    return (amt + amt * interest).toInt()
}