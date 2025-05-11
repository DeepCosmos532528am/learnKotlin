package KotlinBasics

fun main() {
    lateinit var name: String  // Declared with lateinit
    fun initializeName() {
        name = "John Doe"  // Initialized later
    }
}
/**
 * Kotlin's 'lateinit': 'lateinit' is used in Kotlin for late initialization of non-nullable mutable properties.

 * It allows properties to be initialized later, after object creation.

 * Key points:

 * It can only be used with var (not val).

 * Must be a non-nullable type.

 * lateinit is used to avoid initialization at the time of declaration.

 * In Java this is done without any separate keyword, like ->private String name;
*/
