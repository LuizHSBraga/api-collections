package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1250.0,6549.0,3450.0)

    for (salario in salarios){
        println(salario)
    }

    println("-----------------------------------------------------------")
    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salario: ${salarios.average()}")

    println("-----------------------------------------------------------")
    val salarioMaiorQue1500 = salarios.filter { it > 1500.0}
    salarioMaiorQue1500.forEach{
        println(it)
    }

    println("-----------------------------------------------------------")
    println(salarios.count{it in 2000.0..5000.0})

    println("-----------------------------------------------------------")
    println(salarios.find { it == 1250.0 })
    println(salarios.find { it == 5000.0 })

    println("-----------------------------------------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 1250.0 })

}