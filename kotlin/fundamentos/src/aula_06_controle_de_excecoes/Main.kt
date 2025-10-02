package aula_06_controle_de_excecoes

fun main() {
    var x: Int = 1

    x = try {
        10 / 0
    } catch (e: ArithmeticException) {
        println("Nome de usuário não pode ser um número.")
        0
    } catch (e: Exception) {
        println("Erro genérico.")
        1
    }

    println(x)
}
