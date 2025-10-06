package aula_15_funcoes_extensao

import kotlin.math.PI

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun Double.double(): Double {
    return this * 2
}

fun Double.format(decimalDigits: Int): String {
    return "%.${decimalDigits}f".format(this)
}

fun main() {
    val word = "level"
    val word2 = "radar"
    val word3 = "hello"


    println("A palavra $word é um polidromo: ${word.isPalindrome()}")
    println("A palavra $word2 é um polidromo: ${word2.isPalindrome()}")
    println("A palavra $word3 é um polidromo: ${word3.isPalindrome()}")

    println("O dobro de PI é: ${PI.double()}")
    println(PI.format(decimalDigits = 2))
}