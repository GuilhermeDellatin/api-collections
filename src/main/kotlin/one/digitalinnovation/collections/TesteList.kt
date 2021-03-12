package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 3000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4500.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    //O it nessa operação é a instancia do objeto
    //Ele não representa uma string ou o double, ele é um funcionário
    funcionarios.forEach { println(it) }
    println("-------------------")

    println(funcionarios.find { it.nome == "Maria" })
    println("-------------------")

    //Recurso de encadeamento, para realizar operações sobre uma collection
    //Como o it representa o objeto, temos que fazer a ordenação por salário
    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("-------------------")

    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
            
        """.trimIndent()
}