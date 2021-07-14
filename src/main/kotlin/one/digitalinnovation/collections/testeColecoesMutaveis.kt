package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario.funcionario("Joao", 10000.0, "PJ")
    val jose = Funcionario.funcionario("Jose", 1500.0, "CLT")
    val maria = Funcionario.funcionario("Maria", 6500.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {
        println(it)
    }

    println("---------------------List---------------------------------")
    funcionarios.add(jose)
    funcionarios.forEach {
        println(it)
    }

    println("-----------------------------------------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach {
        println(it)
    }

    println("---------------------SET-----------------------------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach {
        println(it)
    }

    println("-----------------------------------------------------------")
    funcionarioSet.add(jose)
    funcionarioSet.add(maria)
    funcionarioSet.forEach {
        println(it)
    }
    println("-----------------------------------------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach {
        println(it)
    }

}