import javax.swing.text.Highlighter

fun main() {
    println("Hello World!")

    // val corresponds to immutable ( They cannot change their value )
    // var corresponds to mutable ( they can change their value )

    //null safety is a feature of
    //whenever we assign a datatype a NULL value, then we have to put a ? after it to make that variable of nullable datatype
    val naam : String? = null

    //safe call operator ( ?. ), it returns null when the length value of the variable is null
    println(naam?.length)

    // Elvis operator ( ?: ), it evaluates its left side expression and if that is null, it gives the value present at its right hand-side
    println(naam?.length ?: 0 )

    //if the variable is nullable type then only two operators can be used, " ?. " and " !!. "
    printnamelength("John", null)
    printnamelength("Tarun", "bidaliya")

    //type conversion
    val a = 2
    val b: Long=a.toLong()
    println(a)
    println(b)

    //type casting ( convert a value from one datatype to another datatype. Typecasting can only be done between two similar data types, otherwise will show ERROR)
    val name:Any = "John"
    val name1:String = name as String
    println(name1)

    val name2 = name1
    println(name2)
    val x : Int = 7
    //val y : Long = x as Long    //show error because type casting can be done between similar datatypes
    //println(y)

    //to resolve this, we have to use safe cast operator, if anything goes wrong, it will print NULL
    val z:Long? = x as? Long
    println(z)

    //functions ( whenever we have to pass any argument to a function, either we can pass its value directly or we can pass its "name = value" )

    addnumbers(x = 10, y = 12)

    println(name( "Tarun",length = 1))

    //Strings and arrays

    //String concatenation using +
    val myname:String =  "Tarun "+"bidaliya "+22
    println(myname)
    val flatnumber : Int= 23
    val address:String = "House no. $flatnumber " // (here dollar $ is a placeholder ( if we want to use a value of a variable then we use $ )
    println(address)

    println("Name is $myname of length ${myname.length}")

    //Arrays

    val arr = arrayOf(1,2,3,4,5)   // var arr : Array<Int> = arrayOf(1,2,3,4,5) // Declaration of array

    println("${arr[0]}, ${arr[1]}, ${arr[2]}")
    arr[2]=5
    println(arr.joinToString(",")) // this operator will print the array elements separated by commas.

    val arr1 = intArrayOf(1, 2, 3, 4, 5) // this is the primitive datatype declaration of integer array
    print("arr1 is: - ")
    println(arr1[2])

    val arr2  = IntArray(5) { it } // "it" is called initializer. In this way we can construct with size of 5 and fill with its index
    print("arr2 is: - ")
    println(arr2.joinToString(","))

    val arr3 = Array<String>(5){"$it"}
    print("arr3 is: - ")
    println(arr3.joinToString(","))


    //Various Declaration of arrays ( https://stackoverflow.com/questions/31366229/how-to-initialize-an-array-in-kotlin-with-values )
    var N = 10
    // Array of integers of a size of N
    val arr23 = IntArray(N)

    // Array of integers of a size of N initialized with a default value of 2
    val arr234 = IntArray(N) { 2 }

    var Arr1 = arrayOf(1,10,4,6,15)
    println(Arr1.joinToString(","))
    var Arr2 = arrayOf<Int>(1,10,4,6,15)
    println(Arr2.joinToString(","))
    var Arr3 = arrayOf<String>("Surat","Mumbai","Rajkot")
    println(Arr3.joinToString(","))
    var Arr4 = arrayOf(1,10,4, "Ajay","Prakesh")
    println(Arr4.joinToString(","))
    var Arr5: IntArray = intArrayOf(5,10,15,20)
    println(Arr5.joinToString(","))

    // Conditionals ( if else statement )
    val price = 30
    var discount: Any? = null
    discount = if ( price>40) 10 else 0
    println(discount)

// when statement ( it is like switch case in C++ )

    val rating = 4
    val result = when(rating){
        5-> "High"
        3,4 -> "Good"
        1,2 ->"Poor"
        else-> {
            println("No Rating")
            "Zero"
        }
    }

    println("The rating is $result")

    // For and while loop
    print("The line 1 is: ")
    for ( i in 1..5){ // for i in-range of 1 to 5
        print(i)
    }
    println()
    print("The line 2 is: ")
    if ( 4 !in 1..5) println("Not there") else println("Present")

    print("The line 3 is: ")
    for ( i in 1 until 5){
        print("$i ")
    }
    println()
    print("The line 4 is: -")
    for (i in 1 until 5 step 2){
        print(i)
    }
    println()
    print("The line 5 is: -")
    for (i in 5 downTo 0 step 2 ){
        print (i)
    }

    // forEach loop ( The forEach loop works better for collections whereas, the for loop gives better results with int ranges. )
    // we cannot use "continue" and "break" statements with the "forEach" loop.

    val strings= arrayOf("Tarun", "Bidaliya")
    strings.forEach {
        println("Name is $it and its length is ${it.length}")
    }

    //List
    val names1 = listOf("John", "Mark", "Sarah", "Finn")
    println("1. The size of the list is: ${names1.size}")
    println("2. The second item in the list is: ${names1.get(1)}")
    println("3. The second item in the list using index operator is: ${names1[1]}")
    println("4. Finn is at the index ${names1.indexOf("Finn")} in the list")
//    names.add("Sarah")

//MutableList
    val names2 = mutableListOf("John", "Mark", "Finn")
    names2.add("Sarah")
    println(names2)
    names2.removeAt(1)
    names2.remove("Mark")
    println(names2)
    names2.set(0, "Michael")
    names2[1] = "James"
    println(names2)
    names2.clear()
    println(names2)

//Set
    val names3 = setOf("John", "Mark", "Finn")
    println("1. The size of the Set is: ${names3.size}")
    println("2. Set contains ${names3.contains("Finn")}")
    //names.add("Sarah")

//MutableSet
    val names = mutableSetOf("John", "Mark", "Finn")
    names.add("Mark")
    println(names)
    names.remove("John")
    println(names)

//Map
    val classRanks = mapOf(1 to "Sarah", 2 to "Mark", 3 to "Finn", 4 to "John")
    println("1. Students: ${classRanks.values}")
    println("2. Ranks: ${classRanks.keys}")
    println("3. Finn has got a rank ${classRanks.containsValue("Finn")}")
    println("4. There is a 4th rank ${classRanks.containsKey(4)}")
    println("5. The student at first rank is: ${classRanks.get(1)}")
    //classRanks.put(5 to "Jim")

//MutableMap
    val classRanks2 = mutableMapOf(1 to "Sarah", 2 to "Mark", 3 to "Finn", 4 to "John")
    classRanks2.put(4, "Jim")
    classRanks2.remove(2)
    println(classRanks2)


    // we can use FILTER function to filter out some elements based on the expressions inside the curly braces.
    val integers = arrayOf(1,-2,3,-4,5,-3,-6,-1)
        println(integers.filter {
            it > -3
            it <1
        })



}

fun printnamelength ( firstname: String? , lastname: String?){
    if ( firstname!= null) println("Name :${firstname.length} ${lastname ?.length}")
}

fun addnumbers(x:Int, y:Int){
    println(x+y)
}
fun name(firstname :String, length: Int ) : String = firstname + length