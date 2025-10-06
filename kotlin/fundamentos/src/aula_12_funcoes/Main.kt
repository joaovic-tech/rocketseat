package aula_12_funcoes

fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

fun main() {
    val num = 4
    println("$num é par? ${isEven(num)}")
}
