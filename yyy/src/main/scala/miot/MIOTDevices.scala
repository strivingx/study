package miot;

object MIOTDevices extends App {
    val cmdMap1 = Map("air-conditioner" ->
            List("miot.soundbox.aircondition.cmd.openclose=开/关,打开/关闭$name$",
                "miot.soundbox.aircondition.cmd.mode=模式设置,$name$设为自动模式/制冷模式/制热模式/抽湿模式/送风模式",
                "miot.soundbox.aircondition.cmd.fan=调整风速,空调风大一点/小一点",
                "miot.soundbox.aircondition.cmd.tmp=调整温度,空调设为26度"),
        "air-purifier" ->
                List("miot.soundbox.airpurifier.cmd.openclose=开/关,打开/关闭$name$",
                    "miot.soundbox.airpurifier.cmd.mode=模式设置,$name$设为自动模式/睡眠模式/最爱模式",
                    "miot.soundbox.airpurifier.cmd.v1.mode=模式设置,$name$设为自动模式/睡眠模式/高速模式/弱风模式/中风模式/强风模式",
                    "miot.soundbox.airpurifier.cmd.aqi=查询室内空气,家里的空气质量怎么样",
                    "miot.soundbox.airpurifier.cmd.humidity=查询室内湿度,家里的湿度如何",
                    "miot.soundbox.airpurifier.cmd.filter_life=查询滤芯剩余,$name$滤芯还有多少"),
        "cooker" -> List("miot.soundbox.cooker.cmd.mode=模式设置,$name$设为快煮模式/精煮模式/煮粥模式/保温模式",
            "miot.soundbox.cooker.cmd.stop=停止工作,关闭$name$"),
        "fan" -> List("miot.soundbox.fan.cmd.openclose=开/关,打开/关闭$name$",
            "miot.soundbox.fan.cmd.speed.level=调整风速-档位,$name$风速调为1/2/3/4档",
            "miot.soundbox.fan.cmd.speed.step=调整风速-渐变,$name$风大点/风小点",
            "miot.soundbox.fan.cmd.speed.extreme=调整风速-最大/最小,$name$设为最大风/设为最小风",
            "miot.soundbox.fan.cmd.swing=$name调整摇头,$摆动/停止摆动"),
        "lightbulb" -> List("miot.soundbox.light.cmd.openclose=开/关,打开/关闭$name$",
            "miot.soundbox.light.cmd.bright.step=调整亮度-渐变,$name$亮一点/暗一点",
            "miot.soundbox.light.cmd.bright.extreme=调整亮度-最高/最低,$name$亮度调到最高/最低",
            "miot.soundbox.light.cmd.color=设置颜色,$name$设为红/橙/黄/绿/青/蓝/紫色"),
        "socket" -> List("miot.soundbox.socket.cmd.openclose=开/关,打开/关闭$name$"),
        "sweeper" -> List("miot.soundbox.sweeper.cmd.start=启动,$name$启动",
            "miot.soundbox.sweeper.cmd.stop=暂停,$name$暂停",
            "miot.soundbox.sweeper.cmd.charge=充电,$name$充电"),
        "switch" -> List("miot.soundbox.switch.cmd.openclose=开/关,打开/关闭$name$"),
        "outlet" -> List("miot.soundbox.default.cmd.open=开/关,打开$name$"))

    val cmdMap = Map("air-conditioner" ->
            List("开/关,打开/关闭$name$",
                "模式设置,$name$设为自动模式/制冷模式/制热模式/抽湿模式/送风模式",
                "调整风速,空调风大一点/小一点",
                "调整温度,空调设为26度"),
        "air-purifier" ->
                List("开/关,打开/关闭$name$",
                    "模式设置,$name$设为自动模式/睡眠模式/最爱模式",
                    "模式设置,$name$设为自动模式/睡眠模式/高速模式/弱风模式/中风模式/强风模式",
                    "查询室内空气,家里的空气质量怎么样",
                    "查询室内湿度,家里的湿度如何",
                    "查询滤芯剩余,$name$滤芯还有多少"),
        "cooker" -> List("模式设置,$name$设为快煮模式/精煮模式/煮粥模式/保温模式",
            "停止工作,关闭$name$"),
        "fan" -> List("开/关,打开/关闭$name$",
            "调整风速-档位,$name$风速调为1/2/3/4档",
            "调整风速-渐变,$name$风大点/风小点",
            "调整风速-最大/最小,$name$设为最大风/设为最小风",
            "调整摇头,$摆动/停止摆动"),
        "lightbulb" -> List("开/关,打开/关闭$name$",
            "调整亮度-渐变,$name$亮一点/暗一点",
            "调整亮度-最高/最低,$name$亮度调到最高/最低",
            "设置颜色,$name$设为红/橙/黄/绿/青/蓝/紫色"),
        "socket" -> List("开/关,打开/关闭$name$"),
        "sweeper" -> List("启动,$name$启动",
            "暂停,$name$暂停",
            "充电,$name$充电"),
        "switch" -> List("开/关,打开/关闭$name$"),
        "outlet" -> List("开/关,打开$name$"))
    cmdMap.foreach(println)

    /*def getCommands(name: String, displayName: String): List = {
        cmdMap.getOrElse(name, List()).map(s => s.replace("$name$", displayName))
    }*/

    def excelToCaseClass(classname: String): Unit = {
        val sc = new java.util.Scanner(System.in)
        println("val list = (")
        while (sc.hasNext()) {
            var s = sc.nextLine()
            try {
                s = s.trim.replace("\t", "\",\"").replace("\"List", "List").replace(")\")", "))")
                s = s"""new $classname (\"$s\"),"""
                println(s)
            } catch {
                case e: Exception => println(s)
            }
        }
    }

    excelToCaseClass("MiotDevice")
}
