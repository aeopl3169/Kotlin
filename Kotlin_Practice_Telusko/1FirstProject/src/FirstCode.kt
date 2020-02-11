fun main() {
    println("Hello!")

    var tittuObj = Alien()
    tittuObj.name = "Shiva"

    println("Name is: " + tittuObj.name)

    println("Name is: ${tittuObj.name}")
    println("Name is: $tittuObj.name")

    tittuObj = Alien()
    println("Name is: ${tittuObj.name}")
}