fun main(){
// * Defining the variables , var and val
    var a = "Sachin" // mutable
    println(a) // leaves a line after
    print(a) // don't leaves line
    a = "Sharma" // can be reassigned
    println(a)

    val c = "Sachin" // immutable or unchangeable
    // c = "Sharma" throughs error on reassignment
    // acts as final keyword in Java



// * for Declaration first then initialization in Kotlin

    val b : Int // declaration
    b = 3       // Initialization
    //b = 4 // Cannot be reassigned as it is 'val' You already know bro!! ;)
    val b1 : Char
    b1 = 'a'
    val b2 : Short
    b2 = 3321
    val b3 : Float
    b3 = 3.2f
    val b4 : String
    b4 = "Hello !"

    var b5 = 2 // In this way declaring the type is auto - declared , on the basis of type of value initialized
   // b5 = 3.2f // through error because is type is integer

    var b6  : String
    b6 = "Hello !"
    b6 = "$b6 World!"
    println(b6)
    println(b)
    println("$b4 ,Sachin")
 // in kotlin the type is needed to be given when the variable is only declared at first but initialized later
    // another datatype value cannot be assigned in other



    /*In java this is done like:
    int a ;
            a = 2;
            System.out.println(a);*/

}