//The interface does not have constructors, which means we cannot create an object of interface
//The properties or functions of interface are called Methods. Eg like val position
//Methods can have by default values as well, but they do not have backing fields to store their values, That's why they don't have any state.
//Interface are generally a method for abstraction.
//Interface are by default abstract and their properties(not all)must be overridden by the classes which inherit them

interface footballer{
    val position:String
}

//The abstract functions are those functions which need to implement ( Override )in all those subclasses which
// inherit that abstract class and function.
//Abstract is by default open, so no need to write open explicitly.
//Abstract function does not contain body


abstract class Person(val name: String): footballer{

    // in order to make a function abstract, it must be a part of abstract class and abstract function doesn't
    abstract fun doWork()
//    {
//        println("Person is doing work")
//    }
    fun doTalk(){
        //a function to talk
    }
     override val position:String = "Tarun"

}

class Students(name: String, val school: String): Person(name){
    override fun doWork(){
        println("Student is studying")
    }
}

fun main(){
   // val studnet4:Person = Person("Tarun") // This line cannot be created because we cannot create an object of an
    // abstract class
    val student:Person = Students("John", "DP School")
    student.doWork()
}


/*

interface Footballer{
    val position: String
    fun dribble()
    fun kick(){
        println("Kick the football")
    }
}

open class Person2(val name: String)

class Student2(name: String, override val position: String): Person2(name), Footballer{
    override fun dribble(){
        println("Dribble the ball")
    }
}

fun main(){
    val student = Student2("John", "Striker")
    playFootball(student)
    printName(student)
}

fun playFootball(footballer: Footballer){
    footballer.dribble()
    footballer.kick()
}

fun printName(person: Person2){
    println("Person name is: ${person.name}")
}
 */