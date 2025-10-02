package aula_03_detalhes_tipode_dados

fun main() {
    val age: Int = 21

    // adicionar meses em formato decimal ao inteiro da idade (converter idade em um tipo de dado numerico flutuante)
    var ageDouble: Double = age.toDouble()
    val monthParcent: Double = 1.0 / 12
    println("ageDouble = $ageDouble monthParcent = $monthParcent")

    // 2 meses depois...

    ageDouble += 2 * monthParcent
    println("ageDouble updated = $ageDouble")
}