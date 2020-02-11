var x = 1

fun main() {
    println(::x.get())
    println(::x.name)
    ::x.set(2)
    println(x)
}