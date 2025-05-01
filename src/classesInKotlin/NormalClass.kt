package I  // package same as java

/*✅ Normal classes are used when:
You need to combine data and behavior (logic and functions).

You want to create multiple objects with different values.

You need inheritance, overriding, or complex structure.

You’re building Android components like Activities, Fragments, Managers, etc.

You want a class that’s testable and reusable in different parts of the app.*/


/*
🔍 Explanation:
class Car → defines a normal class.

    (val brand: String, val year: Int) → primary constructor.

drive() and info() → normal member functions.
myCar → is an object created using the class.

*/


class Car(val brand: String, val year: Int) {

    fun drive() {
        println("$brand car is driving!")
    }

    fun info() {
        println("Brand: $brand, Year: $year")
    }
}
fun main() {
    val myCar = Car("Toyota", 2022)
    myCar.drive()
    myCar.info()
}

//✅ Use normal classes for most parts of your app — they’re versatile, reusable, and form the backbone of clean architecture.