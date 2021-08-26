// 1) HIGH ORDER FUNCTIONS
// 2) Passing the function to a function as argument
// 3) Return the function from a function
// 4) Lambda's
// 5) Anonymous functions
// 6) Inline functions



// high order function declaration and types-1 ( we will store a function into a variable and declare the function )


//fun main(){
//    //regular function
//    // f1 is a variable which stores a function who take two integers as an argument and returns an integer
//
//    var f1: (Int, Int) -> Int
//
//    val f2: (Int, Int) -> Boolean
//    //minimal signature
//    val f0: () -> Unit
//    //nullable
//    val f3: ((String) -> Int)?
//
//    //assignment
//    //declared function
//    f1 = ::addInt
//    //function literals
//    //lambda
//    f2 = {x: Int, y: Int -> x > y}
//    //anonymous function
//    f3 = fun(s: String): Int { return s.length }
//
//
//    //invoke
//    f1(2, 4)
//    f2(6, 5)
//    f3("Mark")
//}
//
//fun addInt(x: Int, y: Int): Int{
//    return x+y
//}


// ********************************************************


//function type-2 ( we will pass a function to function and also return a function from a function )

//fun getSum(x: Int, y: Int): Int{
//    return x + y
//}
//
////higher order function
//fun performOperation(x: Int, y: Int, fn: (Int, Int) -> Int){
//    val result = fn(x, y)
//    println("Result of $x and $y is: $result")
//}
//
// returns a function

//fun getLength(): (String) -> Int{
//    return {x: String -> x.length} //return a function named x of type String->Int ( take String and return Int )
//
//}
//
//fun main(){
//    //pass function as parameter
//    performOperation(2, 4, ::getSum)
//
//    performOperation(8, 1, {x, y -> x - y}) // passing a lambda function
//
//    performOperation(7, 6, fun(x: Int, y: Int): Int = x * y)  // passing an Anonymous function
//
//    val f: (String) -> Int = getLength()
//    println("Length is: ${f("Mark")}")
//}


// ********************************************************



//function type-3

//TYPE ALIAS
// Need to be declared at top level
// They don't create a new type.
//They just act like a global variable for any function type
// Not only for function type but for any type
//typealias intFn = (Int, Int) -> Int
//typealias str = String
//
//fun printSum(x: Int, y: Int, fn: intFn){
//    val sum = fn(x, y)
//    println("Sum of $x and $y is: $sum")
//}
//fun main(){
//
//     //printSum(2,3,fun(x:Int, y:Int):Int = x+y )  //passing a anonymous function
//
//     //printSum(2,3, {x,y->x+y} ) // passing a lambda expression
//    var f2 = {x:Int, y:Int->
//        println(x)
//        2*x
//    }
//    println(f2(8,4))
//
//    val f3 :(String)->Int = {x:String->x.length}
//    //or
//    //val f3 :(String)->Int = {it.length}
//
//    println(f3("Tarun"))
//}

//*************************************************
//return from a lambda

//inline fun printSum(fn: (Int?, Int) -> Unit){
//    val x = null
//    val y = 7
//    fn(x, y)
//    println("Done with printSum() function")
//}
//
//fun main() {
//    printSum {x: Int?, y: Int ->
//        if( x == null){
//            //first show inline but that will return from main
//            // then show @printSum
//            return
//
//        } else{
//            println("Sum of $x and $y is: ${x + y}")
//        }
//    }
//    println("Done")
//}

//Fact is that these notations( lambda and anonymous ) can be used interchangeably, but it is better to use anonymous functions
// when we need to use return more than once. Lambda expression should be preferred for small functions with
// single expression.


//********************************************
//INLINE FUNCTIONS

// Used for reified type, lambda return and to prevent runtime overhead
// inline to avoid overhead due to creation of an object
// if lambda is a closure then a new instance is created else singleton
// caveat: don't inline bigger functions. minimize the code to lambda usage
// inline functions can't access non public members of a class
inline fun performOperation(name: String, fn: (String) -> Unit){
    fn(name)
}

fun main(){
    val name: String = "John"
//here we have passed an
     performOperation(name) { println(name) }

    //println(name)
}










