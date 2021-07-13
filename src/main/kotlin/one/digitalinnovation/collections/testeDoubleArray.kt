package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 1500.00
    salarios[2] = 1750.00

    salarios.forEach {
        println(it)
    }
    println("-----------------------------------------------------------")
    salarios.forEachIndexed{
            index, salario -> salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println(it)
    }
    println("-----------------------------------------------------------")

    val salarios2 = doubleArrayOf(7500.0,3980.8,1650.0)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }

}