import java.time.LocalDateTime
// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Qual é o seu nome?")
    val name: String = readln()

    println("Qual é a sua idade?")
    val age: Int = readln().toInt()

    val currentYear = LocalDateTime.now().year
    val dateOfBirth = currentYear - age
    var ageInitial = 0

    println("=".repeat(20) + " Linha do tempo " + "=".repeat(20))

    for (i in dateOfBirth..currentYear) {
        when (ageInitial) {
            0 -> {
                println("Você nasceu em $dateOfBirth")
            }

            1 -> {
                println("Seu primeiro aninho de vida foi em $i")
            }

            age -> {
                println("E agora $name em $currentYear, você tem $age anos!")
            }

            else -> {
                println("Em $i você tinha $ageInitial anos")
            }
        }
        ageInitial++
    }

}