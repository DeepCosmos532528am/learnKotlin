package NullSafteyInKotlin

fun main(){
    val number: Int? = 3
    number?.let{ //let block
        println("The number is ${it + 2}")
    }
}

/**
 * This is 'let' block in kotlin, use for providing null safety
 * The let block only executes if there is non-null value in the targeted object.
 */
