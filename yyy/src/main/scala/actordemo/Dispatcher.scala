/*
package actordemo

import scala.actor._
import scala.actors.Actor

class Dispatcher(maxNum:Int, actorCount:Int, assembler:Actor) extends Actor {
    var currentNum = 2
    var actors = actorCount

    override def act() = {
        while (true) {
            receive {
                case GIVE_ME_A_NEW_ONE =>
                    if (currentNum <= maxNum) {
                        sender ! currentNum
                        currentNum = currentNum + 1
                    } else {
                        sender ! NO_MORE_NUMBERS
                    }
                case I_AM_DONE =>
                    actors = actors - 1
                    if (actors == 0) {
                        assembler ! STOP
                        exit
                    }
            }
        }
    }
}
*/
