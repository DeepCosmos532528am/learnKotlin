package Functions

fun main(){
    println(greet())

}
// 'Unit return type' in 'kotlin' functions
fun greet() : Unit {
    println("Hello from Kotlin!")
    /*return 0; // will through compilation error*/

} //as here I have declared the return type as Unit, but this was not needed explicitly to declare it Unit type, the kotlin by default have Unit return type functions, if no return type is specified like, Int, String, etc/*
/*In Java, when a method doesn’t return anything, we use void.
Kotlin has something similar called Unit. It means “this function returns nothing useful”—just like void in Java.
But unlike void, Unit is actually a real object in Kotlin, so you can use it like any other type if needed.
Think of it as Kotlin’s polite way of saying: “I’m done, but I have nothing to hand back.”*/
