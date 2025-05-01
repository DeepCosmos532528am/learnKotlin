package classesInKotlin

abstract class Animal {
   abstract fun makesSound ()
     fun doEat(){
         println("Eats Something")
    }
}


class Dog : Animal() {
    override fun makesSound() {"Bark!!"}
}


fun main (){
    Dog().doEat()
}