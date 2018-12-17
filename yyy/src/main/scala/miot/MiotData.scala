package miot

object MiotUtil extends App {

    case class MiotModel(pd_id: Int, model: String, name: String, icon_real: String)

    val str =
        """
        (
            [pd_id] => 13
            [model] => yunyi.camera.v1
            [name] => 小蚁智能摄像机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5794f76c80ea56b895cec4263057a5e1.png
        )

    [1] => Array
        (
            [pd_id] => 14
            [model] => chuangmi.plug.v1
            [name] => 小米智能插座
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5710dd5fd74695697baab01b30e35f83.png
        )

    [2] => Array
        (
            [pd_id] => 15
            [model] => yunmi.waterpurifier.v1
            [name] => 小米净水器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c4164c051bf1eb983206bd9e3b1fa2ef.png
        )

    [3] => Array
        (
            [pd_id] => 18
            [model] => zhimi.airpurifier.v1
            [name] => 小米空气净化器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3647794fe7ac6616f8e1f9d1adde5ba3.png
        )

    [4] => Array
        (
            [pd_id] => 21
            [model] => xiaomi.watch.band1
            [name] => 小米手环
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e514e9562bb1d0877d1cc7a7120ec59c.png
        )

    [5] => Array
        (
            [pd_id] => 23
            [model] => chuangmi.ir.v2
            [name] => 小米万能遥控器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_eaf1ad338108329ae84db65d8e632dc2.png
        )

    [6] => Array
        (
            [pd_id] => 24
            [model] => lumi.gateway.v1
            [name] => 多功能网关
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5165eb28faa9197d3c31b8fdfd820a3e.png
        )

    [7] => Array
        (
            [pd_id] => 26
            [model] => xiaomi.router.v1
            [name] => 小米路由器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b0183dec96fa154daef0cdbb05ce1f06.png
        )

    [8] => Array
        (
            [pd_id] => 27
            [model] => xiaomi.router.mv1
            [name] => 小米路由器mini
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_9da081b8e0cef1167e1a964b05e8ece7.png
        )

    [9] => Array
        (
            [pd_id] => 28
            [model] => xiaomi.tv.v1
            [name] => 小米电视
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/zwbo9ndc_1446040571.jpg
        )

    [10] => Array
        (
            [pd_id] => 30
            [model] => xiaomi.tvbox.v1
            [name] => 小米电视盒子
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/0rfunwjf_1446040559.jpg
        )

    [11] => Array
        (
            [pd_id] => 34
            [model] => zhimi.airpurifier.v2
            [name] => 小米空气净化器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/0l35j0oa_1446086740.jpg
        )

    [12] => Array
        (
            [pd_id] => 37
            [model] => yeelink.light.rgb1
            [name] => Yeelight 灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_65ac513061d60ace68725b3d0fdca2e0.png
        )

    [13] => Array
        (
            [pd_id] => 38
            [model] => xiaomi.demo.v1
            [name] => 小米开发板
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/gtdixy24_1443015351.png
        )

    [14] => Array
        (
            [pd_id] => 40
            [model] => xiaomi.demo.v2
            [name] => 小米开发板
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/my0ummof_1445828928.png
        )

    [15] => Array
        (
            [pd_id] => 41
            [model] => lumi.sensor_switch.v1
            [name] => 无线开关
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_cee8ad903bf159e1d9c456f0abe526e3.png
        )

    [16] => Array
        (
            [pd_id] => 42
            [model] => lumi.sensor_magnet.v1
            [name] => 门窗传感器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_540289677272929b4abec814b43ad6e9.png
        )

    [17] => Array
        (
            [pd_id] => 43
            [model] => lumi.sensor_motion.v1
            [name] => 人体传感器
            [icon_real] => http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_61aa54b9af3b397b98c9fd98b0a3bb8c.png
        )

    [18] => Array
        (
            [pd_id] => 45
            [model] => midea.aircondition.v1
            [name] => 美的空调
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_06905e4e0bb00ab533f6d676f9c8d674.png
        )

    [19] => Array
        (
            [pd_id] => 47
            [model] => zhimi.airpurifier.v3
            [name] => 小米空气净化器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3647794fe7ac6616f8e1f9d1adde5ba3.png
        )

    [20] => Array
        (
            [pd_id] => 48
            [model] => yunmi.waterpurifier.v2
            [name] => 小米净水器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png
        )

    [21] => Array
        (
            [pd_id] => 49
            [model] => aux.aircondition.v1
            [name] => 奥克斯智能空调
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c1d5aff26a77d53a83937e14e49e6f2a.png
        )

    [22] => Array
        (
            [pd_id] => 51
            [model] => yeelink.light.mono1
            [name] => Yeelight 白光灯泡
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_a52416a647498ca60ae092aed879db1d.png
        )

    [23] => Array
        (
            [pd_id] => 52
            [model] => yeelink.light.color1
            [name] => Yeelight彩光灯泡
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_555cca5a8f557f721b1e69023aabe3ce.png
        )

    [24] => Array
        (
            [pd_id] => 55
            [model] => philips.light.mono1
            [name] => 飞利浦智睿台灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_deb872afca4e5ea36eae93d50225db19.png
        )

    [25] => Array
        (
            [pd_id] => 61
            [model] => lumi.gateway.v2
            [name] => 多功能网关
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5165eb28faa9197d3c31b8fdfd820a3e.png
        )

    [26] => Array
        (
            [pd_id] => 62
            [model] => lumi.sensor_switch.v2
            [name] => 无线开关
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_20be1191605d8f15c940648400e87190.png
        )

    [27] => Array
        (
            [pd_id] => 63
            [model] => lumi.sensor_motion.v2
            [name] => 人体传感器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_61aa54b9af3b397b98c9fd98b0a3bb8c.png
        )

    [28] => Array
        (
            [pd_id] => 64
            [model] => lumi.sensor_magnet.v2
            [name] => 门窗传感器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_807dcca003457f49b5a684de4e87aa13.png
        )

    [29] => Array
        (
            [pd_id] => 65
            [model] => chunmi.cooker.normal1
            [name] => 米家IH电饭煲
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14933815808kqh4p8n.png
        )

    [30] => Array
        (
            [pd_id] => 66
            [model] => chunmi.cooker.press1
            [name] => 米家压力IH电饭煲
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_226c47684603e06a3de9a9b53beba4aa.png
        )

    [31] => Array
        (
            [pd_id] => 70
            [model] => xiaomi.phone_ir.v1
            [name] => 手机红外遥控器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/8fmrd1kr_1442568468.png
        )

    [32] => Array
        (
            [pd_id] => 72
            [model] => aux.aircondition.hc1
            [name] => 奥克斯智能空调
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_a9e717b85191bdf84e5ef82ef24f5927.png
        )

    [33] => Array
        (
            [pd_id] => 75
            [model] => chuangmi.camera.xiaobai
            [name] => 米家小白智能摄像机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_404991a7711596d87ae9dec32ad52c74.png
        )

    [34] => Array
        (
            [pd_id] => 80
            [model] => zhimi.airpurifier.v5
            [name] => 小米空气净化器(已弃用)
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/u93g14af_1443168343.png
        )

    [35] => Array
        (
            [pd_id] => 82
            [model] => yeelink.light.virtual
            [name] => Yeelight 灯组
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e27ef4da2138665130b94b0bfc899142.png
        )

    [36] => Array
        (
            [pd_id] => 83
            [model] => yeelink.light.ble1
            [name] => Yeelight 蓝牙灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_a062df5327808a4e2b20677b75578d56.png
        )

    [37] => Array
        (
            [pd_id] => 84
            [model] => zhimi.fan.v2
            [name] => 智米直流变频落地扇
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_314b348815f4d22687d021eb51c0be4a.png
        )

    [38] => Array
        (
            [pd_id] => 85
            [model] => rockrobo.vacuum.v1
            [name] => 米家扫地机器人
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_430f65a6257b260001e0f7f15b4a6742.png
        )

    [39] => Array
        (
            [pd_id] => 87
            [model] => chuangmi.radio.v1
            [name] => 小米网络收音机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_cf6806e24fd5e83badd034941058f564.png
        )

    [40] => Array
        (
            [pd_id] => 89
            [model] => xiaomi.router.v2
            [name] => 小米路由器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b5efedecf26bf90fb316c41a970f21b5.png
        )

    [41] => Array
        (
            [pd_id] => 90
            [model] => xiaomi.repeater.v1
            [name] => 小米WiFi放大器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_18ee12a81f7f1ec2b19db46df3f12cf5.png
        )

    [42] => Array
        (
            [pd_id] => 91
            [model] => zimi.powerbank.v1
            [name] => 紫米智能移动电源
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/z49h655w_1446041129.jpg
        )

    [43] => Array
        (
            [pd_id] => 93
            [model] => lumi.ctrl_neutral2.v1
            [name] => 墙壁开关（ZigBee双键版）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7e33684032cd5b06b9f2f4c105ffa5cd.png
        )

    [44] => Array
        (
            [pd_id] => 95
            [model] => lumi.sensor_cube.v1
            [name] => 魔方控制器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c2e8dae99c486516c52d925b983eab02.png
        )

    [45] => Array
        (
            [pd_id] => 96
            [model] => lumi.ctrl_neutral1.v1
            [name] => 墙壁开关（ZigBee单键版）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c27cbb48a6d0c2f9c619094b872769a1.png
        )

    [46] => Array
        (
            [pd_id] => 98
            [model] => lumi.sensor_ht.v1
            [name] => 温湿度传感器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_96a468675eb6402b707ded7dbc169760.png
        )

    [47] => Array
        (
            [pd_id] => 99
            [model] => chuangmi.plug.v2
            [name] => 小米智能插座基础版(已失效)
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/e2auc8n6_1445843409.jpg
        )

    [48] => Array
        (
            [pd_id] => 100
            [model] => zhimi.airpurifier.m1
            [name] => 小米空气净化器2代
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_1468d89ca759777116e1de1a793f69bc.png
        )

    [49] => Array
        (
            [pd_id] => 101
            [model] => idelan.aircondition.v1
            [name] => 金兴智能空调
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_40aed5c76c827732da32dcbb8f1dac00.png
        )

    [50] => Array
        (
            [pd_id] => 102
            [model] => zimi.powerstrip.v1
            [name] => 小米智能插线板1
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/xb8h4jlz_1450429702.jpg
        )

    [51] => Array
        (
            [pd_id] => 104
            [model] => roidmi.btfm.v1
            [name] => 睿米车载蓝牙播放器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_41d88c61af42dc97cbfe0d3996304e38.png
        )

    [52] => Array
        (
            [pd_id] => 105
            [model] => xiaomi.router.lv1
            [name] => 小米路由青春版
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_dfed1d0968f8890262fd98580c5a75d0.png
        )

    [53] => Array
        (
            [pd_id] => 108
            [model] => ninebot.balscooter.v1
            [name] => NineBot平衡车
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_dc11f891b6fea41017ba3f180d071582.png
        )

    [54] => Array
       (
            [pd_id] => 109
            [model] => lumi.gateway.v3
            [name] => 多功能网关
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5165eb28faa9197d3c31b8fdfd820a3e.png
        )

    [55] => Array
        (
            [pd_id] => 116
            [model] => haiii.pettag.v1
            [name] => 钮扣狗牌
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/egudz0g2_1446809380.jpg
        )

    [56] => Array
        (
            [pd_id] => 117
            [model] => xiaomi.phone_ir.t1
            [name] => 手机红外遥控器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/4thsxf0u_1442568445.png
        )

    [57] => Array
        (
            [pd_id] => 119
            [model] => ninebot.robot.v1
            [name] => 纳恩博（北京）科技有限公司机器人
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7ac247154adbf7948370fb02e19f3969.png
        )

    [58] => Array
       (
            [pd_id] => 121
            [model] => qmi.powerstrip.v1
            [name] => 青米智能插排
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_38b558144a95987cb09efd398774ea7b.png
        )

    [59] => Array
        (
            [pd_id] => 125
            [model] => chuangmi.wifi.v1
            [name] => 小米随身WIFI
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_1512f5c8e765c56f6589f1997558b669.png
        )

    [60] => Array
        (
            [pd_id] => 126
            [model] => zimi.powerstrip.v2
            [name] => 米家智能插线板
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_2656ef1cd114c7bd4f8596217b563340.png
        )

    [61] => Array
        (
            [pd_id] => 127
            [model] => nhy.airrtc.v1
            [name] => 丹麦格澜供暖
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1467809463ob77tl5s.png
        )

    [62] => Array
        (
            [pd_id] => 128
            [model] => nhy.wst.v1
            [name] => 華祐微電腦寧波有限公司温室计
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1449212398sz9r4sah.png
        )

    [63] => Array
        (
            [pd_id] => 129
            [model] => midea.aircondition.xa1
            [name] => 美的空调 - 酷金
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_4f909df26c6822b5f71cd083bbeaa5ee.png
        )

    [64] => Array
        (
            [pd_id] => 130
            [model] => chuangmi.plug.m1
            [name] => 米家智能插座基础版
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f83a00cee71250f746e44a9ce5cdd62e.png
        )

    [65] => Array
        (
            [pd_id] => 131
            [model] => yunmi.kettle.v1
            [name] => 米家恒温电水壶
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ccf4478df7254c7b01ae6577fffb472a.png
        )

    [66] => Array
       (
            [pd_id] => 133
            [model] => zhimi.humidifier.v1
            [name] => 智米除菌加湿器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_63df315aa8d3ab09fe150563e5e3fe52.png
        )

    [67] => Array
        (
            [pd_id] => 134
            [model] => zhimi.airpurifier.vtl_v3
            [name] => 小米空气净化器（虚拟）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/ivq2ncns_1447830114.jpg
        )

    [68] => Array
        (
            [pd_id] => 136
            [model] => lumi.plug.v1
            [name] => 智能插座(ZigBee版)
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f83a00cee71250f746e44a9ce5cdd62e.png
        )

    [69] => Array
        (
            [pd_id] => 137
            [model] => xiaomi.wifispeaker.v1
            [name] => 小米网络音响
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1482735389oewhfe5f.png
        )

    [70] => Array
        (
            [pd_id] => 140
            [model] => yunmi.waterpurifier.vtl_v2
            [name] => 小米净水器（虚拟）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/hluek6hw_1447920636.jpg
        )

    [71] => Array
        (
            [pd_id] => 141
            [model] => aux.aircondition.vtl_v1
            [name] => 奥克斯智能空调（虚拟）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/63anb73l_1447830665.jpg
        )

    [72] => Array
        (
            [pd_id] => 144
            [model] => neat.curtain.v1
            [name] => 尼特窗帘
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/f8u9hl0e_1448591378.png
        )

    [73] => Array
        (
            [pd_id] => 145
            [model] => chuangmi.plug.vtl_v1
            [name] => 小米智能插座（虚拟）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/4510vm7e_1447936312.jpg
        )

    [74] => Array
        (
            [pd_id] => 146
            [model] => yeelink.light.vtl_ble1
            [name] => Yeelight 床头灯（虚拟）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/u4slhdea_1447830498.jpg
        )

    [75] => Array
        (
            [pd_id] => 148
            [model] => zhimi.airpurifier.vtl_m1
            [name] => 小米空气净化器2代（虚拟）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio_user_head/k9vvdvcw_1447920606.jpg
        )

    [76] => Array
        (
            [pd_id] => 149
            [model] => runmi.suitcase.v1
            [name] => 90分智能金属旅行箱
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ab27def825dbbe27d63456a956a80963.png
        )

    [77] => Array
        (
            [pd_id] => 150
            [model] => yeelink.light.lamp1
            [name] => 米家台灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5f1f5c73f2ddd0da5abf434405ee2053.png
        )

    [78] => Array
        (
            [pd_id] => 151
            [model] => ihealth.bp.bpm1
            [name] => iHealth血压计
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_683df141b44e30b1d256a58a105b66c8.png
        )

    [79] => Array
        (
            [pd_id] => 152
            [model] => hhcc.plantmonitor.v1
            [name] => 花花草草监测仪
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f0d046e296fb20991e9aa9b2b55be427.png
        )

    [80] => Array
        (
            [pd_id] => 154
            [model] => zhimi.airpurifier.virtual
            [name] => 小米空气净化器组
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_dc292e50bd9d6413ae73f2111d419938.png
        )

    [81] => Array
        (
            [pd_id] => 156
            [model] => xiaomi.bledemo.v1
            [name] => 小米蓝牙开发板
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7469b9dc0399ea38876edbb881d7c5c7.png
        )

    [82] => Array
        (
            [pd_id] => 158
            [model] => liuguodong.watch.testv1
            [name] => test
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1456385135vzy462ak.jpg
        )

    [83] => Array
        (
            [pd_id] => 161
            [model] => lumi.sensor_86sw1.v1
            [name] => 无线开关（贴墙式单键版）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_28eaab60a1dd5c9f0d5dd5b400a87149.png
        )

    [84] => Array
        (
           [pd_id] => 162
            [model] => lumi.sensor_86sw2.v1
            [name] => 无线开关（贴墙式双键版）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b4efeddf4b3004c60d5863a90f043f09.png
        )

    [85] => Array
        (
            [pd_id] => 163
            [model] => lumi.curtain.v1
            [name] => 智能窗帘电机(ZigBee开合帘版)
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f4e07fd64e847d8e22ad1b7a16d93894.png
        )

    [86] => Array
        (
            [pd_id] => 165
            [model] => minij.washer.v1
            [name] => 小吉洗衣机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_d68e47ad1043f284261d395fd3fda572.png
        )

    [87] => Array
        (
            [pd_id] => 169
            [model] => yunzao.yunbikec1.v1
            [name] => 云马C1
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1451885541l9s885fl.png
        )

    [88] => Array
        (
            [pd_id] => 170
            [model] => xiaoxun.watch.v1
            [name] => 米兔手表
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_616c798a45cb7fcbb32c421d92ec0a7d.png
        )

    [89] => Array
        (
            [pd_id] => 174
            [model] => yunmi.waterpurifier.v3
            [name] => 小米净水器厨下式
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png
        )

    [90] => Array
        (
            [pd_id] => 184
            [model] => zimi.powerstrip.vtl_v2
            [name] => 小米智能插线板（虚拟）
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_jpg_17cdc988e69309c22ffb22085b6e55de.jpg
        )

    [91] => Array
        (
            [pd_id] => 185
            [model] => idelan.aircondition.v2
            [name] => 金兴智能空调
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_40aed5c76c827732da32dcbb8f1dac00.png
        )

    [92] => Array
        (
            [pd_id] => 186
            [model] => jiqid.mistory.v1
            [name] => 米兔智能故事机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_03566fdc9b7c233970ba2874f2acebd1.png
        )

    [93] => Array
        (
            [pd_id] => 187
            [model] => yunmi.waterpuri.lx2
            [name] => 小米净水器厨上版
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png
        )

    [94] => Array
        (
            [pd_id] => 188
            [model] => yunmi.waterpuri.lx3
            [name] => 小米净水器厨下式
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png
        )

    [95] => Array
        (
            [pd_id] => 189
            [model] => scishare.coffee.s1101
            [name] => 心想智能咖啡机
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14594085626ib0z6xd.png
        )

    [96] => Array
        (
            [pd_id] => 193
            [model] => zhimi.airmonitor.v1
            [name] => 米家PM2.5检测仪
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_fe9a0219e8db1e23d6b0e30bd722ace7.png
        )

    [97] => Array
        (
            [pd_id] => 197
            [model] => xiaomi.router.v3
            [name] => 小米路由器3
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_de02e9835a69f648119753f1de8c054f.png
        )

    [98] => Array
        (
            [pd_id] => 198
            [model] => innolinks.plug.ap3200
            [name] => 空调智能插座
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c35ff7dfee9fe1af4ce08e2f7a42c0f5.png
        )

    [99] => Array
        (
            [pd_id] => 199
            [model] => philips.light.sread1
            [name] => 飞利浦智睿台灯二代
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7cdda2ef7b962532d372605cfdd8c6cf.png
        )

    [100] => Array
        (
            [pd_id] => 201
            [model] => scishare.coffee.s1102
            [name] => 心想智能咖啡机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b4c935f6e22fadd8bf6e489ce201be42.png
        )

    [101] => Array
        (
            [pd_id] => 203
            [model] => yeelink.light.strip1
            [name] => Yeelight彩光灯带
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7802ab16888a1ac53a5059b0e9fdfc2a.png
        )

    [102] => Array
        (
            [pd_id] => 204
            [model] => xiaoyiyi.light.v1
            [name] => 广义的设备
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1458562150w9kjhgjt.jpg
        )

    [103] => Array
        (
            [pd_id] => 205
            [model] => onemore.soundbox.sm001
            [name] => 小米音乐闹钟
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1491788703lrok9kzv.png
        )

    [104] => Array
        (
            [pd_id] => 206
            [model] => soocare.toothbrush.x3
            [name] => 素士声波电动牙刷
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_14d563afef3d16a05584f3862384967b.png
        )

    [105] => Array
        (
            [pd_id] => 207
            [model] => bmwcdl.car.v1
            [name] => BMW实验室微件
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1460019582wdanwmyn.png
        )

    [106] => Array
        (
            [pd_id] => 217
            [model] => lumi.sensor_smoke.v1
            [name] => 烟雾报警器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b1f3f609ae3874869522387f1958c379.png
        )

    [107] => Array
        (
            [pd_id] => 219
            [model] => miaomiaoce.thermo.t01
            [name] => 秒秒测智能体温计
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_d64885b920962f6cf023a3a3f02f5999.png
        )

    [108] => Array
        (
            [pd_id] => 240
            [model] => xiaomi.tvbox.v208
            [name] => 小米盒子增强版
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_76197396f2364d6ded68fdd9c0bf2a6b.png
        )

    [109] => Array
        (
            [pd_id] => 243
            [model] => idelan.aircondition.g2
            [name] => 金兴智能空调
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_88f077a74ed871ce24dc1c5b7eeae887.png
        )

    [110] => Array
        (
            [pd_id] => 244
            [model] => idelan.aircondition.g1
            [name] => 金兴智能空调
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_88f077a74ed871ce24dc1c5b7eeae887.png
        )

    [111] => Array
        (
            [pd_id] => 245
            [model] => lumi.acpartner.v1
            [name] => 空调伴侣
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_8e88d8f5ce073a5daf9ed1cf2eebce70.png
        )

    [112] => Array
        (
            [pd_id] => 250
            [model] => lumi.sensor_natgas.v1
            [name] => 天然气报警器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_0481ab23951187ffc2997cf9751bd907.png
        )

    [113] => Array
        (
            [pd_id] => 256
            [model] => yunmi.waterpuri.v1
            [name] => V1乐享版 人工智能系列
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14879883928ur29f5k.png
        )

    [114] => Array
        (
            [pd_id] => 257
            [model] => chunmi.cooker.normal2
            [name] => 米家IH电饭煲
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_226c47684603e06a3de9a9b53beba4aa.png
        )

    [115] => Array
        (
            [pd_id] => 264
            [model] => nhy.rtc.rtc730
            [name] => 華祐空調
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1464766090c9cx8wdo.png
        )

    [116] => Array
        (
            [pd_id] => 265
            [model] => nhy.rtc.pexrtc730
            [name] => 丹麦格澜空调
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1467810008bfhxapsl.png
        )

    [117] => Array
        (
            [pd_id] => 269
            [model] => insistek.tracker.wa620
            [name] => 米哇定位豆
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1469786116yynoeu6x.png
        )

    [118] => Array
        (
            [pd_id] => 274
            [model] => yeelink.light.bslamp1
            [name] => 床头灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_81312b6c81b3934fc78999f57fe27b1c.png
        )

    [119] => Array
        (
            [pd_id] => 275
            [model] => yunmi.kettle.v2
            [name] => 米家恒温电水壶
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ccf4478df7254c7b01ae6577fffb472a.png
        )

    [120] => Array
        (
            [pd_id] => 278
            [model] => xiaoxun.tracker.v1
            [name] => 米兔定位电话
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_42ed8664735fdf13b6e0f967c2b681d7.png
        )

    [121] => Array
        (
            [pd_id] => 282
            [model] => isa.camera.isc5
            [name] => 小方智能摄像机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_37d28d8dd968d4ca9e167a7e855af65f.png
        )

    [122] => Array
        (
            [pd_id] => 283
            [model] => mijia.camera.v1
            [name] => 米家智能摄像机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_709fde2962ca951fd8b130491ae3e337.png
        )

    [123] => Array
        (
            [pd_id] => 284
            [model] => yunyi.camera.mj1
            [name] => 米家小蚁智能摄像机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e0f011529083b6f503b3a293f3cde721.png
        )

    [124] => Array
        (
            [pd_id] => 286
            [model] => thinks.lunar.xm1
            [name] => 智能睡眠传感器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_67f02973ea438421ed266e27616c6f59.png
        )

    [125] => Array
        (
            [pd_id] => 287
            [model] => chuangmi.radio.v2
            [name] => 小米网络收音机增强版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1472439133fj4zludm.jpg
        )

    [126] => Array
        (
            [pd_id] => 289
            [model] => roidmi.btfm.m1
            [name] => 音乐蓝牙车充
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_46197436a9e8b5d0f081ab9279b12fbb.png
        )

    [127] => Array
        (
            [pd_id] => 290
            [model] => chunmi.cooker.normal3
            [name] => 米家IH电饭煲 4L
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1484619599zmnv874r.png
        )

    [128] => Array
        (
            [pd_id] => 293
            [model] => xiaomi.router.lv3
            [name] => 小米路由器R3C
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_de02e9835a69f648119753f1de8c054f.png
        )

    [129] => Array
        (
            [pd_id] => 294
            [model] => xiaomi.watch.band2
            [name] => 小米手环
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_64d4d4b22eb2209eab4e10a15fab273d.png
        )

    [130] => Array
        (
            [pd_id] => 295
            [model] => xiaomi.watch.band1S
            [name] => 小米手环
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e514e9562bb1d0877d1cc7a7120ec59c.png
        )

    [131] => Array
        (
            [pd_id] => 296
            [model] => xiaomi.watch.band1A
            [name] => 小米手环
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e514e9562bb1d0877d1cc7a7120ec59c.png
        )

    [132] => Array
        (
            [pd_id] => 297
            [model] => rokid.robot.alien
            [name] => Rokid 机器人
            [icon_real] => http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_9e0b56130237619bb7fe3ff2538026c2.png
        )

    [133] => Array
        (
            [pd_id] => 322
            [model] => zhimi.airpurifier.v6
            [name] => 米家空气净化器Pro
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_886ed96be0766f5b2a899f0d43257361.png
        )

   [134] => Array
        (
            [pd_id] => 331
            [model] => ksmb.walkingpad.v1
            [name] => WalkingPad
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1493881617zv5w221f.png
        )

    [135] => Array
        (
            [pd_id] => 332
            [model] => roidmi.carairpuri.v1
            [name] => 米家车载空气净化器
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_78b0420af3d304f406595bbc4db43b1b.png
        )

    [136] => Array
        (
            [pd_id] => 333
            [model] => xiaomi.router.r3p
            [name] => 小米路由器Pro
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1489126463wwwsat1z.png
        )

    [137] => Array
        (
            [pd_id] => 335
            [model] => mijia.test.vtl_v1
            [name] => 红米Note 4 千元旗舰，新机首发！
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_jpeg_c849c34b6069cad95fc611c1a0c5d45c.jpeg
        )

    [138] => Array
        (
            [pd_id] => 336
            [model] => isa.camera.virtual
            [name] => 小方智能摄像机组
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_2196eaa3f9146352c69ec792cf5fbb0c.png
        )

    [139] => Array
        (
            [pd_id] => 340
            [model] => midr.cardvr.v1
            [name] => 米家行车记录仪
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_cb3319cbf797d92e3b67d8d591a59c50.png
        )

    [140] => Array
        (
            [pd_id] => 342
            [model] => ninebot.scooter.v1
            [name] => 电动滑板车
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3582c1d2cbe485aa229082328c0bfdbc.png
        )

    [141] => Array
        (
            [pd_id] => 343
            [model] => desay.bleshoes.s311
            [name] => 智能跑鞋
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1486806634f3or28gg.png
        )

    [142] => Array
        (
            [pd_id] => 344
            [model] => yeelink.light.ceiling1
            [name] => Yeelight LED吸顶灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_76a320138443dc8279275910d82855ff.png
        )

    [143] => Array
        (
            [pd_id] => 349
            [model] => hhcc.bleflowerpot.v2
            [name] => 花花草草蓝牙花盆
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_be7e943ccc77ff10eae2719fee3c73e1.png
        )

    [144] => Array
        (
            [pd_id] => 354
            [model] => lumi.weather.v1
            [name] => Aqara温湿度传感器
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1496316789rx6ya4pp.png
        )

    [145] => Array
        (
            [pd_id] => 355
            [model] => lumi.ctrl_86plug.v1
            [name] => 墙壁插座(ZigBee版)
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_74344f1c0c388dd6b8f36ab7874e6364.png
        )

    [146] => Array
        (
            [pd_id] => 356
            [model] => lumi.ctrl_ln2.v1
            [name] => 墙壁开关(零火双键)
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1480647278houyjf4c.png
        )

    [147] => Array
        (
            [pd_id] => 357
            [model] => lumi.ctrl_ln1.v1
            [name] => 墙壁开关(零火单键)
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1480647296kkbubrup.png
        )

    [148] => Array
        (
            [pd_id] => 360
            [model] => midea.aircondition.xa2
            [name] => 美的空调 - 酷金
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_054c9dff5fe0e37036a7dc1d5dbd3210.png
        )

    [149] => Array
        (
            [pd_id] => 362
            [model] => xiaomi.plc.v1
            [name] => 小米WiFi电力猫
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_fb494857a655d7123f9754c33b671fc6.png
        )

    [150] => Array
        (
            [pd_id] => 365
            [model] => lumi.sensor_occupy.v1
            [name] => 有人无人软传感器
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1492161850dwm1kfza.png
        )

    [151] => Array
        (
            [pd_id] => 366
            [model] => nuwa.robot.kiwi1
            [name] => 女娲创造机器人
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_147514159468rkkugs.jpg
        )

    [152] => Array
        (
            [pd_id] => 367
            [model] => xiaomi.repeater.v2
            [name] => 小米WiFi放大器2代
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_8d28a10c23ca6f1733229d864ea81683.png
        )

    [153] => Array
        (
            [pd_id] => 376
            [model] => xiaoxun.watch.v2
            [name] => 小寻手表 彩屏版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1484300110iz54yay4.png
        )

    [154] => Array
        (
            [pd_id] => 378
            [model] => mijia.camera.v2
            [name] => 米家摄像头v2
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_709fde2962ca951fd8b130491ae3e337.png
        )

    [155] => Array
        (
            [pd_id] => 379
            [model] => xiaomi.wifispeaker.v2
            [name] => 小米网络音响
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1482728753v3o5anu4.png
        )

    [156] => Array
        (
            [pd_id] => 380
            [model] => chuangmi.camera.v2
            [name] => 米家智能摄像机云台版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1500263625lbjksgmc.png
        )

    [157] => Array
        (
            [pd_id] => 385
            [model] => lumi.sensor_wleak.aq1
            [name] => 水浸传感器
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1502076183dvhangsz.png
        )

    [158] => Array
        (
            [pd_id] => 386
            [model] => lumi.vibration.aq1
            [name] => 动静贴
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_jpg_e9387c6b3a304a18e933cefb7b5ade22.jpg
        )

    [159] => Array
        (
            [pd_id] => 390
            [model] => chunmi.cooker.press2
            [name] => 米家压力IH电饭煲
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1484619548gct5el7r.png
        )

    [160] => Array
        (
            [pd_id] => 391
            [model] => chunmi.cooker.normal4
            [name] => 米家IH电饭煲 4L
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1489402595sy8gqn8c.png
        )

    [161] => Array
        (
            [pd_id] => 393
            [model] => philips.light.ceiling
            [name] => 飞利浦智睿吸顶灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3568754428ab7e71aaa816869bf95987.png
        )

    [162] => Array
        (
            [pd_id] => 394
            [model] => lumi.acpartner.v2
            [name] => 米家空调伴侣
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_bec4e05e6e7e4bb59288c6f307076d47.png
        )

    [163] => Array
        (
            [pd_id] => 395
            [model] => yunmi.kettle.v3
            [name] => 米家恒温电水壶
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1480556341bi3sgy2e.png
        )

    [164] => Array
        (
            [pd_id] => 397
            [model] => yunmai.scales.m1690
            [name] => 好轻mini2智能体脂秤
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1489375908ltfdcyzg.png
        )

    [165] => Array
        (
            [pd_id] => 402
            [model] => bys.toothbrush.v1
            [name] => 贝医生牙刷
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7929ad23965c8682261a8af7d2bf6a28.png
        )

    [166] => Array
        (
            [pd_id] => 403
            [model] => trios.bleshoes.v1
            [name] => 米家智能鞋
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_148843175457o7qbds.png
        )

    [167] => Array
        (
            [pd_id] => 410
            [model] => juanxm.camera.p720v1
            [name] => 大瞳全景摄像机
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1494065237cf2fr7d8.png
        )

    [168] => Array
        (
            [pd_id] => 411
            [model] => lumi.lock.v1
            [name] => 智能门锁
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_15007928738ns3f7z0.png
        )

    [169] => Array
        (
            [pd_id] => 412
            [model] => zlife.towel.b1
            [name] => 最生活浴巾
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e2e4949ca930baf34f0e2da4697f4402.png
        )

    [170] => Array
        (
            [pd_id] => 413
            [model] => zlife.towel.v1
            [name] => 最生活毛巾
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_50686dc59fadcc42f6a1a112df099a3d.png
        )

    [171] => Array
        (
            [pd_id] => 416
            [model] => onemore.soundbox.sm002
            [name] => 小米蓝牙闹钟音箱
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1492410088q9mrh72g.png
        )

    [172] => Array
        (
            [pd_id] => 417
            [model] => soocare.toothbrush.m1
            [name] => 米家声波电动牙刷
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1490255883fhhbkn0u.png
        )

    [173] => Array
        (
            [pd_id] => 420
            [model] => xiaoxun.watch.v3
            [name] => 米兔手表_V3
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1493023452azzuwnpe.png
        )

    [174] => Array
        (
            [pd_id] => 421
            [model] => xiaoxun.watch.v4
            [name] => 米兔手表_V4
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1482824502h8v0uu21.png
        )

    [175] => Array
        (
            [pd_id] => 422
            [model] => zhimi.aircondition.v2
            [name] => 智米全直流变频空调
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14998479025axz7xw5.png
        )

    [176] => Array
        (
            [pd_id] => 428
            [model] => inshow.watch.w1
            [name] => 米家石英表
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1502432806rqpersn6.png
        )

    [177] => Array
        (
            [pd_id] => 429
            [model] => fimi.camera.c1
            [name] => 米家小相机
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f75c7d11bc705ca1a17dacc905860424.png
        )

    [178] => Array
        (
            [pd_id] => 431
            [model] => philips.light.bulb
            [name] => 飞利浦智睿球泡灯
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_475f7d736df3cdf5d850c051128bf1ad.png
        )

    [179] => Array
        (
            [pd_id] => 439
            [model] => leravan.magic_touch.H10
            [name] => 蓝牙版加热魔力贴（低周波按摩器）
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1499931882501v2ka8.jpg
        )

    [180] => Array
        (
            [pd_id] => 444
            [model] => lumi.camera.aq1
            [name] => Aqara智能摄像机（网关版）
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1499848090ykfv0oex.png
        )

    [181] => Array
        (
            [pd_id] => 450
            [model] => lumi.sensor_magnet.aq2
            [name] => Aqara门窗传感器
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1496316671qhq4awpy.png
        )

    [182] => Array
        (
            [pd_id] => 451
            [model] => lumi.sensor_motion.aq2
            [name] => Aqara人体传感器
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1497860237yj46gwyg.png
        )

    [183] => Array
        (
            [pd_id] => 452
            [model] => lumi.sensor_switch.aq2
            [name] => Aqara无线开关
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1499744621bz4mq2wy.png
        )

    [184] => Array
        (
            [pd_id] => 454
            [model] => xiaomi.router.r3d
            [name] => 小米路由器HD
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1489127998reibba40.png
        )

    [185] => Array
        (
            [pd_id] => 455
            [model] => zhimi.airpurifier.m2
            [name] => 小米空气净化器2代
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1490253124b61k6mjm.png
        )

    [186] => Array
        (
            [pd_id] => 459
            [model] => xiaomi.router.r3g
            [name] => 小米路由器3G
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1492483320gkml4jg7.png
        )

    [187] => Array
        (
            [pd_id] => 460
            [model] => xiaomi.router.r3a
            [name] => 小米路由器3A
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14924833904f2h0eip.png
        )

    [188] => Array
        (
            [pd_id] => 461
            [model] => rotai.massage.rt5850
            [name] => 按摩椅RT5850
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1502766262xl1tampm.png
        )

    [189] => Array
        (
            [pd_id] => 462
            [model] => philips.light.virtual
            [name] => 飞利浦智睿系列灯组
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ad4d50fefe922422921ef4fe7778fe4a.png
        )

    [190] => Array
        (
            [pd_id] => 464
            [model] => xiaomi.wifispeaker.s12
            [name] => 小米AI音箱
            [icon_real] => http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_05bcd35fdcc04e7fbcda9c3bc430957b.png
        )

    [191] => Array
        (
            [pd_id] => 465
            [model] => zhimi.fan.v3
            [name] => 智米直流变频落地扇
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14902525278x9u8ox6.png
        )

    [192] => Array
        (
            [pd_id] => 466
            [model] => xiaomi.repeater.v3
            [name] => 小米WiFi放大器Pro
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1491877770zn0j4rv9.png
        )

    [193] => Array
        (
            [pd_id] => 472
            [model] => hmpace.watch.v1
            [name] => Amazfit手表
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14949236089rhga9ry.png
        )

    [194] => Array
        (
            [pd_id] => 476
            [model] => bugoo.tpms.g1
            [name] => 布古智能胎压监测器
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1498810367ms4vb15o.png
        )

    [195] => Array
        (
            [pd_id] => 477
            [model] => joyril.light.v001
            [name] => joyrill智能顶灯
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1491892486b3hukwdx.jpg
        )

    [196] => Array
        (
            [pd_id] => 478
            [model] => cgllc.airmonitor.b1
            [name] => 米家空气检测仪
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1496916674c33mpakq.png
        )

    [197] => Array
        (
            [pd_id] => 479
            [model] => chuangmi.camera.v3
            [name] => 米家智能摄像机云台增强版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1501753401vpaqhib9.png
        )

    [198] => Array
        (
            [pd_id] => 481
            [model] => chuangmi.plug.m2
            [name] => 米家智能插座基础版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14919090390yd2z4aq.png
        )

    [199] => Array
        (
            [pd_id] => 483
            [model] => kola.milk.v1
            [name] => 考拉妈妈智能冲奶机
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1500544650y77lxasn.png
        )

    [200] => Array
        (
            [pd_id] => 486
            [model] => yunmi.waterpuri.lx4
            [name] => 小米净水器厨上增强版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14927702920fm5vps7.jpg
        )

    [201] => Array
        (
            [pd_id] => 490
            [model] => isa.camera.df3
            [name] => 大方智能摄像机(1080P云台版)
            [icon_real] => http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_a05222307f69e63c5f7c002fcedcd755.png
        )

    [202] => Array
        (
            [pd_id] => 507
            [model] => lumi.lock.aq1
            [name] => Aqara智能门锁
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1497860519uef6ut4f.png
        )

    [203] => Array
        (
            [pd_id] => 508
            [model] => yeelink.light.ceiling2
            [name] => Yeelight LED吸顶灯(青春版)
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1496373605i830ob3b.png
        )

    [204] => Array
        (
            [pd_id] => 512
            [model] => chuangmi.plug.v3
            [name] => 米家智能插座增强版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14938878937pwj04rp.png
        )

    [205] => Array
        (
            [pd_id] => 513
            [model] => yeelink.light.ceiling3
            [name] => Yeelight LED吸顶灯(皎月系列)
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1500887836qfgbqwws.png
        )

    [206] => Array
        (
            [pd_id] => 514
            [model] => yeelink.light.ceiling4
            [name] => Yeelight LED吸顶灯(皎月系列)
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1500887879z263swm0.png
        )

    [207] => Array
        (
            [pd_id] => 530
            [model] => chuangmi.camera.v5
            [name] => 小白智能摄像机大众版
            [icon_real] => http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_6f2ec4b90ac71ae3ee0ef090224c5f74.png
        )

    [208] => Array
        (
            [pd_id] => 544
            [model] => rokid.robot.pebble
            [name] => Rokid 月石
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_149846966517c0wnrm.png
        )

    [209] => Array
        (
            [pd_id] => 547
            [model] => jhkj.manager.v1
            [name] => keyblack开吧智能锁
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1498793937voei9df3.jpg
        )

    [210] => Array
        (
            [pd_id] => 549
            [model] => xiaoai.insole.v1
            [name] => 芯迈芯迈鞋垫
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_14976070915068oc7n.png
        )

    [211] => Array
        (
            [pd_id] => 551
            [model] => lumi.sensor_cube.aq2
            [name] => Aqara无线开关升级版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1499411972qfa328ho.png
        )

    [212] => Array
        (
            [pd_id] => 556
            [model] => yunmi.kettle.r1
            [name] => 云米智能即热饮水吧（MINI）
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1500518319znggxg14.png
        )

    [213] => Array
        (
            [pd_id] => 572
            [model] => xiaoxun.watch.v5
            [name] => 小寻儿童电话手表S1
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_15026903543fhg1byb.png
        )

    [214] => Array
        (
            [pd_id] => 586
            [model] => lumi.sensor_switch.aq3
            [name] => Aqara无线开关升级版
            [icon_real] => http://static.home.mi.com/app/image/get/file/developer_1501573746ptlqibw5.png

"""

