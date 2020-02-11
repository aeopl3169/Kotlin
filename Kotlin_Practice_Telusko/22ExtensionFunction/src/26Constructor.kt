// Primary Constructor

class Human (var nam : String = "defaultValue"){
    // if we use any modifiers (public, private, protected) then constructor keyword is compulsory or else leave it default
//class Human constructor(var nam : String){
    var name : String = nam
    fun think() {
        println("Kotlin... $nam")
        println("Kotlin... $name")
    }
}
fun main(){
    // Object
    var shiva = Human("Shiva");
    // calling the function
    shiva.think()
}