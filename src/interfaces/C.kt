package interfaces
//Interface conflict happens when a class implements multiple interfaces that have the same method signature (especially default methods with body).
// Kotlin doesn’t know which one to use, so the class must override the method to resolve the conflict manually.

// solving conflict below

// First interface with the default method
interface A {
    fun greet() {
        println("Hello from A")
    }
}

// Second interface with the same method name and default body
interface B {
    fun greet() {
        println("Hello from B")
    }
}
// Class implementing both interfaces A and B

class C : A, B {
    // Conflict: Both A and B have greet() with body
    // Must override to resolve conflict
    override fun greet() {
        // We can choose to call either or both
        println("Resolving conflict by combining both:")
        super<A>.greet()  // Call greet() from interface A
        super<B>.greet()  // Call greet() from interface B
    }
}
fun main(){
    val obj = C()
obj.greet()
}