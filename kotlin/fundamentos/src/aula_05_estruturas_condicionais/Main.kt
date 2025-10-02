package aula_05_estruturas_condicionais

fun main() {
    println("if / else / else if")

    val x = 100
    val y = 50

    if (x > y) {
        println("x > y")
    } else if (x < y) {
        println("x < y")
    } else if (x == y) {
        println("x == y")
    } else {
        println("else")
    }

    println("when")

    val result = when (x) {
        in 1..99 -> "x está entre 1 há 99"
        100 -> "x é 100"
        in 101..200 -> "x está entre 101 há 200"
        else -> {}
    }

    println(result)
}