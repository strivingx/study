package util

import java.util.Scanner

object MIOTExcelUtilToCaseClass extends App {
    def scanner(f: String => String): Unit = {
        val sc = new Scanner(System.in)
        while (sc.hasNext()) {
            val s = sc.next()
            try {
                println(f(s))
            } catch {
                case e: Exception => println(s)
            }
        }
    }

    def excelToCaseClass(classname: String): Unit = {
        val sc = new java.util.Scanner(System.in)
        println("val list = (")
        while (sc.hasNextLine()) {
            var s = sc.nextLine()
            try {
                s = s.trim.replace("\t", "\",\"")
                s = s"""new $classname (\"$s\"),"""
                println(s)
            } catch {
                case e: Exception => println(s)
            }
        }
    }

    excelToCaseClass("MiotDevice")

}
