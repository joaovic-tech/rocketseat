package aula_17_classes

class CarKolinaGM(val model: String, val year: Int) {
    val chassi = "9BG" + year.toString().reversed() + model.reversed()

    override fun toString(): String {
        return """
            Modelo: $model
            Ano: $year
            Chassi: $chassi
        """.trimIndent()
    }
}

fun main() {
    val onix16 = CarKolinaGM(model = "Onix", year = 2016)
    val celta08 = CarKolinaGM(model = "Celta", year = 2008)
    val astra12 = CarKolinaGM(model = "Astra", year = 2012)


    println("-".repeat(20))
    println(onix16)
    println("-".repeat(20))
    println(celta08)
    println("-".repeat(20))
    println(astra12)
    println("-".repeat(20))
}
