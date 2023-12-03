package adventofcode

import java.io.File

fun main() {
    // 12 Red, 13 Green, 14 Blue
    fun getLines() =
        File("C:\\Users\\laris\\IdeaProjects\\adventofcode23\\src\\main\\kotlin\\adventofcode\\day2.txt")
            .useLines { it.toList() }

    for (i in getLines()) {
        var j = 0;
        val s = i.split(" ");

        for (a in s) {
            var rc = 0;
            var gc = 0;
            var bc = 0;
            j++;

            if(Regex("[0-9]").matches(a) && (s[j].equals("blue", true) || s[j].equals("red", true) || s[j].equals("green", true))) {
                if(s[j] == "blue") bc += a.toInt();
                if(s[j] == "red") rc += a.toInt();
                if(s[j] == "green") gc += a.toInt();
            }
        }

    }
}