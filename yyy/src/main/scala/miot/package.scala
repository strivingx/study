package miot;
object MiotReplace extends App {
    val sc = new java.util.Scanner(System.in)
    while(sc.hasNextLine){
        val str = sc.nextLine
        val strs = str.split("\t")
        println(s"${strs(0)}\t${strs(1).replace("$name$", strs(0))}")
    }
}
