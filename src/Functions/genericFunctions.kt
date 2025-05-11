package Functions

fun main(){
    anyData("Sachin")
    anyData(2)
}
//Generic type function (the func. that can work with any type of data)
fun <T> anyData(data :T){ // <T>  ensures
    println("Data is: $data")
}/*In Kotlin, <T> in a generic function means you're writing a function that works with any type, and T acts as a placeholder for that type.
<T> before the function name means "this function is generic with type T".
T is not a fixed type like Int, String, etc. — it becomes whatever type is passed when calling the function.*/
