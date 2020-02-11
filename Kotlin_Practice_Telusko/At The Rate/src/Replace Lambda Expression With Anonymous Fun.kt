fun fo() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 1) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
        print(value)
    })
    print(" done with anonymous function")
}

fun main() {
    fo()
}