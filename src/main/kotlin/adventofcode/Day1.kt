package adventofcode

import java.io.File

fun main() {
    var answer = 0;
    fun getLines(): List<String> = File("C:\\Users\\laris\\IdeaProjects\\adventofcode23\\src\\main\\kotlin\\day1.txt").useLines { it.toList() }
    for (i in getLines() ) {
        val calc = Regex("[^0-9]").replace(
            mapOf("one" to "o1e", "two" to "t2o", "three" to "t3e", "four" to "f4r", "five" to "f5e"
                , "six" to "s6x", "seven" to "s7n", "eight" to "e8t", "nine" to "n9e")
                .entries.fold(i) { acc, (key, value) -> acc.replace(key, value) }
            , "");
        answer += ("" + calc[0] + calc[calc.length-1]).toInt();
    }
    println(answer);
}