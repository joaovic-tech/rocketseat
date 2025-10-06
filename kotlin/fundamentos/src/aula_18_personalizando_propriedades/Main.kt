package aula_18_personalizando_propriedades

import kotlin.math.ceil

class Person(val name: String) {
    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
            else println("Idade não pode ser negativa.")
        }

    var height: Double = 0.0
        get() = ceil(field)

    override fun toString(): String {
        return "Person(name=\"$name\", age=$age, height=$height)"
    }
}

fun main() {
    val joao = Person(name = "João")
    joao.age = 21
    joao.height = 169.9

    println(joao)
}