package classesInKotlin

/*✅Data class
You only need to store and pass data (no big logic).
You want built-in functions like toString(), equals(), copy(), etc.
You're creating model classes for things like:
API responses
User profile info
Product, Order, Chat message, etc.*/


data class Person(val name: String ,  val age: Int) // data class

fun main() { // Accessing the data class
val person1 = Person("Sachin", 20)
val person2 = Person("Sachin", 20)

    println(person1 == person2) // returns true as the contents are the same in both the variable
    println(person2)

    val  person3 = person1.copy(name = "Naman"); // copy the content of the other class, using the internally override copy functions.
    // if we want then we can modify some changes too if needed!
    println(person3)

}
// In real world app dev it is mostly used in 'Data mapping' from the database

/*No need to write boilerplate for getters, setters, equals(), etc.
Just holds data – simple and clean.*/
/*🧠 Quick Trick to Remember:
If the class is just for holding data, use a data class.
If it needs behavior (functions), use a normal class.*/

/*
In Kotlin, a data class automatically overrides the equals(),
hashCode(), and toString() functions. This means that when you
compare two data class objects using ==, it compares their values,
not their memory references. It also provides a readable string
output when printed, and generates a consistent hash code based
on its properties—useful for using objects in collections like sets or
maps. Additionally, it generates helper functions like copy() for cloning
with changes, and componentN() functions for destructuring.

*/
