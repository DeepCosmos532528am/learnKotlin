fun main() {
    var a = 20;
    var v = 10;
    var x = 15;
    //if else
    if (a > v) {
        println("$a is greater then v")
    } else {
        println("$v is greater then v")
    }
    // if -else ladder

    if (a > v) {
        println("$a is greater then $v")
    } else if (x > a) {
        println("$x is greater then $x")
    } else {
        println("$x is equal to then $x")
    }

    var phoneno = readLine()!! // by-defalut the readline takes input in String , to cinvert
    // the input in other type simply cast it using , .toInt , .toFloat etc
    phoneno += 1234567890
    println("The Phone no. is " + phoneno) // String concatenation
    //or
    println("The Phone no. is $phoneno") // String interpolation

    // diffrence in readline()!! and readline()

    //readline() - A function that takes user input and returns a nullable string (String?), which means it may return null without causing a crash.

    fun main1() {
        print("Enter your name: ")
        val name = readLine()  // nullable String

        if (name != null) {
            println("Hello, $name!")
        } else {
            println("No input provided.")
        }
    }

    /*🟢 Output (if user enters Sachin)
     Enter your name: Sachin
    Hello, Sachin!
     🟡 Output (if input is null — rare case, e.g. input stream closed):
    Enter your name:
    No input provided.
     */


    //  readline()!! - A function that forces the result of readLine() to be non-null (String) and throws a runtime exception if the input is null.

    fun main2() {
        print("Enter your name: ")
        val name = readLine()!!  // forcibly non-null

        println("Hello, $name!")
    }

    /*🟢 Output (if user enters Sachin):
 Enter your name: Sachin
Hello, Sachin!

 🔴 Output (if input is null):
Exception in thread "main" kotlin.KotlinNullPointerException
*/
//So bhai, readLine() is safe but needs null check, and readLine()!! is risky but direct. Use according to the situation.

//if expression in kotlin:

    /*🔹 Java me ternary operator ? : hota hai, jo short if-else ki tarah kaam karta hai.
   🔹 Java me 'if' ek statement hota hai, isse value return nahi hoti — direct variable me assign nahi kar sakte.
   🔹 Isiliye Java me ternary use hota hai:
   String result = (x > 0) ? "Positive" : "Negative";
   🔹 with the help of ternary operator we can assign the if else output into the vaiable directly like if expression do in kotlin
   */

    //java code with ternary operator : String msg = (age >= 18) ? "Adult" : "Minor";


    /*🔹 Kotlin me ? : ternary operator nahi hota.
🔹 Kyunki Kotlin me 'if' ko khud ek expression hi hota h — wo direct value return karta hai.
🔹 Isiliye Kotlin me likhte hain:

If expression works same as ternary operator does in java*/

    // kotlin code with if expression : val msg = if (age >= 18) "Adult" else "Minor"

    /*📌 Summary:

    Java needs ternary for inline conditions.

    Kotlin doesn't need ternary — if does the job.

    Kotlin syntax is cleaner and more expressive.

    Java me ternary ka main kaam hota hai — value ko variable me store karne ke liye ek short conditional likhna.
    Aur Kotlin me wahi kaam if expression se ho jata hai 😎
    */
    print("Enter your marks")

    var marks1 = readLine()!!.toIntOrNull() ?: 0
    var marks2 = readLine()!!.toIntOrNull() ?: 0
    val finalResult = when (marks1 + marks2) {
        in Int.MIN_VALUE..-1 -> "Invalid marks"
        in 0..65 -> "not passed"
        in 66..200 -> "Passed"
        else -> "Unknown"
    }
    println(finalResult)
    when (marks1 + marks2) {
        in Int.MIN_VALUE..-1 -> println("Invalid marks")

        in 0..65 -> "not passed"
        in 66..200 -> "Passed"
        else -> "Unknown"
    }
    println(finalResult)

    //  📝 Kotlin: when vs if-else

/*✅ Use 'if-else' when:
You are checking true/false conditions

You need to compare logical expressions

You are working with boolean logic (&&, ||, !)

Only 2–3 conditions are involved*/
    var age  = 20
    if (age >= 18) {
        println("Adult")
    } else {
        println("Minor")
    }

    /*✅ Use 'when' when:
You are matching against specific values or multiple cases

You are checking ranges or types

You want to replace a Java-style switch statement

You need cleaner syntax for multiple branches*/
    val marks = 98;

    val grade = when (marks) {
        in 90..100 -> "A"
        in 75..89 -> "B"
        in 60..74 -> "C"
        else -> "Fail"
    }

/*
🧠 TL;DR:
    Use     - 	When to Use
  if-else	-   Logical conditions (true/false)
    when    - 	Value matching, range checks, enums
    */

}

