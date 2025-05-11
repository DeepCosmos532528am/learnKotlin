package NullSafteyInKotlin

fun main() {
//There are 4 main operators to handle null safety in Kotlin
    //  1st -> Safe Call Operator (?.) (mostly used operator in kotlin or development
    // it checks nullability of the variable and prints null, if the variable is really 'null'
    val name: String? =
        "Sa" // here '?' means like telling Kotlin that “Hey Kotlin, variable name can possibly be null.”
    //So Kotlin allows to assign null to name.
    println(name?.length)  // here '?.' tell kotlin “If name is not null, then get the length.
    //If it’s null, just return null and don’t crash.”


    //  2nd -> Elvis Operator (?:)
    val name1: String? = null //here, you know what is happening!
    val length = name1
        ?: 0 // here it tells kotlin that if the name is not the null then print length (LHS) of '?:' if it's the null then print 0 (RHS)
    println(length) // prints 0


    //  3rd -> Safe Cast Operator (as?)
    // used to safely cast variable to the targeted type

    val obj: Any? = 8
    val str: String? = obj as? String //Check before converting to String, if it's null or type mismatch, it will print null safely, if not the null  then will successfully do the assigned work
    println(str) // prints "Learn Kotlin",


    //  4th -> Non-null Assertion Operator (!!)
       val name2: String? = null // when you intentionally want to through error, then use this
        println(name2!!.length) // Throws NullPointerException


}



