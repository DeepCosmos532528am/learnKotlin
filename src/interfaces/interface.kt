package interfaces

/**
 *  1. What is an Interface?
 * An interface is like a contract — it defines what a class must do, but not how.
 * It contains method signatures (with or without body), and classes that implement the interface must follow the contract.

 */
fun main(){
    val service = EmailService()
    service.mustOverride()       // Output: Sending an email...
    service.optionalOverride()   // Output: This is default
    val profile = Email()        // Create an object of the Email class
    profile.showProfile()        // Calls the inherited method from the interface
                                 // Output: Show Profile
}
/**
In Kotlin, all methods declared in an interface are abstract by default, meaning the implementing class must override them.
However, if a method in the interface includes a body, it becomes a default method, and overriding it becomes optional.
This allows the implementing class to either use the default behavior or provide its own. This feature helps in extending
interfaces without breaking existing code.
*/
interface MyInterface {
    fun mustOverride() // abstract
    fun optionalOverride() {  // default
        println("This is default")
    }
}
class EmailService : MyInterface {
    override fun mustOverride() {
        println("Sending an email...")
    }

    // optionalOverride() is inherited as-is, no need to override unless we want to customize it
}
interface showProfile{
    // Default method: It has a body, so any class implementing this interface can use it directly
    fun showProfile() {
        println("Show Profile")  // This line will run when showProfile() is called
    }
}
// A class named 'Email' implements the 'showProfile' interface

class Email : showProfile{
    // No need to override showProfile() here, because the method in the interface already has a body
    // The class automatically inherits the default implementation
}


/**
 *🔸 4. Why Use Interfaces?
 * To provide a common behavior (like click listeners, callbacks).
 *
 * To support loose coupling and flexible design.
 *
 * Used heavily in Android dev (RecyclerView, Listeners, etc.).
 *
 * */

/**In Kotlin, all methods in an interface are abstract by default, just like in Java. However, if you want to provide a method body in Kotlin, you can simply define the body directly inside the interface, without needing any special keyword. In contrast, Java requires the default keyword (since Java 8) to define a method with a body inside an interface.

This means:

✅ Both Kotlin and Java allow default method implementations in interfaces.

📝 Kotlin syntax is simpler — no default keyword needed.
 */