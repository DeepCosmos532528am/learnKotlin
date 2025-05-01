package classesInKotlin

//A singleton is defined using the object keyword instead of class. This creates a single, globally accessible instance automatically — you don’t need to use new or manage instantiation.
object Database {
    fun connect() {
        println("Connection Succeed!")
    }
}
fun main(){
  Database.connect()
}
// Mostly used in database interaction, like in firebase
//class and its single object is created at once.
//No constructor is allowed (init block is allowed).
//singleton pattern.
//can inherit interface / class


// In Kotlin, singleton objects declared using the object keyword can have visibility modifiers like private, protected, internal, or public (default).

/*🔹 Key Properties of Kotlin object (Singleton):
Only one instance is created (automatically thread-safe)

You can't instantiate it using NetworkManager() — it's already available

Can have properties, methods, init blocks

Great for utility classes, services, or shared resources (e.g., database manager, logger)

*/