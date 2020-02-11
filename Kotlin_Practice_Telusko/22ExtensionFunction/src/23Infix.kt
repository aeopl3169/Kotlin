fun main() {
    var a1 = Alien()
    a1.skills = "C"
    a1.show()

    var a2 = Alien()
    a2.skills = "C++"
    a2.show()

    var a3 = a1 method a2
    a3.show()
}
// we use the keyword "infix" in the suffix to use this..
// infix taken only one parameter
infix fun Alien.method(a: Alien): Alien {
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    println("This is: ${a.skills}")
    return newAlien;
}