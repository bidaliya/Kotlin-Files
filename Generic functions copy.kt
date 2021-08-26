import kotlin.collections.ArrayList as ArrayList

//fun<T, P> printcontent(content:T, value:P){
//println("The content is $content and value of $value")
//}
//
//fun main(){
//
//    printcontent<Int, String>(9, "Tarun")
//    printcontent<String, Int>("bidaliya", 22)
//
//
//}

//*****************************************

//class customClass<T> {
//    fun<T> customfunc(stringPar: T){
//        println(stringPar)
//    }
//}
//
//fun main() {
//    val obj= customClass<Double>()
//    obj.customfunc("Generics are fun")
//}

//***************************************** Generic Constraints

//upper bound Number
// multiple bound T:Number, T:Serializable
// show that we can have null as default upper bound is Any?

//fun <T:Number> printPrice(price: T){
//    println("The price is: $price")
//}
//
//fun main(){
//    printPrice<Int>(23)
//    printPrice<Double>(24.5)
//
//    printPrice<String>("John")
//
////    val price: Int? = null
////    printPrice(price)
//}


//Generics types are invariant: - which means that we cannot assign the complex generics types ( listOf, array ) to one another


//package generic

//open class fruit()
// class apple():fruit()
// class orange():fruit()
//
//class box<out T>{
//    fun get():T{
//        TODO("RETURN ITEM OF TYPE T")
//    }
//}
//
//fun main(){
//    val applebox : box<apple> = box()
//    var fruitbox : box<fruit> = applebox
//    fruitbox = box<orange>()
//
//   // var orangebox:box<orange> = applebox     // line of mismatch error
//
//
////    applebox = fruitbox
////    fruitbox = applebox
//}

//******** example of star projection

//fun acceptAnyArray(array: Array<out Any?>) {}
//fun acceptStarArray(array: Array<*>) {}
//
//fun main() {
//    val StringArray=arrayOf("Hello", "World", 1)
//    acceptAnyArray(StringArray)
//    acceptStarArray(StringArray)
//}


// ********** example of reified type

//show type is erased in runtime
// show reified

//inline fun <reified T> checkTypeAtRuntime(item: Any){
//    println("${item is T}")
//}
//
//fun main(){
//    val names: MutableList<String> = mutableListOf("John", "Sarah", "Mark")
//    val ages: MutableList<Int> = mutableListOf(1,2,3)
//
//    checkTypeAtRuntime<String>("John")
//    checkTypeAtRuntime<Int>("Sarah")
//}

