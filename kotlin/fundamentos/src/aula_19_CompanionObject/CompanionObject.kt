package aula_19_CompanionObject

// Companion Object é uma forma de definir membros estáticas numa classe, que não pertence às instâncias e sim a propria classe.
// Quando que Companion Object irão ser útil?

// Quando você precisa de uma única instância de um objeto para toda a aplicação (Singleton).
// Quando você precisa de métodos de fábrica para criar instâncias da classe.
// Quando você precisa de constantes que são associadas à classe, mas não a uma instância específica.

class Person() {
    companion object {
        const val KEY = "12345678"
        private const val KEY_2 = "as123k09s8d-a09sd87e728q19y-fa7863w4d9873y2q"

        fun getKeys() : Array<String> {
            return arrayOf(KEY, KEY_2)
        }
    }
}

fun main() {
    val key = Person.KEY
    // val key2 = Person.KEY_2 // Cannot access 'val KEY_2: String': it is private
    val joao = Person()

    // println(joao.KEY) -> Erro: Unresolved reference 'KEY'.
    val obtainKeys = Person.getKeys()
    val key2 = Person.getKeys()[1]

    println(key)
    println(key2)
    println(obtainKeys.joinToString())
}
