package aula_10_colecoes

fun main() {
    // set não aceitas valores duplicados
    val set = setOf(1, 2, 3, 3)
    val setRandom = setOf(set.joinToString(), "Kotlin", "Java", "Kotlin", 4.0, false, true, 0..100)
    val setMutable = mutableSetOf(setRandom.joinToString())

    println(set)
    println(setRandom)
    println(setMutable)

    setMutable.add("Adicionado depois huehue BR!!!")
    println(setMutable)

    // map aceita valores duplicados, mas não aceita chaves duplicadas

    //             Chave | Valor                           |<-----------------> A ultima chave substituído o valor
    //               /      \                                                           \
    val map = mapOf<Int, String>(Pair(1, "Python"), 2 to "Java", 1 to "Kotlin")
    println(map) // {1=Kotlin, 2=Java}
    println(map.keys) // [1, 2]
    println(map.values) // [Kotlin, Java]
    println(map.entries) // [1=Kotlin, 2=Java]

    val mapMutable = mutableMapOf(1 to "Kotlin", 2 to "Java", "C#" to 3, "nubers" to 1..20)
    println(mapMutable)

    /***
     * hashMap -> Mutável | Armazenas elemento unicos | Melhor performance em algoritmos
     * hashSet -> Mutável | Armazenas elemento unicos | Melhor performance em algoritmos

     * Diferenca:
     * HashMap aceita valores nulos para chaves e valores, enquanto HashTable não aceita.
     * HashMap não é sincronizado, o que o torna mais rápido para operações de thread única.
     * HashTable é sincronizado, o que o torna seguro para uso em ambientes multi-thread, mas mais lento.
     */

    val hashSet = hashSetOf(1, 2, 3)
    println(hashSet)

    val hashMap = hashMapOf(1 to "Kotlin")
    println(hashMap)
}