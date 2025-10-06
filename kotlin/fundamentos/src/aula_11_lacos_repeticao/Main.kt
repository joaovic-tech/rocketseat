package aula_11_lacos_repeticao

fun main() {
    val items = listOf("Sapato", "Camisa do Brasil", "Carrinho de rolimã", "Criatividade", "Microfone")

    println("--------------- Iniciando laço for in --------------------")

    for (item in items) {
        println(item)
    }

    println("--------------- Iniciando laço forEach --------------------")

    items.forEach{ item ->
        println(item)
    }

    println("--------------- Iniciando laço forEachIndexed --------------------")

    items.forEachIndexed{ index, item ->
        println("index: $index | item: $item")
    }

    println("--------------- Iniciando laço withIndex --------------------")

    for ((index, item) in items.withIndex()) {
        if(index == 3)
            continue

        println("index: $index | item: $item")
    }

    println("--------------- Iniciando o laço While --------------------")

    var index = 1
    val maxLimit = 5

    while(index <= maxLimit) {
        println("$index...")
        index ++
    }

    println("--------------- Iniciando o laço do While --------------------")

    var index2 = 1

    do {
        println(index2)

        if(index2 == 3) {
            break
        }

        index2 ++
    } while (index2 <= 5)

    println("--------------- Iniciando laços aninhados --------------------")

    loop@ for(i in 1..3) {
        for (j in 1..3) {
            if(i == 2 && j == 2 ) {
                break@loop
            }
            println("i = $i | j = $j")
        }
    }

    println("--------------- repeat --------------------")

    var index3 = 1

    repeat(5) {
        println()
        index3 ++
    }
}

/**
 * Output:
 * --------------- Iniciando laço for in --------------------
 * Sapato
 * Camisa do Brasil
 * Carrinho de rolimã
 * Criatividade
 * Microfone
 * --------------- Iniciando laço forEach --------------------
 * Sapato
 * Camisa do Brasil
 * Carrinho de rolimã
 * Criatividade
 * Microfone
 * --------------- Iniciando laço forEachIndexed --------------------
 * index: 0 | item: Sapato
 * index: 1 | item: Camisa do Brasil
 * index: 2 | item: Carrinho de rolimã
 * index: 3 | item: Criatividade
 * index: 4 | item: Microfone
 * --------------- Iniciando laço withIndex --------------------
 * index: 0 | item: Sapato
 * index: 1 | item: Camisa do Brasil
 * index: 2 | item: Carrinho de rolimã
 * index: 4 | item: Microfone
 * --------------- Iniciando o laço While --------------------
 * 1...
 * 2...
 * 3...
 * 4...
 * 5...
 * --------------- Iniciando o laço do While --------------------
 * 1
 * 2
 * 3
 * --------------- Iniciando laços aninhados --------------------
 * i = 1 | j = 1
 * i = 1 | j = 2
 * i = 1 | j = 3
 * i = 2 | j = 1
 * --------------- repeat --------------------
 *
 *
 *
 *
 *
 *
 */
