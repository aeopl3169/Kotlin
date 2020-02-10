fun main() {
    var student = Student()

    println("Pass Status : ${student.hasPassed(65)}")
    println("Greater than 95% ? : ${student.maxMarks(96)}")
}

// Extension function
fun Student.maxMarks(marks: Int): Boolean {
    return marks > 95
}

class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}