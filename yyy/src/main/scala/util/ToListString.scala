package util

import java.util.Scanner

object ToListString extends App {

    val sc = new Scanner(System.in)
    while (sc.hasNext()) {
        val s = sc.nextLine()
        try {

            print("\"" + s+"\","  )
        } catch {
            case e: Exception => println(s)
        }
    }

}

//List("开/关,打开/关闭$name$","调整风速-档位,$name$风速调为1/2/3/4档","调整风速-渐变,$name$风大点/风小点","调整风速-最大/最小,$name$设为最大风/设为最小风","$name调整摇头,$摆动/停止摆动")