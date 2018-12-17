/*
package scala.actor
import actordemo.{Assembler, Dispatcher, Processor}

case object STOP //
case object NO_MORE_NUMBERS //
case object I_AM_DONE //
case object GIVE_ME_A_NEW_ONE //

object ActorDemo extends App {
    val assembler = new Assembler //组装者
    assembler.start()
    val dispatcher = new Dispatcher(10000, 10, assembler) //分发者
    dispatcher.start()
    for (i <- 0 to 9) {
        new Processor(dispatcher, assembler).start() //加工者
    }
}
*/
