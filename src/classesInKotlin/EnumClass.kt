package classesInKotlin


// Enum class: used for defining the constant values
enum class WeekDays {
Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday // So these are the constants
}

//Accessing
fun main(){
    var weekDays = WeekDays.Monday
    println(weekDays)
}