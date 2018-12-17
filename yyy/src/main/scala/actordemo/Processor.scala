/*
package actordemo

import scala.actor.{GIVE_ME_A_NEW_ONE, I_AM_DONE, NO_MORE_NUMBERS}
import scala.actors.Actor

class Processor(dispatcher: Dispatcher, assembler: Assembler) extends Actor {
    var primeNumCount = 0

    override def act() = {
        dispatcher ! GIVE_ME_A_NEW_ONE
        while (true) {
            receive {
                case NO_MORE_NUMBERS =>
                    assembler ! primeNumCount
                    sender ! I_AM_DONE
                    exit()
                case number: Int =>
                    if (isPrime(number)) {
                        primeNumCount = primeNumCount + 1
                    }
                    sender ! GIVE_ME_A_NEW_ONE
            }
        }
    }

    def isPrime(num: Int): Boolean = {
        var flag = true
        for (i <- 2 to num - 1) {
            if (num % i == 0)
                flag = false
        }
        flag
    }
}
*/
