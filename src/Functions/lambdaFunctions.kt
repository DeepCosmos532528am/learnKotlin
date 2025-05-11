package Functions

fun main() {
    println(myName("Sachin"))
}

//Lambda function
var myName : (String) -> String = { "Hello $it" }
/**
1. var myName
This declares a variable named myName. Since it’s a var, its value can be changed later.

2. :(String)-> String
This tells Kotlin that myName will store a function.
That function takes one String as input, and returns String as output.

3. = { "Hello $it" }
This is the lambda expression (anonymous function) that you're assigning to myName.

4. Inside { "Hello $it" }
Kotlin uses it as the default name for the single argument in a lambda.

Here, "Hello $it" builds a string using that argument.
So if you pass "Sachin" as input, it becomes "Sachin", and it returns "Hello Sachin".
 */