package util

import java.util.Scanner

object Base extends App {
    val sc = new Scanner(System.in)
    while (sc.hasNext()) {
        val s = sc.nextLine()
        try {
            println(execute(s))
        } catch {
            case e: Exception => println(s)
        }
    }

    def execute(line: String): String = line

}
