fun main() {
    var user1 = User("sam", 10)
    var user2 = User("sam", 10)

    println(user1)
    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")

    if (user1 === user2)
        println("Equal")
    else
        println("Not equal")

    var newUser = user1.copy("Ok", 25)
    println(newUser)
}

// Try removing data keyword and compare the output.
// data class must contain properties like(val, var), it can not contain parameter.
//data class User(name: String, id: Int) { // This is wrong
data class User(var name: String, var id: Int){}