package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario.funcionario("Joao",10000.0,"PJ")
    val jose = Funcionario.funcionario("Jose",1500.0,"CLT")
    val maria = Funcionario.funcionario("Maria",6500.0,"PJ")

    val funcionarios = listOf(joao,jose,maria)

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

