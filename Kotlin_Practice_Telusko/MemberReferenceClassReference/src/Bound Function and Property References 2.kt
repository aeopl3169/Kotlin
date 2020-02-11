
// Instead of calling the method matches directly we are storing a reference to it.
// Such reference is bound to its receiver.
// It can be called directly (like in the example above) or used whenever an expression of function type is expected:
fun main() {
    val numberRegex = "\\d+".toRegex()
    val st = listOf("abc", "124", "a70")
    println(st.filter(numberRegex::matches))
}