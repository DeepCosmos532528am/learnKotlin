package KotlinBasics

fun main(){

    var a:String? = null  // '?' used here is called the nullable indicator.
    println(a ?:"The input might be null!") // '?:' is called elvis operator , the code after the ?: will get executed if the
    // a = null , or its input is null
    var length = a?.length // ?. it's null safety operator , it makes sure that the length of a  should only be stored in the variable length when a is not equal to null or the input of the a is not null
    //. If the input of 'a' is null then the 'null' will get stored into the length variable here , its type will be depended on what the expression will result in non-null condition , like here
    // in the case of length variable it will store Int type value as the expression here in not-null case is Integer
    println(length)

    val email : String = readLine()!!; //'!!' operator gives the assurance that the input will not be null , in this case if the input
    println(email)

    // we can handle null values through the use of if-else , and many more other ways

    //In type declarations, you only use '?' (for example, String?) to indicate that a variable is nullable. The other operators
// (?., !!, and ?:) are reserved for expressions, not for declaring types.

}