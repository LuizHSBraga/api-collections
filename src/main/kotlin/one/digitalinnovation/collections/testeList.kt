package one.digitalinnovation.collections

fun main(){
    val Joao = funcionario("Joao",10000.0,"PJ")
    val Jose = funcionario("Jose",1500.0,"CLT")
    val Maria = funcionario("Maria",6500.0,"PJ")

    val funcionarios = listOf(Joao,Jose,Maria)

    funcionarios.forEach {
        println(it)
    }

    println("-----------------------------------------------------------")
    println(funcionarios.find {
        it.nome == "Maria"
    })

    println("-----------------------------------------------------------")
    funcionarios.sortedBy {
        it.salario
    }.forEach {
        println(it)
    }

    println("-----------------------------------------------------------")
    funcionarios.groupBy{
        it.tipoContratacao
    }.forEach {
        println(it)
    }
}

data class funcionario(
    val nome : String,
    val salario : Double,
    val tipoContratacao: String
)
{
    override fun toString(): String =
        """
            Nome:$nome
            Salario:$salario
        """.trimIndent()


}