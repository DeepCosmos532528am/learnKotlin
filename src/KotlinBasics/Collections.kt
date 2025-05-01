package KotlinBasics

fun main()
{  // a way to print List
    println(mutableListOf<String>("Orange",  "Banana", "Keanu", "Pineapple")) //<String> stricts the List to store only string values , same way the things goes on in other types also
   // another way is by assigning to the variable
    val fruits =mutableListOf("Orange",  "Banana", "Keanu", "Pineapple", 1,'d',3.4f) // this is flexible, no strict rule on the type of data to store
    println(fruits)
    println(fruits.size)
    fruits.add("watermelon")
    fruits.remove("Keanu")
    println(fruits)
    fruits.add(2,"cherry")
    println(fruits) // and many more are there, explore them as well

    val grocery = mutableMapOf(1 to "rice" , 0 to "Oil", 3 to "Salt", 2 to "Sugar")
    println(grocery)
    println(grocery)
    println(grocery.get(3))
    grocery.remove(0)
    println(grocery)


}


/**
 * In Kotlin, collections are used to store and manipulate groups of data.
 * There are two main types of collections:
 *
 * 1. Immutable Collections (Read-Only)
 *    - List<T> -> Ordered collection (duplicates allowed)
 *    - Set<T> -> Unique elements (unordered)
 *    - Map<K, V> -> Key-value pairs (unique keys)
 *
 * 2. Mutable Collections (Modifiable)
 *    - MutableList<T> -> List with modification functions
 *    - MutableSet<T> -> Set with modification functions
 *    - MutableMap<K, V> -> Map with modification functions
 */