package classesInKotlin

sealed class Shape {

    class Circle(val radius: Double) : Shape() // inherits Shape class
    class Rectangle(val length: Int, val width: Int) : Shape() // inherits Shape class
    companion object {
        @JvmField
        var Circle: String = TODO("initialize me")
    }
}


fun printShape(shape: Shape) { // takes the parameter of type Shape, for eg Circle(someValue) , Rectangle(SomeValue, SomeValue)
    when (shape) { //here shape = ref to the object Shape.Circle()
        is  Shape.Circle -> println("Circle is with radius ${shape.radius}") // it matched because, Shape.Circle is really pointed by the reference which is tried to match with the options, so here it matched.
        is Shape.Rectangle -> println("Rectangle is with width ${shape.width} & ${shape.length}")
    }
}

fun main() {

    val circleSize = Shape.Circle(2.3) // here the object is created for the 'Circle' class, inherited from the sealed class 'Shape'; this object's reference is stored in the circleSize variable, with the radius parameter 2.5
    printShape(circleSize) // then the variable circleSize pass the reference of the object; the 'when' checks it whether the final input of type Shape is that when takes contain the defined options, If anyone is there, which matches the corresponding code is executed

    println(Shape.Circle(2.0).radius)// prints radius of the circle as the value that is passed got stored in the variable radius, that why only this has become possible to print the radius value

}