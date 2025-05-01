package KotlinBasics

fun main() {

    val person = Person()
    person.initializeName()  // Initializing name
    println(person.name)  // Output: John Doe

    // nullable type in kotlin, -> we simply have to put '?' next to the type of the variable, to declare it nullable

    var name: String? = null
    println(name) // will not through null-pointer exception, because it is handled by '?' null type declaration
    name = "Sachin"
    println(name)
}

class Person {
    lateinit var name: String  // Declared with lateinit

    fun initializeName() {
        name = "John Doe"  // Initialized later
    }
}
/* Kotlin's 'lateinit': 'lateinit' is used in Kotlin for late initialization of non-nullable mutable properties.
It allows properties to be initialized later, after object creation.
Basic Example in Kotlin:
Key points:
It can only be used with var (not val).
Must be a non-nullable type.
lateinit is used to avoid initialization at the time of declaration.*/


// In java this is done without any separate keyword, ->private String name;

