fun main() {
    var nums = intArrayOf(10, 12, 14)

    println(nums)// hashcode
    for (i in nums) {
        println(i)
    }

    println()
    // we can change the particular index value.
    nums[1] = 13
    // we can change the particular index value by set method.
    nums.set(0, 11)
    for (j in nums){
        println(j)
    }

    println(nums.lastIndex)
    println(nums.last())
    println(nums.get(0))
}