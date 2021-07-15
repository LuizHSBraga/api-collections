package one.digitalinnovation.collections

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1560".toBigDecimal(),
        "4360".toBigDecimal()
    )

    println("-----------------------------------------------------------")
    println(salarios.somatoria())

    println("-----------------------------------------------------------")
    println(salarios.media())

}