package aula_09_OperadoresMatematicos

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    var num: Int = 4
    var num2: Int = 2

    println("básicos")

    println("soma: ${num + num2}")
    println("subtração: ${num - num2}")
    println("multiplicação: ${num * num2}")
    println("divisão: ${num / num2}")
    println("resto: ${num % num2}")

    println("incrementando o ${num++} (usando o num++): $num") // 5
    println("decrementando o ${num--} (usando o num--): $num") // 4

    println("Atribuição composta")

    var num3 = 32
    num3 += 1 // pode ser usado qualquer operador (-=, +=, *=, /=, %=)
    println(num3) // 33

    println("Lib Math")
    /*
    Poderíamos utilizar o Math do próprio JAVA
    val valueRounded = Math.round(2.4)
    val valueFloor = Math.floor(2.9)
    val valueCeil = Math.ceil(2.9)
    val valuePow = Math.pow(2.0, 3.0)
    val valueLog = Math.log10(100.0)

    Porem o kotlin tem sua simplificação:
     */


    val valueRounded = 2.4.roundToInt() // 2.4 se torna => 2 ---- e 2.5 ou superior se tornaria 3
    val valueFloor = floor(2.9) // Método floor arredonda sempre para baixo
    val valueCeil = ceil(2.9) // Método floor arredonda sempre para baixo
    val valuePow = 2.0.pow(3.0) // 2 Elevado a 3 = 2 * 2 * 2 = 8
    val valueLog = log10(100.0) //

    println(valueRounded) // 2
    println(valueFloor) // 2.0
    println(valueCeil) // 3.0
    println(valuePow) // 8.0
    println(valueLog) // 2.0 ≥ resultado sai 2, pois 10 multiplicado duas vezes por ele mesmo resulta em 100 (10 * 10 = 100)
}