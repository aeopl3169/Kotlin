fun main() {
    var a1 = Alien()
    a1.skills = "C"
    a1.show()

    var a2 = Alien()
    a2.skills = "C++"
    a2.show()

    // if we use the operator "+" symbol definitely we should call .plus function.
    // the "+" operator will automatically call the plus function by default.
    var a3 = a1 + a2
    a3.show()
}

// we use the keyword "infix" in the suffix to use this..
// infix taken only one parameter
operator infix fun Alien.plus(a: Alien): Alien {
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien;
}