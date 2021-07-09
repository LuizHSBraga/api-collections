package one.digitalinnovation.collections

fun main(){
    val nomes = Array(5){""}
    nomes[0] = "Goku"
    nomes[1] = "Kurillin"
    nomes[2] = "Gohan"
    nomes[3] = "Piccolo"
    nomes[4] = "Bulma"

    for(nome in nomes){
        println(nome)
    }
    println("-----------------------------------------------------------")

    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("-----------------------------------------------------------")
    val nomes2 = arrayOf("Vegetta","Yamcha","Caos","Karin","Popo")

    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
    println("-----------------------------------------------------------")

}
