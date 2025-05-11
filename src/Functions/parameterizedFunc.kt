package Functions


// Like Java, here main is the entry point function of the program
fun main (){
    defaultFunctions("Sachin")
    defaultFunctions()
    namedArguments(customerName = "Sachin Sharma", Drinks = "HotNescafeCoffee" , age = 20, millileters = 100  )

}
//Parameterized function

fun defaultFunctions(userName : String = "myDearUser"){
    println("Hii $userName")
}/** In default functions a default value is given to ensure it use the default value in the case if any value is not provided or passed*/


fun namedArguments( customerName : String, age : Int , Drinks : String = "notChosen" , millileters: Int , Snack: String = "Chips'" , noOfSnacks: Int = 2 ){
    println("Name: $customerName \n Age: $age \n Drinks: $Drinks \n amount (in ml) $millileters ml \n Snack: $Snack \n No. of Snacks: $noOfSnacks packs" )
}
/**
 * In the functions who have named arguments means Function call karte waqt parameters ko naam se specify kar sakte ho, chahe order kuch bhi ho.
 * helps in increasing the readability + when we do not have an idea of a sequence of parameters declared
*/
