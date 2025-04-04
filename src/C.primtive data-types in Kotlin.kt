fun main(){
    /* 🔹 Kotlin Primitive Data Types
    Kotlin has eight primitive types, just like Java, with the same memory size and range because it runs on the JVM.*/

    //  1️⃣ Integer Types

    /* Type	Size	Range	Example
Byte	1 byte (8 bits)	-128 to 127	val a: Byte = 100
Short	2 bytes (16 bits)	-32,768 to 32,767	val b: Short = 30000
Int	4 bytes (32 bits)	-2,147,483,648 to 2,147,483,647	val c: Int = 2000000000
Long	8 bytes (64 bits)	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807	val d: Long = 9000000000000000000L
*/
    /*🔹 Key Points
✔ Same as Java in terms of memory and range.
✔ Long requires L suffix: val x = 1000L
✔ No implicit widening conversion (e.g., Int to Long needs toLong()).*/

   // ✔ 1️⃣ No Implicit Type Widening

   // java allows:
   // int x = 10;
   // long y = x;  // ✅ Implicit widening

// Kotlin requires explicit conversion:
    val x: Int = 10
    val y: Long = x.toLong()  // ✅ Required


    // 2️⃣ Floating Point Types

   /* Type	Size	Range
    Float	4 bytes (32 bits)	±1.4E-45 to ±3.4028235E38
    Double	8 bytes (64 bits)	±4.9E-324 to ±1.7976931348623157E308
   */

    /*🔹 Key Points
✔ Float requires f suffix: val x = 3.14f
✔ Double is default for decimals in Kotlin: val y = 3.14 (treated as Double).
✔ More precise calculations should use Double.
    */

    val pi: Float = 3.1415f
    val e: Double = 2.7182818284

    //3️⃣ Character Type

    /*Type         	Size	         Range
     Char	2 bytes (16 bits)	Unicode '\u0000' to '\uffff'

🔹 Key Points
✔ Represents single characters like 'A', '9', or '!'.
✔ Uses UTF-16 encoding (same as Java).
✔ Cannot be used as numbers (unlike Java).*/

    val letter: Char = 'A'
    val symbol: Char = '\u2764' // Unicode heart ❤

    //4️⃣ Boolean Type
 /* Type          Size	                Values
  Boolean	1 byte (JVM-dependent)	true or false

🔹 Key Points
✔ Only holds true or false.
✔ Used in conditions */

    val isActive: Boolean = true
    if (isActive) println("Active!")

    // 📌 5️⃣ Unsigned Integer Types (Kotlin-Only)
    /*Kotlin introduces unsigned types, which Java does not have.

Type	Size	Range
UByte	1 byte (8 bits)	0 to 255
UShort	2 bytes (16 bits)	0 to 65,535
UInt	4 bytes (32 bits)	0 to 4,294,967,295
ULong	8 bytes (64 bits)	0 to 18,446,744,073,709,551,615
*/

    val positive: UByte = 255u
    val largeNumber: UInt = 4000000000u

    //✅ Unsigned numbers must have u suffix!


    //🔹 Key Differences from Java:

    //✔ 2️⃣ Type Inference

    // In java
     /*int x = 10;  // Must specify type*/

    // In kotlin
    val z = 10  // Automatically an Int

    //✔ 3️⃣ No char to int Conversion

    // In java
    /*
    char ch = 'A';
int num = ch;  //Output: ✅ Allowed (ASCII value)
  */
    // In kotlin
    val ch: Char = 'A'
    val num: Int = ch.code  // ❌ Direct conversion not allowed

    //✔ 4️⃣ Boolean Is Not int

    /*boolean flag = true;
  int num = flag ? 1 : 0;  // ✅ Allowed
      */

    // In kotlin
    val flag: Boolean = true
    val num1 = if (flag) 1 else 0  // ✅ Must use if-else

     //🔹 Memory Allocation of Primitives
/*On JVM, Kotlin optimizes primitives like Java:

Stored in stack if not nullable (Int, Double, etc.).

Stored in heap if nullable (Int?, Double? → Uses Integer, Double wrapper classes).*/

    val x1: Int = 10    // Stored as primitive
    val y1: Int? = 10  // Stored as Integer (heap)

//🔹 Summary
/*✔ Same memory size & range as Java
✔ Requires explicit widening conversion
✔ Type inference reduces verbosity
✔ No implicit char → int conversion
✔ Boolean is strictly true/false, not 0/1
✔ Supports UByte, UShort, UInt, ULong (unlike Java)
 🚀*/

}