package collections

object MapTest extends App {

    def flatMap() = {
        val li = List(1, 2, 3)
        val res = li.flatMap(x => x match {
            case 3 => List('a', 'b')
            case _ => List(x * 2)
        })
        println(res)
    }

    def map() = {
        val li = List(1, 2, 3)
        val res = li.map(x => x match {
            case 3 => List('a', 'b')
            case _ => x * 2
        })
        println(res)
    }

    flatMap()
    map()
}
