package aula_02_tipos_de_dados

fun main() {
    // números
    val byte: Byte = 127 // de -128 até 127
    val short: Short = 32_767
    val int: Int = 1_000_000
    val long: Long = 999999999999999999
    val float: Float = 3f
    val double: Double = 21.9

    // textos
    val char: Char = 'J' // somente um caracter (letras numeros e simbolos dentro de aspas simples)
    val string: String = "${char}oão $double $float"
    println(string) // output: João 21.9 3.0

    // boolean
    val boolean: Boolean = true == char.equals("J")
    println(boolean) // output: true
}