package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(8,7,4,15,20,17,30)
    values.forEach {
        println(it)
    }
    println("-----------------------------------------------------------")
    values.sort()
    values.forEach {
        println(it)
    }


}



