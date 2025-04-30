/**
 * The `main` function serves as the entry point of the program. It demonstrates the use of various Kotlin
 * language features, such as user input handling, loops, conditional statements, and the `when` expression.
 *
 * Key functionalities include:
 * - Reading an optional integer from the user via the console.
 * - Using a `for` loop to iterate over a range of integers and print each number.
 * - Showing the use of different loop constructs in Kotlin via comments.
 * - Implementing a `when` expression to check the validity of user input and execute appropriate logic.
 *   - If the input is null or invalid, a message is displayed to the user.
 *   - If the input is valid, a multiplication table for the entered number is computed using a `repeat` loop and displayed.
 */
fun main() {
    val table = readLine()?.toIntOrNull()

    // Types of loops in Kotlin:

    //1. for loop in kotlin
    for (i in 0..9) {
        println("Number: $i")
    } // Explore more versions of it

    //* 2. while loop
    var a = 0
    while (a < 10) {
        a += 1;
        println("while" + a);
    }
    //3. do-while loop
    var b = 0;

    do {
        println("do while: $b")
        b += 1;
    } while (b < 10)


// 4. repeat
    repeat(3) {
        println("Repeat" + it)
    }


    // 5. forEach
   val fruits = arrayOf("Apple", "Orange" , "Banana", "Watermelon")
    fruits.forEach{
        fruit -> {
        println("The fruits are : $fruit")
    }
    }

    // explore more version of it

    // Method 1: Using for-in loop
    for (fruit in fruits) {
        println(fruit)
    }

    // Method 2: Using forEachIndexed when you need the index
    fruits.forEachIndexed { index, fruit ->
        println("$index: $fruit")
    }


}