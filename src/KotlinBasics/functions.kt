package KotlinBasics

fun main(){

    defaultFunctions("Sachin")

    defaultFunctions()

    namedArguments(customerName = "Sachin Sharma", Drinks = "HotNescafeCoffee" , age = 20, millileters = 100  )

    println(singleExpressionFunc())
    println(singleExpressionFunc(3))


}

// In default functions a default value is given to ensure it use the default value in the case, if any value is not provided or passed
fun defaultFunctions(userName : String = "myDearUser"){
    println("Hii $userName")
}

// In the functions who have named arguments means Function call karte waqt parameters ko naam se specify kar sakte ho, chahe order kuch bhi ho.
// helps in increasing the readability + when we do not have an idea of sequence for parameters declared
fun namedArguments( customerName : String, age : Int , Drinks : String = "notChosen" , millileters: Int , Snack: String = "Chips'" , noOfSnacks: Int = 2 ){
    println("Name: $customerName \n Age: $age \n Drinks: $Drinks \n amount (in ml) $millileters ml \n Snack: $Snack \n No. of Snacks: $noOfSnacks packs" )
}

//Jab function ka kaam sirf ek line ka ho, tab pura {} block likhne ki zaroorat nahi.
//Sirf = lagake ek line me likh sakte ho.
fun singleExpressionFunc()  = listOf(1,2,3,4,5,7)
fun singleExpressionFunc(x: Int = 2) = x+x;

/*Feature          | Java                                       | Kotlin
Default Arguments  | Nahi hote (method overloading karna padta) | Direct supported with = value
Named Arguments    | Nahi hote                                  | Direct supported
Single-Expression  | Normal methovvd likhna padta { return      | Ek line me fun ke baad = expression likh sakte ho
                        value; } format   */