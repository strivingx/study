package skillstore;
import java.util.Scanner

object SkillName extends App {
    def generateSql(skillName: String, displayName: String): String = {
        s"update skill set skill_name = '$skillName' where display_name = '$displayName';"
    }

    val sc = new Scanner(System.in)
    while (sc.hasNext()) {
        val strs = sc.nextLine().split("\t")
        try {
            println(generateSql(strs(1).trim, strs(0).trim))
        } catch {
            case e: Exception => //println(s"$strs(0), $strs(1)")
        }
    }
}