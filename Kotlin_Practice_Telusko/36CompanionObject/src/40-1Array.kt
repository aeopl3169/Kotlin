fun main() {
    var nums = IntArray(4)
    var num = DoubleArray(4)
    nums.set(0, 10)
    nums.set(1, 12)
    nums.set(2, 14)
    for (i in nums) {
        println(i)
    }

    var str = arrayOfNulls<String>(5)
    str.set(0,"shashi")
    str.set(1,"shiva")
    for (j in str){
        println(j)
    }

}