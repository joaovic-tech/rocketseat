package aula_13_funcoes_anonimas

fun main() {
    // Criando uma função anonima
    val sum = { x: Int, y: Int -> x + y }
    var num = sum(46, 4)
    println(num)

    println("-".repeat(20))

    val funSum = { a: Int, b: Int ->
        {
            num += a + b
            num + 7
        }
    }

    println(num)
    println(funSum(1, 2).invoke())
}
