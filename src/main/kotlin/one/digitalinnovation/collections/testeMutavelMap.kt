package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario.funcionario("Joao", 10000.0, "PJ")
    val jose = Funcionario.funcionario("Jose", 1500.0, "CLT")
    val maria = Funcionario.funcionario("Maria", 6500.0, "PJ")

    val repositorio = Repositorio<Funcionario.funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("-----------------------------------------------------------")
    repositorio.findAll().forEach {
        println(it)
    }

    println("-----------------------------------------------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach {
        println(it)
    }


}