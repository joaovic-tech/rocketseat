package aula_04_OperadoresLogicos

fun main() {
    val a = true
    val b = false
    val c = true

    println("Operador E (&&)")

    println(a && b) // false
    println(a && c) // true

    println("Operador OU (||)")

    println(a || b) // true
    println(a || c) // true

    println("Operador Não (!)")

    println(!a) // false
    println(!b) // true

    println("Operador Igualdade (==)")

    println(20 == 200) // false
    println(a == c) // true

    println("Operador Desigualdade/diferente (!=)")

    println(20 != 200) // true
    println(a != c) // false

    println("Operador É DO TIPO e NÃO É DO TIPO (is e !is)")

    val num: Any = 1
    val numText: Any = "1"

    println(num is String) // false
    println(numText is String) // true
    println(num !is String) // true
    println(numText !is String) // false

    println("Operador PERTENCE e NÃO PERTENCE (in e !in)")
    val range = 1..10 // array de 1 até 10
    val x = 5
    val y = 15

    println(x in range) // true
    println(y in range) // false

    println(x !in range) // false
    println(y !in range) // true
}