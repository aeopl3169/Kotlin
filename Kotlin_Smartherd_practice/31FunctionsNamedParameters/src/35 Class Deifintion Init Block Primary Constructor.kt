fun main() {
    var stu = Stu()
    stu.name = "Shiva"
    println("Student name is : ${stu.name}")
    // init block's object
    var stud = Stud()
    // primary constructor's object
    var stude = Stude("Shashi")
    //
    var studen = Studen("Jon")
    //
    var students = Students("Mike")
}
// Class
class Stu {
    var name = "dummy"
}

// init block
class Stud {
    init {
        println("Init block called")
    }
}

// Primary Constructor
class Stude constructor(name: String) {
    init {
        println("Init. Student name is : $name")
    }
}

class Studen constructor(nam: String) {
    var name = "no name"

    init {
        this.name = nam
        println("Student name is $name")
    }
}

class Students constructor(val name: String) {
//    var name = "no name"
    init {
        println("Student name is : $name")
    }
}