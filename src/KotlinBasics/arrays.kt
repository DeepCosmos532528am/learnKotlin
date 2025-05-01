package KotlinBasics

fun main(){
    var integerArr = arrayOf( 1, 2, 3, 4, 5 );
    var stringArr = arrayOf("Sachin", "Ram", "Naman")
    var mixedArr = arrayOf( "Sachin", '*' , "Ram", 1, 'a', 8)

    // used different ways to print arrays, not any conceptual thing for doing this
    // just practicing diff loops, so don't take it with the learning vision

    println("Integer array")
    integerArr.forEach{
        println(it)
    }

    println("String array")
    for(strArr in stringArr){
        println(strArr)
    }


    println("Mixed array")
    mixedArr.forEachIndexed { index,value ->
        println("$index -> $value")
    }
}