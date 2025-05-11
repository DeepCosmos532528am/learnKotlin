package Functions

fun main(){

}
//Explicit return type functions
fun greetings() : Int {
    println("Hello from Kotlin!")
    return 0; // will not through compilation error, and mandatorily needed to return some value whose type matches to return type
    /*as here I have declared the return type as Int, this is needed explicitly to declare it Int type, as we are returning some int value, if no return type is specified like, Int, String, etc then no 'return 0' can be done*/
}
