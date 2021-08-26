//if we write open in front of class's name, then it means that class can be inherited by its
// subclasses

//open class vehicle(){
//If we write open in front of functions and variables, then that means we can override them

//     open fun startengine(){
//        println("Vehicle's Engine Start")
//    }
//}

// by default if a class is open, then all its functions and variables can be automatically inherited by its child classes
// and we need not to write open in front of those fucntions and variables.


//open class BMWCar():vehicle(){
//     override fun startengine() {
//        println("BMW engine's start")
//        super.startengine()    // this "super" key is used to access the startengine() function of the parent.
//    }
//}
//
//open class AudiCar():vehicle(){
//    override fun startengine() {
//        println("Audi engine's start")
//        super.startengine()
//    }
//}
//
//fun main(){
//  //  var bmwcar:BMWCar = BMWCar()    // creating an object of BMWCar and also calling its constructor
//
//    var bmwcar:vehicle = BMWCar()   // creating an object of Parent class vehicle and also calling its constructor
//    start(bmwcar)
//
//    var audicar:vehicle = AudiCar()
//    start(audicar)
//
//}
//fun start(car:vehicle){
//    car.startengine()
//}
//
//
//

// ************* Another example of Inheritance *****************

//open class Vehicle(val type:String){
//    open val year: Int=2001
//
//    init{
//        println("Vehicle")
//    }
//    fun yearPrinter(){
//        println(year)
//    }
//}
//class Car(type:String, override val year:Int): Vehicle(type){
//    fun printer(){
//        println(super.year)  // in this line, we are inheriting the year variable of the parent class, i.e 2001
//        super.yearPrinter() // this line will print the year 2019
//    }
//}
//fun main() {
//    val obj:Car=Car("SUV",2019)
//    obj.printer()
//}
