// if no modifier or annotation we can get rid of "constructor" keyword
// constructor parameters can have default values
// primary constructor can't contain any code. Use init block for initialization.
// there can be multiple init block
// primary constructor can have properties

 /*class Student (  var first: String="Mark", second: String = "Bidaliya"){
    var firstName: String
    var lastName: String? = null
    init{
        println("init block called")
        this.firstName = first
        this.lastName = second
    }

     inner class schoolbag(){
         fun printBagOwner(){
             println("The Bag owner is $first")
         }
     }

}

fun main() {
    var student: Student = Student()
    //val student1=Student()
    //val student: Student = Student("John", "Doe")
    println("Name of the student is: ${student.firstName} ${student.lastName}")
    val bagOwner = Student("Tarun", "bidaliya").schoolbag().printBagOwner()
}
*/
