//Sometimes you need to create an object that is a slight modification of some class,
// without explicitly declaring a new subclass for it. Kotlin can handle this with object expressions
// and object declarations.

//open class person{
//    open var i: Int = 3
//    fun walk(){
//        println("Person is walking")
//    }
//    fun sleep(){
//        println("Person is Sleeping")
//    }
//    open fun talk(){
//        println("Person is Talking")
//    }
//}

//now suppose I want to override the function Talk( ) to print "I am Talking".
//So the first way is to create a separate class and then inherit the person class to it and then override the function
//and the second way is that to create a separate function known as Anonymous class

//fun main(){
//
//    starttalking(object :person(){
//       override fun talk(){
//           println("I am talking")
//       }
//    })
//
//}
//
//fun starttalking(man: person){
//     man.talk()
//}


//open class A(x: Int){
//    public open val y: Int = x
//}
//
//fun main(){
//    val ab: A = object: A(1) {
//            override val y=15
//        }
//}

//*************************************************

//open class A(x: Int) {
//     open val y: Int = x
//}
//
//interface B { /*...*/ }
//
//val ab: A = object : A(1), B {
//    override val y = 15
//}

//*************************************************

//Data classes
/*data class man(var height:Int, var name:String){
   open var to: Int= 23
}

fun main(){
    var Man = man(3,"Tarun")
    Man.to = 22
    println("$Man ${Man.to}")
}*/


//*************************************************
// Extension functions

class studentz(val firstname:String, val lastname:String )

//fun studentz.fullname():String {
//    return "${this.firstname} ${this.lastname}"
//}

fun studentz.fullname() = "${this.firstname} ${this.lastname}"

//here we have extend the Int fun to geteven function
fun Int.geteven(): Int {
    if ( this%2==0){
        return this
    }
    else return this+1
}

fun main(){

    val studnt = studentz("Tarun", "bidaliye")
    println(studnt.fullname())

    val int = 23
    println("The even number will be = ${int.geteven()}")

}