    val result = str.split("Array").map { s =>
        var pd_id = 0
        var model = ""
        var name = ""
        var icon_real = ""
        s.split("\n").foreach { ss =>
            if (ss.contains("pd_id"))
                pd_id = ss.substring(ss.indexOf(" =>") + 3).trim.toInt
            if (ss.contains("model"))
                model = "\"" + ss.substring(ss.indexOf(" =>") + 3).trim + "\""
            if (ss.contains("name"))
                name = "\"" + ss.substring(ss.indexOf(" =>") + 3).trim + "\""
            if (ss.contains("icon_real"))
                icon_real = "\"" + ss.substring(ss.indexOf(" =>") + 3).trim + "\""
        }
        MiotModel(pd_id, model, name, icon_real)
    }.toList
    //println(result.toString().replace("),", "),\n"))
    // result.map(model => s"${model.pd_id}\t${model.model}\t${model.name}\t${model.icon_real}").foreach(println)

    val map = result.map(model => (model.model.replace("\"", ""), model)).toMap[String, MiotModel]
    val sc = new java.util.Scanner(System.in)
    while (sc.hasNext()) {
        var s = sc.nextLine().trim
        try {
        s = s.substring(s.indexOf("device:")).replace("device:","")
        s = s.substring(0,s.indexOf(":"))

            println(s"$s")
        } catch {
            case e: Exception => println("")
        }
    }

