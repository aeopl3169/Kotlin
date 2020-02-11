fun main(args: Array<String>) {
    var a1 = Alien()
    a1.skills = "JAVA"
    a1.show()

    var a2 = Alien()
    a2.skills = "SQL"
    a2.show()

    var a3 = a1.plu(a2)
    a3.show()
}

//Extension Function - Here plu function is of Alien class
fun Alien.plu(a: Alien): Alien {
    var newAlien = Alien()
    // Here "this" keyword is referred as a1
    // a2 becomes a.
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}