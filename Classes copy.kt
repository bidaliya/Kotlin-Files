//The variable and functions declared inside a class is called Properties of that class.
//And to hold the values of those properties, Kotlin have backing fields ( field )

//Backing field is required generally in getters.

class Student1{
    val school: String = "DP School"
    var age: Int = 5

    val teenager: Boolean
        get() = age > 12

    var name: String? = null
        get() = field ?: "Unknown"
        set(value){
            if(value != null) field = value
        }
}

fun main() {
    val student: Student1 = Student1()

    println("1. Student is a teenager: ${student.teenager}")
    student.age = 14
    println("2. Student is a teenager: ${student.teenager}")

    println("3. Student name is: ${student.name}")
    student.name = "John"
    println("4. Student name is: ${student.name}")
}
