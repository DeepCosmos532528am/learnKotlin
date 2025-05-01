package KotlinBasics

fun main () {
    var name: String? = readln()
    println(name)
}
/**
 *readLine() reads a line of input from the console
 *It always returns a nullable String?
 *You may need to handle null or convert types
 *
 * Use !! if you're sure it's not null
 * Use ?.toIntOrNull() for safe conversion
 *
 * Function   ->	Description
 * readLine() ->	Reads input from user as String?
 * !!.toInt() ->	Converts to Int (crashes if null)
 * ?.toIntOrNull() ->	Safely converts to Int or returns null
 *
 * */