    List(MiotModel(13, "yunyi.camera.v1", "小蚁智能摄像机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5794f76c80ea56b895cec4263057a5e1.png"),
        MiotModel(14, "chuangmi.plug.v1", "小米智能插座", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5710dd5fd74695697baab01b30e35f83.png"),
        MiotModel(15, "yunmi.waterpurifier.v1", "小米净水器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c4164c051bf1eb983206bd9e3b1fa2ef.png"),
        MiotModel(18, "zhimi.airpurifier.v1", "小米空气净化器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3647794fe7ac6616f8e1f9d1adde5ba3.png"),
        MiotModel(21, "xiaomi.watch.band1", "小米手环", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e514e9562bb1d0877d1cc7a7120ec59c.png"),
        MiotModel(23, "chuangmi.ir.v2", "小米万能遥控器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_eaf1ad338108329ae84db65d8e632dc2.png"),
        MiotModel(24, "lumi.gateway.v1", "多功能网关", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5165eb28faa9197d3c31b8fdfd820a3e.png"),
        MiotModel(26, "xiaomi.router.v1", "小米路由器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b0183dec96fa154daef0cdbb05ce1f06.png"),
        MiotModel(27, "xiaomi.router.mv1", "小米路由器mini", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_9da081b8e0cef1167e1a964b05e8ece7.png"),
        MiotModel(28, "xiaomi.tv.v1", "小米电视", "http://cdn.fds.api.xiaomi.com/miio_user_head/zwbo9ndc_1446040571.jpg"),
        MiotModel(30, "xiaomi.tvbox.v1", "小米电视盒子", "http://cdn.fds.api.xiaomi.com/miio_user_head/0rfunwjf_1446040559.jpg"),
        MiotModel(34, "zhimi.airpurifier.v2", "小米空气净化器", "http://cdn.fds.api.xiaomi.com/miio_user_head/0l35j0oa_1446086740.jpg"),
        MiotModel(37, "yeelink.light.rgb1", "Yeelight 灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_65ac513061d60ace68725b3d0fdca2e0.png"),
        MiotModel(38, "xiaomi.demo.v1", "小米开发板", "http://cdn.fds.api.xiaomi.com/miio_user_head/gtdixy24_1443015351.png"),
        MiotModel(40, "xiaomi.demo.v2", "小米开发板", "http://cdn.fds.api.xiaomi.com/miio_user_head/my0ummof_1445828928.png"),
        MiotModel(41, "lumi.sensor_switch.v1", "无线开关", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_cee8ad903bf159e1d9c456f0abe526e3.png"),
        MiotModel(42, "lumi.sensor_magnet.v1", "门窗传感器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_540289677272929b4abec814b43ad6e9.png"),
        MiotModel(43, "lumi.sensor_motion.v1", "人体传感器", "http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_61aa54b9af3b397b98c9fd98b0a3bb8c.png"),
        MiotModel(45, "midea.aircondition.v1", "美的空调", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_06905e4e0bb00ab533f6d676f9c8d674.png"),
        MiotModel(47, "zhimi.airpurifier.v3", "小米空气净化器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3647794fe7ac6616f8e1f9d1adde5ba3.png"),
        MiotModel(48, "yunmi.waterpurifier.v2", "小米净水器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png"),
        MiotModel(49, "aux.aircondition.v1", "奥克斯智能空调", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c1d5aff26a77d53a83937e14e49e6f2a.png"),
        MiotModel(51, "yeelink.light.mono1", "Yeelight 白光灯泡", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_a52416a647498ca60ae092aed879db1d.png"),
        MiotModel(52, "yeelink.light.color1", "Yeelight彩光灯泡", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_555cca5a8f557f721b1e69023aabe3ce.png"),
        MiotModel(55, "philips.light.mono1", "飞利浦智睿台灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_deb872afca4e5ea36eae93d50225db19.png"),
        MiotModel(61, "lumi.gateway.v2", "多功能网关", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5165eb28faa9197d3c31b8fdfd820a3e.png"),
        MiotModel(62, "lumi.sensor_switch.v2", "无线开关", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_20be1191605d8f15c940648400e87190.png"),
        MiotModel(63, "lumi.sensor_motion.v2", "人体传感器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_61aa54b9af3b397b98c9fd98b0a3bb8c.png"),
        MiotModel(64, "lumi.sensor_magnet.v2", "门窗传感器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_807dcca003457f49b5a684de4e87aa13.png"),
        MiotModel(65, "chunmi.cooker.normal1", "米家IH电饭煲", "http://static.home.mi.com/app/image/get/file/developer_14933815808kqh4p8n.png"),
        MiotModel(66, "chunmi.cooker.press1", "米家压力IH电饭煲", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_226c47684603e06a3de9a9b53beba4aa.png"),
        MiotModel(70, "xiaomi.phone_ir.v1", "手机红外遥控器", "http://cdn.fds.api.xiaomi.com/miio_user_head/8fmrd1kr_1442568468.png"),
        MiotModel(72, "aux.aircondition.hc1", "奥克斯智能空调", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_a9e717b85191bdf84e5ef82ef24f5927.png"),
        MiotModel(75, "chuangmi.camera.xiaobai", "米家小白智能摄像机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_404991a7711596d87ae9dec32ad52c74.png"),
        MiotModel(80, "zhimi.airpurifier.v5", "小米空气净化器(已弃用)", "http://cdn.fds.api.xiaomi.com/miio_user_head/u93g14af_1443168343.png"),
        MiotModel(82, "yeelink.light.virtual", "Yeelight 灯组", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e27ef4da2138665130b94b0bfc899142.png"),
        MiotModel(83, "yeelink.light.ble1", "Yeelight 蓝牙灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_a062df5327808a4e2b20677b75578d56.png"),
        MiotModel(84, "zhimi.fan.v2", "智米直流变频落地扇", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_314b348815f4d22687d021eb51c0be4a.png"),
        MiotModel(85, "rockrobo.vacuum.v1", "米家扫地机器人", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_430f65a6257b260001e0f7f15b4a6742.png"),
        MiotModel(87, "chuangmi.radio.v1", "小米网络收音机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_cf6806e24fd5e83badd034941058f564.png"),
        MiotModel(89, "xiaomi.router.v2", "小米路由器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b5efedecf26bf90fb316c41a970f21b5.png"),
        MiotModel(90, "xiaomi.repeater.v1", "小米WiFi放大器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_18ee12a81f7f1ec2b19db46df3f12cf5.png"),
        MiotModel(91, "zimi.powerbank.v1", "紫米智能移动电源", "http://cdn.fds.api.xiaomi.com/miio_user_head/z49h655w_1446041129.jpg"),
        MiotModel(93, "lumi.ctrl_neutral2.v1", "墙壁开关（ZigBee双键版）", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7e33684032cd5b06b9f2f4c105ffa5cd.png"),
        MiotModel(95, "lumi.sensor_cube.v1", "魔方控制器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c2e8dae99c486516c52d925b983eab02.png"),
        MiotModel(96, "lumi.ctrl_neutral1.v1", "墙壁开关（ZigBee单键版）", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c27cbb48a6d0c2f9c619094b872769a1.png"),
        MiotModel(98, "lumi.sensor_ht.v1", "温湿度传感器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_96a468675eb6402b707ded7dbc169760.png"),
        MiotModel(99, "chuangmi.plug.v2", "小米智能插座基础版(已失效)", "http://cdn.fds.api.xiaomi.com/miio_user_head/e2auc8n6_1445843409.jpg"),
        MiotModel(100, "zhimi.airpurifier.m1", "小米空气净化器2代", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_1468d89ca759777116e1de1a793f69bc.png"),
        MiotModel(101, "idelan.aircondition.v1", "金兴智能空调", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_40aed5c76c827732da32dcbb8f1dac00.png"),
        MiotModel(102, "zimi.powerstrip.v1", "小米智能插线板1", "http://cdn.fds.api.xiaomi.com/miio_user_head/xb8h4jlz_1450429702.jpg"),
        MiotModel(104, "roidmi.btfm.v1", "睿米车载蓝牙播放器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_41d88c61af42dc97cbfe0d3996304e38.png"),
        MiotModel(105, "xiaomi.router.lv1", "小米路由青春版", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_dfed1d0968f8890262fd98580c5a75d0.png"),
        MiotModel(108, "ninebot.balscooter.v1", "NineBot平衡车", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_dc11f891b6fea41017ba3f180d071582.png"),
        MiotModel(109, "lumi.gateway.v3", "多功能网关", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5165eb28faa9197d3c31b8fdfd820a3e.png"),
        MiotModel(116, "haiii.pettag.v1", "钮扣狗牌", "http://cdn.fds.api.xiaomi.com/miio_user_head/egudz0g2_1446809380.jpg"),
        MiotModel(117, "xiaomi.phone_ir.t1", "手机红外遥控器", "http://cdn.fds.api.xiaomi.com/miio_user_head/4thsxf0u_1442568445.png"),
        MiotModel(119, "ninebot.robot.v1", "纳恩博（北京）科技有限公司机器人", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7ac247154adbf7948370fb02e19f3969.png"),
        MiotModel(121, "qmi.powerstrip.v1", "青米智能插排", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_38b558144a95987cb09efd398774ea7b.png"),
        MiotModel(125, "chuangmi.wifi.v1", "小米随身WIFI", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_1512f5c8e765c56f6589f1997558b669.png"),
        MiotModel(126, "zimi.powerstrip.v2", "米家智能插线板", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_2656ef1cd114c7bd4f8596217b563340.png"),
        MiotModel(127, "nhy.airrtc.v1", "丹麦格澜供暖", "http://static.home.mi.com/app/image/get/file/developer_1467809463ob77tl5s.png"),
        MiotModel(128, "nhy.wst.v1", "華祐微電腦寧波有限公司温室计", "http://static.home.mi.com/app/image/get/file/developer_1449212398sz9r4sah.png"),
        MiotModel(129, "midea.aircondition.xa1", "美的空调 - 酷金", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_4f909df26c6822b5f71cd083bbeaa5ee.png"),
        MiotModel(130, "chuangmi.plug.m1", "米家智能插座基础版", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f83a00cee71250f746e44a9ce5cdd62e.png"),
        MiotModel(131, "yunmi.kettle.v1", "米家恒温电水壶", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ccf4478df7254c7b01ae6577fffb472a.png"),
        MiotModel(133, "zhimi.humidifier.v1", "智米除菌加湿器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_63df315aa8d3ab09fe150563e5e3fe52.png"),
        MiotModel(134, "zhimi.airpurifier.vtl_v3", "小米空气净化器（虚拟）", "http://cdn.fds.api.xiaomi.com/miio_user_head/ivq2ncns_1447830114.jpg"),
        MiotModel(136, "lumi.plug.v1", "智能插座(ZigBee版)", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f83a00cee71250f746e44a9ce5cdd62e.png"),
        MiotModel(137, "xiaomi.wifispeaker.v1", "小米网络音响", "http://static.home.mi.com/app/image/get/file/developer_1482735389oewhfe5f.png"),
        MiotModel(140, "yunmi.waterpurifier.vtl_v2", "小米净水器（虚拟）", "http://cdn.fds.api.xiaomi.com/miio_user_head/hluek6hw_1447920636.jpg"),
        MiotModel(141, "aux.aircondition.vtl_v1", "奥克斯智能空调（虚拟）", "http://cdn.fds.api.xiaomi.com/miio_user_head/63anb73l_1447830665.jpg"),
        MiotModel(144, "neat.curtain.v1", "尼特窗帘", "http://cdn.fds.api.xiaomi.com/miio_user_head/f8u9hl0e_1448591378.png"),
        MiotModel(145, "chuangmi.plug.vtl_v1", "小米智能插座（虚拟）", "http://cdn.fds.api.xiaomi.com/miio_user_head/4510vm7e_1447936312.jpg"),
        MiotModel(146, "yeelink.light.vtl_ble1", "Yeelight 床头灯（虚拟）", "http://cdn.fds.api.xiaomi.com/miio_user_head/u4slhdea_1447830498.jpg"),
        MiotModel(148, "zhimi.airpurifier.vtl_m1", "小米空气净化器2代（虚拟）", "http://cdn.fds.api.xiaomi.com/miio_user_head/k9vvdvcw_1447920606.jpg"),
        MiotModel(149, "runmi.suitcase.v1", "90分智能金属旅行箱", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ab27def825dbbe27d63456a956a80963.png"),
        MiotModel(150, "yeelink.light.lamp1", "米家台灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_5f1f5c73f2ddd0da5abf434405ee2053.png"),
        MiotModel(151, "ihealth.bp.bpm1", "iHealth血压计", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_683df141b44e30b1d256a58a105b66c8.png"),
        MiotModel(152, "hhcc.plantmonitor.v1", "花花草草监测仪", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f0d046e296fb20991e9aa9b2b55be427.png"),
        MiotModel(154, "zhimi.airpurifier.virtual", "小米空气净化器组", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_dc292e50bd9d6413ae73f2111d419938.png"),
        MiotModel(156, "xiaomi.bledemo.v1", "小米蓝牙开发板", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7469b9dc0399ea38876edbb881d7c5c7.png"),
        MiotModel(158, "liuguodong.watch.testv1", "test", "http://static.home.mi.com/app/image/get/file/developer_1456385135vzy462ak.jpg"),
        MiotModel(161, "lumi.sensor_86sw1.v1", "无线开关（贴墙式单键版）", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_28eaab60a1dd5c9f0d5dd5b400a87149.png"),
        MiotModel(162, "lumi.sensor_86sw2.v1", "无线开关（贴墙式双键版）", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b4efeddf4b3004c60d5863a90f043f09.png"),
        MiotModel(163, "lumi.curtain.v1", "智能窗帘电机(ZigBee开合帘版)", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f4e07fd64e847d8e22ad1b7a16d93894.png"),
        MiotModel(165, "minij.washer.v1", "小吉洗衣机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_d68e47ad1043f284261d395fd3fda572.png"),
        MiotModel(169, "yunzao.yunbikec1.v1", "云马C1", "http://static.home.mi.com/app/image/get/file/developer_1451885541l9s885fl.png"),
        MiotModel(170, "xiaoxun.watch.v1", "米兔手表", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_616c798a45cb7fcbb32c421d92ec0a7d.png"),
        MiotModel(174, "yunmi.waterpurifier.v3", "小米净水器厨下式", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png"),
        MiotModel(184, "zimi.powerstrip.vtl_v2", "小米智能插线板（虚拟）", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_jpg_17cdc988e69309c22ffb22085b6e55de.jpg"),
        MiotModel(185, "idelan.aircondition.v2", "金兴智能空调", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_40aed5c76c827732da32dcbb8f1dac00.png"),
        MiotModel(186, "jiqid.mistory.v1", "米兔智能故事机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_03566fdc9b7c233970ba2874f2acebd1.png"),
        MiotModel(187, "yunmi.waterpuri.lx2", "小米净水器厨上版", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png"),
        MiotModel(188, "yunmi.waterpuri.lx3", "小米净水器厨下式", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c33c9af9724358984bb628dfd94a8164.png"),
        MiotModel(189, "scishare.coffee.s1101", "心想智能咖啡机", "http://static.home.mi.com/app/image/get/file/developer_14594085626ib0z6xd.png"),
        MiotModel(193, "zhimi.airmonitor.v1", "米家PM2.5检测仪", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_fe9a0219e8db1e23d6b0e30bd722ace7.png"),
        MiotModel(197, "xiaomi.router.v3", "小米路由器3", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_de02e9835a69f648119753f1de8c054f.png"),
        MiotModel(198, "innolinks.plug.ap3200", "空调智能插座", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_c35ff7dfee9fe1af4ce08e2f7a42c0f5.png"),
        MiotModel(199, "philips.light.sread1", "飞利浦智睿台灯二代", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7cdda2ef7b962532d372605cfdd8c6cf.png"),
        MiotModel(201, "scishare.coffee.s1102", "心想智能咖啡机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b4c935f6e22fadd8bf6e489ce201be42.png"),
        MiotModel(203, "yeelink.light.strip1", "Yeelight彩光灯带", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7802ab16888a1ac53a5059b0e9fdfc2a.png"),
        MiotModel(204, "xiaoyiyi.light.v1", "广义的设备", "http://static.home.mi.com/app/image/get/file/developer_1458562150w9kjhgjt.jpg"),
        MiotModel(205, "onemore.soundbox.sm001", "小米音乐闹钟", "http://static.home.mi.com/app/image/get/file/developer_1491788703lrok9kzv.png"),
        MiotModel(206, "soocare.toothbrush.x3", "素士声波电动牙刷", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_14d563afef3d16a05584f3862384967b.png"),
        MiotModel(207, "bmwcdl.car.v1", "BMW实验室微件", "http://static.home.mi.com/app/image/get/file/developer_1460019582wdanwmyn.png"),
        MiotModel(217, "lumi.sensor_smoke.v1", "烟雾报警器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_b1f3f609ae3874869522387f1958c379.png"),
        MiotModel(219, "miaomiaoce.thermo.t01", "秒秒测智能体温计", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_d64885b920962f6cf023a3a3f02f5999.png"),
        MiotModel(240, "xiaomi.tvbox.v208", "小米盒子增强版", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_76197396f2364d6ded68fdd9c0bf2a6b.png"),
        MiotModel(243, "idelan.aircondition.g2", "金兴智能空调", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_88f077a74ed871ce24dc1c5b7eeae887.png"),
        MiotModel(244, "idelan.aircondition.g1", "金兴智能空调", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_88f077a74ed871ce24dc1c5b7eeae887.png"),
        MiotModel(245, "lumi.acpartner.v1", "空调伴侣", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_8e88d8f5ce073a5daf9ed1cf2eebce70.png"),
        MiotModel(250, "lumi.sensor_natgas.v1", "天然气报警器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_0481ab23951187ffc2997cf9751bd907.png"),
        MiotModel(256, "yunmi.waterpuri.v1", "V1乐享版 人工智能系列", "http://static.home.mi.com/app/image/get/file/developer_14879883928ur29f5k.png"),
        MiotModel(257, "chunmi.cooker.normal2", "米家IH电饭煲", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_226c47684603e06a3de9a9b53beba4aa.png"),
        MiotModel(264, "nhy.rtc.rtc730", "華祐空調", "http://static.home.mi.com/app/image/get/file/developer_1464766090c9cx8wdo.png"),
        MiotModel(265, "nhy.rtc.pexrtc730", "丹麦格澜空调", "http://static.home.mi.com/app/image/get/file/developer_1467810008bfhxapsl.png"),
        MiotModel(269, "insistek.tracker.wa620", "米哇定位豆", "http://static.home.mi.com/app/image/get/file/developer_1469786116yynoeu6x.png"),
        MiotModel(274, "yeelink.light.bslamp1", "床头灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_81312b6c81b3934fc78999f57fe27b1c.png"),
        MiotModel(275, "yunmi.kettle.v2", "米家恒温电水壶", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ccf4478df7254c7b01ae6577fffb472a.png"),
        MiotModel(278, "xiaoxun.tracker.v1", "米兔定位电话", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_42ed8664735fdf13b6e0f967c2b681d7.png"),
        MiotModel(282, "isa.camera.isc5", "小方智能摄像机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_37d28d8dd968d4ca9e167a7e855af65f.png"),
        MiotModel(283, "mijia.camera.v1", "米家智能摄像机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_709fde2962ca951fd8b130491ae3e337.png"),
        MiotModel(284, "yunyi.camera.mj1", "米家小蚁智能摄像机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e0f011529083b6f503b3a293f3cde721.png"),
        MiotModel(286, "thinks.lunar.xm1", "智能睡眠传感器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_67f02973ea438421ed266e27616c6f59.png"),
        MiotModel(287, "chuangmi.radio.v2", "小米网络收音机增强版", "http://static.home.mi.com/app/image/get/file/developer_1472439133fj4zludm.jpg"),
        MiotModel(289, "roidmi.btfm.m1", "音乐蓝牙车充", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_46197436a9e8b5d0f081ab9279b12fbb.png"),
        MiotModel(290, "chunmi.cooker.normal3", "米家IH电饭煲 4L", "http://static.home.mi.com/app/image/get/file/developer_1484619599zmnv874r.png"),
        MiotModel(293, "xiaomi.router.lv3", "小米路由器R3C", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_de02e9835a69f648119753f1de8c054f.png"),
        MiotModel(294, "xiaomi.watch.band2", "小米手环", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_64d4d4b22eb2209eab4e10a15fab273d.png"),
        MiotModel(295, "xiaomi.watch.band1S", "小米手环", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e514e9562bb1d0877d1cc7a7120ec59c.png"),
        MiotModel(296, "xiaomi.watch.band1A", "小米手环", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e514e9562bb1d0877d1cc7a7120ec59c.png"),
        MiotModel(297, "rokid.robot.alien", "Rokid 机器人", "http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_9e0b56130237619bb7fe3ff2538026c2.png"),
        MiotModel(322, "zhimi.airpurifier.v6", "米家空气净化器Pro", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_886ed96be0766f5b2a899f0d43257361.png"),
        MiotModel(331, "ksmb.walkingpad.v1", "WalkingPad", "http://static.home.mi.com/app/image/get/file/developer_1493881617zv5w221f.png"),
        MiotModel(332, "roidmi.carairpuri.v1", "米家车载空气净化器", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_78b0420af3d304f406595bbc4db43b1b.png"),
        MiotModel(333, "xiaomi.router.r3p", "小米路由器Pro", "http://static.home.mi.com/app/image/get/file/developer_1489126463wwwsat1z.png"),
        MiotModel(335, "mijia.test.vtl_v1", "红米Note 4 千元旗舰，新机首发！", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_jpeg_c849c34b6069cad95fc611c1a0c5d45c.jpeg"),
        MiotModel(336, "isa.camera.virtual", "小方智能摄像机组", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_2196eaa3f9146352c69ec792cf5fbb0c.png"),
        MiotModel(340, "midr.cardvr.v1", "米家行车记录仪", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_cb3319cbf797d92e3b67d8d591a59c50.png"),
        MiotModel(342, "ninebot.scooter.v1", "电动滑板车", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3582c1d2cbe485aa229082328c0bfdbc.png"),
        MiotModel(343, "desay.bleshoes.s311", "智能跑鞋", "http://static.home.mi.com/app/image/get/file/developer_1486806634f3or28gg.png"),
        MiotModel(344, "yeelink.light.ceiling1", "Yeelight LED吸顶灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_76a320138443dc8279275910d82855ff.png"),
        MiotModel(349, "hhcc.bleflowerpot.v2", "花花草草蓝牙花盆", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_be7e943ccc77ff10eae2719fee3c73e1.png"),
        MiotModel(354, "lumi.weather.v1", "Aqara温湿度传感器", "http://static.home.mi.com/app/image/get/file/developer_1496316789rx6ya4pp.png"),
        MiotModel(355, "lumi.ctrl_86plug.v1", "墙壁插座(ZigBee版)", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_74344f1c0c388dd6b8f36ab7874e6364.png"),
        MiotModel(356, "lumi.ctrl_ln2.v1", "墙壁开关(零火双键)", "http://static.home.mi.com/app/image/get/file/developer_1480647278houyjf4c.png"),
        MiotModel(357, "lumi.ctrl_ln1.v1", "墙壁开关(零火单键)", "http://static.home.mi.com/app/image/get/file/developer_1480647296kkbubrup.png"),
        MiotModel(360, "midea.aircondition.xa2", "美的空调 - 酷金", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_054c9dff5fe0e37036a7dc1d5dbd3210.png"),
        MiotModel(362, "xiaomi.plc.v1", "小米WiFi电力猫", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_fb494857a655d7123f9754c33b671fc6.png"),
        MiotModel(365, "lumi.sensor_occupy.v1", "有人无人软传感器", "http://static.home.mi.com/app/image/get/file/developer_1492161850dwm1kfza.png"),
        MiotModel(366, "nuwa.robot.kiwi1", "女娲创造机器人", "http://static.home.mi.com/app/image/get/file/developer_147514159468rkkugs.jpg"),
        MiotModel(367, "xiaomi.repeater.v2", "小米WiFi放大器2代", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_8d28a10c23ca6f1733229d864ea81683.png"),
        MiotModel(376, "xiaoxun.watch.v2", "小寻手表 彩屏版", "http://static.home.mi.com/app/image/get/file/developer_1484300110iz54yay4.png"),
        MiotModel(378, "mijia.camera.v2", "米家摄像头v2", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_709fde2962ca951fd8b130491ae3e337.png"),
        MiotModel(379, "xiaomi.wifispeaker.v2", "小米网络音响", "http://static.home.mi.com/app/image/get/file/developer_1482728753v3o5anu4.png"),
        MiotModel(380, "chuangmi.camera.v2", "米家智能摄像机云台版", "http://static.home.mi.com/app/image/get/file/developer_1500263625lbjksgmc.png"),
        MiotModel(385, "lumi.sensor_wleak.aq1", "水浸传感器", "http://static.home.mi.com/app/image/get/file/developer_1502076183dvhangsz.png"),
        MiotModel(386, "lumi.vibration.aq1", "动静贴", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_jpg_e9387c6b3a304a18e933cefb7b5ade22.jpg"),
        MiotModel(390, "chunmi.cooker.press2", "米家压力IH电饭煲", "http://static.home.mi.com/app/image/get/file/developer_1484619548gct5el7r.png"),
        MiotModel(391, "chunmi.cooker.normal4", "米家IH电饭煲 4L", "http://static.home.mi.com/app/image/get/file/developer_1489402595sy8gqn8c.png"),
        MiotModel(393, "philips.light.ceiling", "飞利浦智睿吸顶灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_3568754428ab7e71aaa816869bf95987.png"),
        MiotModel(394, "lumi.acpartner.v2", "米家空调伴侣", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_bec4e05e6e7e4bb59288c6f307076d47.png"),
        MiotModel(395, "yunmi.kettle.v3", "米家恒温电水壶", "http://static.home.mi.com/app/image/get/file/developer_1480556341bi3sgy2e.png"),
        MiotModel(397, "yunmai.scales.m1690", "好轻mini2智能体脂秤", "http://static.home.mi.com/app/image/get/file/developer_1489375908ltfdcyzg.png"),
        MiotModel(402, "bys.toothbrush.v1", "贝医生牙刷", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_7929ad23965c8682261a8af7d2bf6a28.png"),
        MiotModel(403, "trios.bleshoes.v1", "米家智能鞋", "http://static.home.mi.com/app/image/get/file/developer_148843175457o7qbds.png"),
        MiotModel(410, "juanxm.camera.p720v1", "大瞳全景摄像机", "http://static.home.mi.com/app/image/get/file/developer_1494065237cf2fr7d8.png"),
        MiotModel(411, "lumi.lock.v1", "智能门锁", "http://static.home.mi.com/app/image/get/file/developer_15007928738ns3f7z0.png"),
        MiotModel(412, "zlife.towel.b1", "最生活浴巾", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_e2e4949ca930baf34f0e2da4697f4402.png"),
        MiotModel(413, "zlife.towel.v1", "最生活毛巾", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_50686dc59fadcc42f6a1a112df099a3d.png"),
        MiotModel(416, "onemore.soundbox.sm002", "小米蓝牙闹钟音箱", "http://static.home.mi.com/app/image/get/file/developer_1492410088q9mrh72g.png"),
        MiotModel(417, "soocare.toothbrush.m1", "米家声波电动牙刷", "http://static.home.mi.com/app/image/get/file/developer_1490255883fhhbkn0u.png"),
        MiotModel(420, "xiaoxun.watch.v3", "米兔手表_V3", "http://static.home.mi.com/app/image/get/file/developer_1493023452azzuwnpe.png"),
        MiotModel(421, "xiaoxun.watch.v4", "米兔手表_V4", "http://static.home.mi.com/app/image/get/file/developer_1482824502h8v0uu21.png"),
        MiotModel(422, "zhimi.aircondition.v2", "智米全直流变频空调", "http://static.home.mi.com/app/image/get/file/developer_14998479025axz7xw5.png"),
        MiotModel(428, "inshow.watch.w1", "米家石英表", "http://static.home.mi.com/app/image/get/file/developer_1502432806rqpersn6.png"),
        MiotModel(429, "fimi.camera.c1", "米家小相机", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_f75c7d11bc705ca1a17dacc905860424.png"),
        MiotModel(431, "philips.light.bulb", "飞利浦智睿球泡灯", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_475f7d736df3cdf5d850c051128bf1ad.png"),
        MiotModel(439, "leravan.magic_touch.H10", "蓝牙版加热魔力贴（低周波按摩器）", "http://static.home.mi.com/app/image/get/file/developer_1499931882501v2ka8.jpg"),
        MiotModel(444, "lumi.camera.aq1", "Aqara智能摄像机（网关版）", "http://static.home.mi.com/app/image/get/file/developer_1499848090ykfv0oex.png"),
        MiotModel(450, "lumi.sensor_magnet.aq2", "Aqara门窗传感器", "http://static.home.mi.com/app/image/get/file/developer_1496316671qhq4awpy.png"),
        MiotModel(451, "lumi.sensor_motion.aq2", "Aqara人体传感器", "http://static.home.mi.com/app/image/get/file/developer_1497860237yj46gwyg.png"),
        MiotModel(452, "lumi.sensor_switch.aq2", "Aqara无线开关", "http://static.home.mi.com/app/image/get/file/developer_1499744621bz4mq2wy.png"),
        MiotModel(454, "xiaomi.router.r3d", "小米路由器HD", "http://static.home.mi.com/app/image/get/file/developer_1489127998reibba40.png"),
        MiotModel(455, "zhimi.airpurifier.m2", "小米空气净化器2代", "http://static.home.mi.com/app/image/get/file/developer_1490253124b61k6mjm.png"),
        MiotModel(459, "xiaomi.router.r3g", "小米路由器3G", "http://static.home.mi.com/app/image/get/file/developer_1492483320gkml4jg7.png"),
        MiotModel(460, "xiaomi.router.r3a", "小米路由器3A", "http://static.home.mi.com/app/image/get/file/developer_14924833904f2h0eip.png"),
        MiotModel(461, "rotai.massage.rt5850", "按摩椅RT5850", "http://static.home.mi.com/app/image/get/file/developer_1502766262xl1tampm.png"),
        MiotModel(462, "philips.light.virtual", "飞利浦智睿系列灯组", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_ad4d50fefe922422921ef4fe7778fe4a.png"),
        MiotModel(464, "xiaomi.wifispeaker.s12", "小米AI音箱", "http://cdn.fds.api.xiaomi.com/miio.files/commonfile_png_05bcd35fdcc04e7fbcda9c3bc430957b.png"),
        MiotModel(465, "zhimi.fan.v3", "智米直流变频落地扇", "http://static.home.mi.com/app/image/get/file/developer_14902525278x9u8ox6.png"),
        MiotModel(466, "xiaomi.repeater.v3", "小米WiFi放大器Pro", "http://static.home.mi.com/app/image/get/file/developer_1491877770zn0j4rv9.png"),
        MiotModel(472, "hmpace.watch.v1", "Amazfit手表", "http://static.home.mi.com/app/image/get/file/developer_14949236089rhga9ry.png"),
        MiotModel(476, "bugoo.tpms.g1", "布古智能胎压监测器", "http://static.home.mi.com/app/image/get/file/developer_1498810367ms4vb15o.png"),
        MiotModel(477, "joyril.light.v001", "joyrill智能顶灯", "http://static.home.mi.com/app/image/get/file/developer_1491892486b3hukwdx.jpg"),
        MiotModel(478, "cgllc.airmonitor.b1", "米家空气检测仪", "http://static.home.mi.com/app/image/get/file/developer_1496916674c33mpakq.png"),
        MiotModel(479, "chuangmi.camera.v3", "米家智能摄像机云台增强版", "http://static.home.mi.com/app/image/get/file/developer_1501753401vpaqhib9.png"),
        MiotModel(481, "chuangmi.plug.m2", "米家智能插座基础版", "http://static.home.mi.com/app/image/get/file/developer_14919090390yd2z4aq.png"),
        MiotModel(483, "kola.milk.v1", "考拉妈妈智能冲奶机", "http://static.home.mi.com/app/image/get/file/developer_1500544650y77lxasn.png"),
        MiotModel(486, "yunmi.waterpuri.lx4", "小米净水器厨上增强版", "http://static.home.mi.com/app/image/get/file/developer_14927702920fm5vps7.jpg"),
        MiotModel(490, "isa.camera.df3", "大方智能摄像机(1080P云台版)", "http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_a05222307f69e63c5f7c002fcedcd755.png"),
        MiotModel(507, "lumi.lock.aq1", "Aqara智能门锁", "http://static.home.mi.com/app/image/get/file/developer_1497860519uef6ut4f.png"),
        MiotModel(508, "yeelink.light.ceiling2", "Yeelight LED吸顶灯(青春版)", "http://static.home.mi.com/app/image/get/file/developer_1496373605i830ob3b.png"),
        MiotModel(512, "chuangmi.plug.v3", "米家智能插座增强版", "http://static.home.mi.com/app/image/get/file/developer_14938878937pwj04rp.png"),
        MiotModel(513, "yeelink.light.ceiling3", "Yeelight LED吸顶灯(皎月系列)", "http://static.home.mi.com/app/image/get/file/developer_1500887836qfgbqwws.png"),
        MiotModel(514, "yeelink.light.ceiling4", "Yeelight LED吸顶灯(皎月系列)", "http://static.home.mi.com/app/image/get/file/developer_1500887879z263swm0.png"),
        MiotModel(530, "chuangmi.camera.v5", "小白智能摄像机大众版", "http://cdn.cnbj0.fds.api.mi-img.com/miio.files/commonfile_png_6f2ec4b90ac71ae3ee0ef090224c5f74.png"),
        MiotModel(544, "rokid.robot.pebble", "Rokid 月石", "http://static.home.mi.com/app/image/get/file/developer_149846966517c0wnrm.png"),
        MiotModel(547, "jhkj.manager.v1", "keyblack开吧智能锁", "http://static.home.mi.com/app/image/get/file/developer_1498793937voei9df3.jpg"),
        MiotModel(549, "xiaoai.insole.v1", "芯迈芯迈鞋垫", "http://static.home.mi.com/app/image/get/file/developer_14976070915068oc7n.png"),
        MiotModel(551, "lumi.sensor_cube.aq2", "Aqara无线开关升级版", "http://static.home.mi.com/app/image/get/file/developer_1499411972qfa328ho.png"),
        MiotModel(556, "yunmi.kettle.r1", "云米智能即热饮水吧（MINI）", "http://static.home.mi.com/app/image/get/file/developer_1500518319znggxg14.png"),
        MiotModel(572, "xiaoxun.watch.v5", "小寻儿童电话手表S1", "http://static.home.mi.com/app/image/get/file/developer_15026903543fhg1byb.png"),
        MiotModel(586, "lumi.sensor_switch.aq3", "Aqara无线开关升级版", "http://static.home.mi.com/app/image/get/file/developer_1501573746ptlqibw5.png"))
}
