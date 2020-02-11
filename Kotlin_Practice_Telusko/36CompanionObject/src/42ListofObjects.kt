data class Alien(var name: String, var points: Int)

fun main() {

    var values: List<Alien> = listOf<Alien>(Alien("Shiva", 80), Alien("Shashi", 90))

    for (i in values) {
        println(i)
    }

}