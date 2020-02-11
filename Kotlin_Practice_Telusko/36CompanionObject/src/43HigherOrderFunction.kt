import java.util.function.Consumer

data class Aliens(var name: String, var points: Int)

fun main(){
    var values = listOf<Int>(4,8,10)
    for (i in values){
        println(i)
    }

    println()

    // Anonymous inner class
    var con : Consumer<Int> = object : Consumer<Int>{
        override fun accept(t: Int) {
            println(t)
        }
    }
    values.forEach(con)

    println()

    // Boiler plate
    values.forEach({a -> println(a)})

    println()

    // forEach is a function. Here we are passing function inside function
    values.forEach({ println(it)})

    println()

    values.forEach(::println)
}