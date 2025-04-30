fun main() {
    val table = readLine()?.toIntOrNull()

    when (table) {


        null -> println("oops!! Seems not entered any number! please do it first.")


        else -> {
            println("The table for $table is: ")
            repeat(10){
                println("$table * ${it + 1} = ${table * (it+1)},")
            }
        }
    }
}