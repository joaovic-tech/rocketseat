package aula_10_colecoes

fun main() {
    println("Arrays")
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val array2: Array<String> = arrayOf("1", "2", "3")

    println(array.joinToString(prefix = "[", postfix = "]", separator = " | "))
    println(array2.joinToString())

    val array3: Array<Int> = arrayOf(6, 7, 8, 9, 10)
    val arraySum = array.plus(array3).joinToString()
    println(arraySum)

    println("Lists")
    val list = listOf("2", false, 0, -2, arraySum, 5, 90, -3, 40, 3, 4, 22)
    println(list)

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)
    mutableList.removeAt(0)
    println(mutableList)

    // Iterando sobre a lista de um determinado tipo (Int)
    val getNumberList: List<Int> = list.filterIsInstance<Int>()
    println("Lista de números da (list): $getNumberList")

    // Lista de Ints maires que 2
    val list2 = list.filter { it is Int && it > 2 }
    println("Lista de numeros maiores que dois: $list2")

    // Ordenando lista
    val listIntMessy: List<Int> = listOf(10, 5, 8, 2, 1, 9, 4, 7, 3, 6)
    val listIntOrder = listIntMessy.sorted()

    println("Lista númerica bagunçada: $listIntMessy")
    println("Lista númerica ordenada: $listIntOrder")

    val listStringMessy: List<String> = listOf("João", "Ana", "Maria", "Pedro")
    val listStringOrder = listStringMessy.sorted()

    println("Lista de nomes bagunçada: $listStringMessy")
    println("Lista de nomes ordenada: $listStringOrder")

    val findFirstOdd = list.find { it is Int && it % 2 != 0 }
    val findLastOdd = list.findLast { it is Int && it % 2 != 0 }
    println(findFirstOdd)
    println(findLastOdd)
}