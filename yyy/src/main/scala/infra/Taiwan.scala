package infra;

object Taiwan extends App {
    val str =
        """ {"city":"高雄","norm_token":"高雄","province":"台湾","longitude":120.67,"latitude":23.01}
    {"district":"台南县","norm_token":"台南","city":"高雄","province":"台湾","longitude":120.251,"latitude":23.142}
    {"city":"高雄市","norm_token":"高雄","province":"台湾","longitude":120.67,"latitude":23.01}
    {"district":"屏东","norm_token":"屏东","city":"高雄","province":"台湾","longitude":120.494,"latitude":22.676}
    {"city":"台中市","norm_token":"台中","province":"台湾","longitude":120.941,"latitude":24.234}
    {"district":"台东","norm_token":"台东","city":"高雄","province":"台湾","longitude":121.145,"latitude":22.759}
    {"poi":"白沙湾海水浴场","norm_token":"白沙湾海水浴场","province":"台湾"}
    {"district":"花莲县","norm_token":"花莲","city":"台中","province":"台湾","longitude":121.606,"latitude":23.973}
    {"district":"苗栗","norm_token":"苗栗","city":"台中","province":"台湾","longitude":120.82,"latitude":24.57}
    {"district":"嘉义","norm_token":"嘉义","city":"高雄","province":"台湾","longitude":120.454,"latitude":23.483}
    {"district":"新竹区","norm_token":"新竹","city":"台北","province":"台湾","longitude":120.965,"latitude":24.804}
    {"city":"台北","norm_token":"台北","province":"台湾","longitude":121.56,"latitude":25.092}
    {"city":"台北市","norm_token":"台北","province":"台湾","longitude":121.56,"latitude":25.092}
    {"district":"花莲","norm_token":"花莲","city":"台中","province":"台湾","longitude":121.606,"latitude":23.973}
    {"district":"彰化","norm_token":"彰化","city":"台中","province":"台湾","longitude":120.533,"latitude":24.067}
    {"district":"台东区","norm_token":"台东","city":"高雄","province":"台湾","longitude":121.145,"latitude":22.759}
    {"district":"桃园","norm_token":"桃园","city":"台北","province":"台湾","longitude":121.3111,"latitude":24.9889}
    {"district":"花莲区","norm_token":"花莲","city":"台中","province":"台湾","longitude":121.606,"latitude":23.973}
    {"district":"新竹县","norm_token":"新竹","city":"台北","province":"台湾","longitude":120.965,"latitude":24.804}
    {"district":"苗栗县","norm_token":"苗栗","city":"台中","province":"台湾","longitude":120.82,"latitude":24.57}
    {"district":"苗栗区","norm_token":"苗栗","city":"台中","province":"台湾","longitude":120.82,"latitude":24.57}
    {"district":"云林","norm_token":"云林","city":"台中","province":"台湾","longitude":120.389,"latitude":23.757}
    {"district":"南投","norm_token":"南投","city":"台中","province":"台湾","longitude":120.683,"latitude":23.917}
    {"city":"台中","norm_token":"台中","province":"台湾","longitude":120.941,"latitude":24.234}
    {"district":"台南","norm_token":"台南","city":"高雄","province":"台湾","longitude":120.251,"latitude":23.142}
    {"district":"嘉义区","norm_token":"嘉义","city":"高雄","province":"台湾","longitude":120.454,"latitude":23.483}
    {"district":"屏东县","norm_token":"屏东","city":"高雄","province":"台湾","longitude":120.494,"latitude":22.676}
    {"district":"宜兰","norm_token":"宜兰","city":"台北","province":"台湾","longitude":121.498,"latitude":25.034}
    {"district":"彰化县","norm_token":"彰化","city":"台中","province":"台湾","longitude":120.533,"latitude":24.067}
    {"district":"宜兰区","norm_token":"宜兰","city":"台北","province":"台湾","longitude":121.498,"latitude":25.034}
    {"poi":"阎锡山墓","norm_token":"阎锡山墓","province":"台湾","city":"台北"}
    {"district":"嘉义县","norm_token":"嘉义","city":"高雄","province":"台湾","longitude":120.454,"latitude":23.483}
    {"district":"台南区","norm_token":"台南","city":"高雄","province":"台湾","longitude":120.251,"latitude":23.142}
    {"district":"云林县","norm_token":"云林","city":"台中","province":"台湾","longitude":120.389,"latitude":23.757}
    {"district":"新竹","norm_token":"新竹","city":"台北","province":"台湾","longitude":120.965,"latitude":24.804}
    {"district":"屏东区","norm_token":"屏东","city":"高雄","province":"台湾","longitude":120.494,"latitude":22.676}
    {"district":"桃园区","norm_token":"桃园","city":"台北","province":"台湾","longitude":121.3111,"latitude":24.9889}
    {"district":"彰化区","norm_token":"彰化","city":"台中","province":"台湾","longitude":120.533,"latitude":24.067}
    {"district":"南投县","norm_token":"南投","city":"台中","province":"台湾","longitude":120.683,"latitude":23.917}
    {"district":"台东县","norm_token":"台东","city":"高雄","province":"台湾","longitude":121.145,"latitude":22.759}
    {"district":"宜兰县","norm_token":"宜兰","city":"台北","province":"台湾","longitude":121.498,"latitude":25.034}
    {"district":"云林区","norm_token":"云林","city":"台中","province":"台湾","longitude":120.389,"latitude":23.757}
    {"district":"南投区","norm_token":"南投","city":"台中","province":"台湾","longitude":120.683,"latitude":23.917}
    {"district":"桃园县","norm_token":"桃园","city":"台北","province":"台湾","longitude":121.3111,"latitude":24.9889}"""

    case class TaiwanInfo(district: String, city: String, province: String)

    val result = str.split("\n").map { s =>
        var district = ""
        var city = ""
        var province = ""
        s.split(",").map(_.trim.replace("\"", "").replace("}", "")).map { ss =>
            if (ss.contains("province"))
                province = ss.substring(ss.indexOf(":") + 1)
            if (ss.contains("district"))
                district = ss.substring(ss.indexOf(":") + 1).replace("区", "").replace("县", "")
            if (ss.contains("city"))
                city = ss.substring(ss.indexOf(":") + 1)
        }
        TaiwanInfo("\"" + district + "\"", "\"" + city + "\"", "\"" + province + "\"")
    }.distinct.toList.toString()
    println(result.replace("),", "),\n"))
}
