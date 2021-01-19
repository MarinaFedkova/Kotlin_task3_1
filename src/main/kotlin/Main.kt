fun main() {
    agoToText(3600)
}

fun agoToText(seconds: Int) {
    when (seconds) {
        in 0..60 -> println("был(а) в сети только что")
        in 61..60 * 60 -> endOfMunutes(seconds / 60)
        in 60 * 60 + 1..24 * 60 * 60 -> endOfHours(seconds / 3600)
        in 86_400..172_800 -> println("был(а) в сети сегодня")
        in 172_801..259_200 -> println("был(а) в сети вчера")
        else -> println("был(а) в сети давно")
    }
}

fun endOfMunutes(minutes: Int) {
    when (minutes % 100) {
        in 2..4, in 22..24, in 32..34, in 42..44, in 52..54 -> println("был(а) в сети $minutes минуты назад")
        1, 21, 31, 41, 51 -> println("был(а) в сети $minutes минуту назад")
        else -> println("был(а) в сети $minutes минут назад")
    }
}

fun endOfHours(hours: Int) {
    when (hours % 100) {
        in 2..4, in 22..24 -> println("был(а) в сети $hours часа назад")
        1, 21 -> println("был(а) в сети $hours час назад")
        else -> println("был(а) в сети $hours часов назад")
    }
}
