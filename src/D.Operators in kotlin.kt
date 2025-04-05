fun main(){
    //🔹 5 Basic Operators in Kotlin 🚀
    //Kotlin supports the same fundamental operators as Java, categorized into arithmetic, relational, logical, assignment, and bitwise operators.

/*✔ Arithmetic (+ - * / %) → Basic math
✔ Relational (== != < > <= >=) → Comparisons
✔ Logical (&& || !) → Boolean logic
✔ Assignment (= += -= *= /= %=) → Updating values
✔ Increment & Decrement (++ --) → Increase or decrease by 1
✔ Concatenation (+) → Joining strings*/

    //🔹 Key Differences Between Kotlin & Java

    val name = "Sachin"
    val message = "Hello, " + name
    println(message) // Output: Hello, Sachin

// Java Equivalent
// String name = "Sachin";
// String message = "Hello, " + name;
// System.out.println(message); // Hello, Sachin

    //✅ Works the same in Java & Kotlin, but Kotlin prefers string interpolation ("$var")
// ✔ String Interpolation → A way to insert variables inside strings without using +.

    val name1 = "Sachin"
    println("Hello, $name1") // Output: Hello, Sachin

//2️⃣ Increment & Decrement (++ --)


    var num = 5
    num++
    println(num) // Output: 6

// Java Equivalent
// int num = 5;
// num++;
// System.out.println(num); // 6

    //✅ Same behavior in Java & Kotlin, but Kotlin does not allow modifying val variables.

    val num1 = 5
// num1++ // ❌ ERROR: Val cannot be reassigned

//3️⃣ Equality Check (== vs ===)
    val str1 = "Hello"
    val str2 = "Hello"
    println(str1 == str2)  // true (Value equality)
    println(str1 === str2) // true (Reference equality, because of string interning)

// Java Equivalent
// String str1 = "Hello";
// String str2 = "Hello";
// System.out.println(str1.equals(str2)); // true (Value equality)
// System.out.println(str1 == str2);      // true (Reference equality due to string pool)

   // ✅ In Kotlin, == checks value equality (like .equals() in Java).
   // ✅ === in Kotlin checks reference equality (like == in Java for objects).

    //4️⃣ Explicit Type Conversion is Required in Kotlin

    val a: Int = 10
    val b: Long = a.toLong() // Explicit conversion required

// Java Equivalent
// int a = 10;
// long b = a; // Implicit widening, no need for conversion

//🚨 Kotlin does not allow implicit widening conversions like Java does.


  /*  🔹 Summary of Differences
    ✔ Concatenation (+) → Same, but Kotlin prefers string interpolation ("$var").
    ✔ Increment/Decrement (++ --) → Same behavior, but val cannot be modified in Kotlin.
    ✔ Equality (== vs ===) → == checks value equality, === checks reference equality (like == in Java).
    ✔ Type conversion → Kotlin requires explicit conversion, while Java allows implicit widening.

    ✅ Most operators work the same, but Kotlin improves safety & clarity! 🚀
*/










}