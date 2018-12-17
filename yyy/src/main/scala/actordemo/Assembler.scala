/*
package actordemo

import scala.actor.STOP
import scala.actors.Actor

class Assembler extends Actor {
    var primeNumCount = 0

    override def act() = {
        while (true) {
            receive {
                case count: Int =>
                    primeNumCount = primeNumCount + count
                    println(s"current prime count is $primeNumCount")
                case STOP =>
                    println(s"total prime count is $primeNumCount")
                    exit()
            }
        }
    }
}
*/
