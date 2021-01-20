fun main() {
    agoToText(1000)
}

fun agoToText(seconds: Int) {
    when (seconds) {
        in 0..60 -> printResult("только что")
        in 61..60 * 60 -> endOfMunutes(seconds / 60)
        in 60 * 60 + 1..24 * 60 * 60 -> endOfHours(seconds / 3600)
        in 86_400..172_800 -> printResult("сегодня")
        in 172_801..259_200 -> printResult("вчера")
        else -> printResult("давно")
    }
}

fun endOfMunutes(minutes: Int) {
    if (minutes % 100 in 11..14) {
        printResult("$minutes минут назад")
    } else when (minutes % 10) {
        2, 3, 4 -> printResult("$minutes минуты назад")
        1 -> printResult("$minutes минуту назад")
        else -> printResult("$minutes минут назад")
    }
}

fun endOfHours(hours: Int) {
    when (hours % 100) {
        in 2..4, in 22..24 -> printResult("$hours часа назад")
        1, 21 -> printResult("$hours час назад")
        else -> printResult("$hours часов назад")
    }
}

fun printResult(result: String) {
    println("был(а) в сети $result")
}
