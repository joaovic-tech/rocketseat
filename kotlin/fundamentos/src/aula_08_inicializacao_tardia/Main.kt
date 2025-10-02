package aula_08_inicializacao_tardia

import kotlin.properties.Delegates

fun main() {
    println("lateinit")
    lateinit var language: String

    // println(language) // gera um erro: (lateinit property language has not been initialized)

    language = "Kotlin lateinit"
    println(language)

    println("lazy")
    val languageB: String by lazy {
        "Kotlin lazy"
    }

    println(languageB)

    println("lateinit com um tipo diferente de String")
    var num: Int by Delegates.notNull()
    var boolean: Boolean by Delegates.notNull()
    var double: Double by Delegates.notNull()
    var float: Float by Delegates.notNull()
}
