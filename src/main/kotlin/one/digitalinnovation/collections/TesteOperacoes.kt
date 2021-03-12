package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("-------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("-------------------")

    //Para o filter é necessário usar um predicado
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }

    println("-------------------")

    //Vai pegar os salarios que estão nesse intervalo
    println(salarios.count { it in 2000.0..5000.0 })

    println("-------------------")

    //Para encontrar um valor exatamente como foi passado
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("-------------------")

    //Para encontrar qualquer salário onde a expressão seja válida
    println(salarios.find { it == 1000.0 })
    println(salarios.find { it == 500.0 })
}