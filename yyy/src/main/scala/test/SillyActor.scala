/*
package test

import scala.actors.Actor
import scala.actors.Actor._
object SillyActor extends App {
    def act(): Unit = {
        for (i <- 1 to 5) {
            println(s"I'm acting! $i")
            Thread.sleep(1000)
        }

    }

    val test = actor {
        while (true) {
            receive {
                case msg: String =>
                    println(s"received String message: $msg")

                case msg: Int =>
                    println(s"received Int message: $msg")

                case msg: Boolean =>
                    println(s"received Boolean message: $msg")
            }
        }

    }
    test ! "aaa"

    test ! false
    self ! 111

    println(self.receive { case x => x })
    self ! true

    println(self.receiveWithin(100) { case x => x })
}
*/
