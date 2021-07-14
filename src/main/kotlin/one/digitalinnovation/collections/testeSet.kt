package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario.funcionario("Joao", 10000.0, "PJ")
    val jose = Funcionario.funcionario("Jose", 1500.0, "CLT")
    val maria = Funcionario.funcionario("Maria", 6500.0, "PJ")

    val Funcionarios1 = setOf(joao, jose)
    val Funcionarios2 = setOf(maria)

    val resultUnion = Funcionarios1.union(Funcionarios2)
    resultUnion.forEach {
        println(it)
    }

    println("-----------------------------------------------------------")
    val Funcionarios3 = setOf(joao, jose, maria)
    val resultSubstract = Funcionarios1.subtract(Funcionarios2)
    resultSubstract.forEach {
        println(it)
    }

    println("-----------------------------------------------------------")
    val resultIntersect = Funcionarios3.intersect(Funcionarios2)
    resultIntersect.forEach {
        println(it)
    }
}
