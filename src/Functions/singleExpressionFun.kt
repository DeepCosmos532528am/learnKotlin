package Functions

fun main(){
    println(singleExpressionFunc())
    println(singleExpressionFunc(3))
}
//Single expression functions
fun singleExpressionFunc()  = listOf(1,2,3,4,5,7)
fun singleExpressionFunc(x: Int = 2) = x+x;
/*Jab function ka kaam sirf ek line ka ho, tab pura {} block likhne ki zaroorat nahi.
Sirf = lagake ek line me likh sakte ho.
no curl brackets needed, */