/*
package scala.test

import scala.reflect.ClassTag

object Main15 extends  App {
    val pi = 3.14
    List(3.14, 3.1415).foreach {
        _ match {
            case `pi` => println(s"`pi`: $pi") // 3.14的时候输出
            case pi => println(s"pi: $pi") //3.1415的时候输出
        }
    }

    case class Expr(op: Char, x: Int, y: Int)

    Expr('+', 1, 1) match {
        case Expr('+', x, y) if (x == y) => println(x + y)
        case _ => println("error")
    }
    val fruits = List(Some("apple"), None, Some("orange"))
    for (Some(fruit) <- fruits) {
        println(fruit)
    }
    val a :: b :: rest = fruits
    println(s"a: $a, b: $b rest: $rest")
    val List(aa, bb, cc) = fruits
    println(s"a: $aa, b: $bb")

    var l: List[Int] = Nil
    List(1, 2, 3, 4, 5).foreach { a =>
        l = a :: l
        println(l)
    }

    val classA = Class.forName("scala.test.A")
    val method = classA.getDeclaredMethod("fun1", classOf[Int])
    method.invoke(null, new Integer(5)) // 如果是Int的话,要用new Integer(5)

    val classB = Class.forName("java.lang.Math")
    val methodB = classB.getDeclaredMethod("abs", classOf[Int])
    println(methodB.invoke(null, new Integer(-5)))
    // 如果是Int的话,要用new Integer(5)
    var abc = "bbb"
    val ss = "$abc$"
    println(ss)


    println("<p>水滴平台协议</p><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><p>\t北京小米移动软件有限公司（以下简称小米）在此特别提醒您（以下简称开发者）认真阅读、充分理解本协议各条款，<strong>特别是涉及费用条款，免除或者限制开发者的责任的条款，对开发者的权利限制条款，争议解决和法律适用条款等，此类条款将以加粗的形式提示开发者注意</strong>。请开发者审慎阅读并选择接受或不接受本协议（限制民事行为能力人应在监护人或法定代理人陪同下阅读）。<strong>开发者的登录或使用服务行为将视为对本协议（即本协议及后续更新版本或开通或使用某项服务的单独协议）的接受，并同意接受本协议各项条款的约束。</strong></p><p><br></p><p><strong>1.&nbsp;定义</strong></p><p>1.1.&nbsp;开发者产品：是指开发者提供的技术或服务具体以补充协议约定为准，包括现有版本以及将来升级版本。 </p><p>1.2.&nbsp;水滴平台：是指小米大脑，即小米及关联公司自主研发并有经营权的语音人工智能平台。</p><p><br></p><p><strong>2.&nbsp;合作内容</strong></p><p>2.1.&nbsp;小米提供标准接口，开发者按照小米标准接口推送开发者产品。开发者授权小米在水滴平台中引入使用开发者产品，供用户通过水滴平台使用开发者产品。</p><p>2.2.&nbsp;小米负责开发对接开发者产品的功能,并对水滴平台的运营具有独立决定权，小米对第三方移动互联网业务对接和集成及展现结果具有独立决定权。</p><p>2.3.&nbsp;开发者授权小米使用开发者产品相关的商标，用以表明服务的提供方。</p><p><br></p><p><strong>3.&nbsp;开发者权利义务</strong></p><p>3.1.&nbsp;开发者应当于本协议签署后的3个工作日内与小米沟通确定接入的时间进度等，开发者应当在双方约定的时间内按照小米的接入标准配置接口。具体接入标准请见（<a href=\"https://open.ai.xiaomi.com/docs/custom-skills-interface\" target=\"_blank\">https://open.ai.xiaomi.com/docs/custom-skills-interface</a>）。开发者应配合小米进行技术、用户体验等的联调和测试，以确保对接成功。&nbsp;</p><p>3.2.&nbsp;小米有权对开发者产品以及接入接口等进行测试，若符合小米要求的，小米有权在水滴平台展示开发者产品且按照小米制定的唤醒方式调取开发者产品。若开发者产品或接入接口等不能通过小米测试的，开发者应当按照小米要求修改，直至符合小米测试要求。</p><p>3.3.&nbsp;开发者负责开发者产品的研发、运营和管理，并有权修订相应的管理规则与功能，但应当符合小米的技术要求。开发者保证提供给小米的开发者技术产品稳定、可靠、用户体验良好。若因为开发者技术产品存在技术问题，影响用户体验时，小米有权暂时断开接入开发者技术产品。</p><p>3.4.&nbsp;开发者若维护升级开发者技术产品时，应当提前5个工作日通知小米。若开发者未及时通知小米，导致小米受到损失，则小米有权采取断开开发者技术产品、要求开发者赔偿损失等措施。</p><p>3.5.&nbsp;若开发者更新开发者产品的，应当及时向小米提供更新版本，保证小米用户可以享受到开发者产品最新版本的服务。</p><p>3.6.&nbsp;开发者产品在交付前小米需进行安全检测，检测项目包括但不限于：病毒扫描、端口扫描、漏洞扫描和Web安全检测，并对存在的安全问题进行修复。开发者保证其提供给小米对接的页面或接口中均不含有破坏、损害、消除、停用或以电子方式收回程序、其他软件、数据或者使之失效的任何病毒、计算机软件代码、例行程序或设计。若开发者产品存在此类问题，小米有权要求开发者进行补救修正，开发者应给予积极配合，立即以不含病毒或失效代码的技术产品替换所有存在上述问题的产品。否则，小米有权暂时断开开发者技术产品的接入直至开发者产品修复上述问题。因技术产品问题给小米造成损失的，小米有权要求开发者赔偿损失。</p><p>3.7.&nbsp;<strong>开发者保证开发者产品不违反任何法律法规、主管行政机关的有关规定等，也不侵犯任何第三方的合法权益，包括但不限于知识产权等，若因开发者产品导致任何纠纷或致使小米受到有关处罚或承担责任的，小米有权立即解除协议，并要求开发者负责解决争议事项，同时，对小米由此而遭受到的损失承担赔偿责任。</strong></p><p>3.8.&nbsp;开发者保证其是开发者产品以及相关服务的合法所有者和经营者。若由于开发者技术产品经营资质所引起的任何问题由开发者自行处理，若因此导致小米受到损失，开发者应予赔偿。</p><p>3.9.&nbsp;<strong>小米对开发者产品及其提供的服务不承担任何担保或连带法律责任，开发者基于用户请求所提供的服务与小米没有任何关系；如小米因此而被第三方追究责任的，开发者应当负责处理并承担由此产生的法律责任；给小米造成损失的，小米有权向开发者追偿。</strong></p><p>3.10.&nbsp;开发者应当保证开发者技术产品以及接入应当具有稳定性，开发者应当提供免费的维护以及必要的技术支持。若因开发者设计、编程造成的技术故障，开发者应当在小米通知后6小时内响应，并在小米要求的时间内完成修复或完善。若开发者不能及时修复或者严重影响用户体验的，则小米有权断开接入开发者技术产品。</p><p>3.11.&nbsp;开发者授权小米在本协议合作范围内使用开发者的商标或其他标识，用以标注技术来源。</p><p>3.12.&nbsp;开发者不得收集或存储小米最终用户的个人信息，包括但不限于IMEI、MAC、电话号码等信息，开发者不得对小米用户进行任何推广或营销活动，不会窃取用户隐私数据（包括但不限于IMEI、IMSI、手机号等），不存在其它可能损害开发者及用户利益的软件后门。如小米发现开发者在未经小米书面许可情况下收集、使用用户隐私数据，小米有权单方面终止本合同并要求赔偿开发者给小米造成的全部损失。</p><p>3.13.&nbsp;开发者授权小米在小米订阅号中对开发者产品及其内容向该订阅用户提供公开播报以及向所有用户提供搜索等服务。</p><p><br></p><p><strong>4.&nbsp;</strong>小米权利义务</p><p>4.1.&nbsp;小米根据业务需求自主决定是否采用开发者产品，小米有权对开发者产品的功能、内容运营和策略等提出需求建议，并有权与开发者协商修订相应的管理规则与功能。</p><p>4.2.&nbsp;未经开发者同意，小米不得对开发者产品进行包括（但不限于）反向工程、反编译、反汇编等可能影响或改变开发者产品功能的行为，不得破解或试图破解开发者产品的安全和保密措施。</p><p>4.3.&nbsp;小米保证是水滴平台的合法所有者和经营者。若由于水滴平台所引起的任何问题由小米自行处理，若因此导致开发者受到损失，开发者应予赔偿。</p><p>4.4.&nbsp;小米负责对接接口的技术与运维支持，保证本协议项下的开发者产品能与水滴平台对接。</p><p>4.5.&nbsp;小米应当在界面适当位置展示开发者品牌以展示服务提供者，展现位置和展现形式由小米决定，但应当遵守开发者的品牌管理规则。</p><p>4.6.&nbsp;小米有权自由选择业务使用场景、使用规范、接入合作方以及是否使用开发者提供的开发者产品。</p><p><br></p><p><strong>5.&nbsp;费用和结算</strong></p><p>\t<strong>开发者按照水滴平台的提交流程，另行点击确认补充协议，约定具体的费用以及相关结算条款。</strong></p><p>\t</p><p><strong>6.&nbsp;知识产权</strong></p><p>6.1.&nbsp;双方保证本方所提供的产品或服务包括但不限于影视内容、软件、设备或技术不侵犯第三方知识产权等在先合法权益以及国家相关法律法规。若发生一方因使用对方提供的产品或服务而侵犯第三方知识产权合法权益以及国家相关法律法规的情形，提供方负责处理并承担相应的法律责任。</p><p>6.2.&nbsp;双方约定，如果一方收到第三方宣告其拥有涉嫌侵犯知识产权或其他合法权益的信函，应当及时通知另一方，涉嫌侵权内容的提供方应当尽快提供涉嫌侵权内容不侵犯知识产权或其他合法权益的书面反通知，使用方有权根据通知移除相关内容并根据提供方提供的涉嫌侵权内容不侵犯知识产权的书面反通知即时恢复被移除的内容。使用方在移除相关内容前必须通知提供方，如果提供方出具不侵权的担保，使用方可以暂不移除相关内容直至提供方提供涉嫌侵权内容不侵犯知识产权的书面反通知，如果经查确实侵犯第三方的知识产权，在此期间内的责任包括侵权责任和行政法律责任由提供方承担。</p><p>6.3.&nbsp;双方各自提供的信息内容、设计方案、技术方案，包括但不限于软件源代码、软件通信协议、技术资料、技术方案、品牌、商标、著作权等，只能在本协议约定范围内使用，不得擅自将对方享有知识产权的资料或技术用于本协议以外的其他任何目的。本协议到期或解除后，任何一方无权使用对方享有知识产权的信息或技术，本协议另有约定或双方另有约定的除外。</p><p>6.4.&nbsp;任何一方专有的方法以及其它信息（即原有技术），在开发过程中为另一方获知或者得到，知识产权仍归原有一方所有。</p><p>6.5.&nbsp;未经小米事先书面同意，不管小米当时是否直接或间接持有任一集团公司的任何股权，开发者不得为了其任何营销、广告、促销或其他目的使用、公布或复制投资者或其任何关联方的名称（包括但不限于包含“雷军”、小米”、“米联”、 “米吧”、“小米商城”、“小米网”、“红米”、“米兔”、“Xiaomi”、 “MIUI”、“米家”，上述品牌的附属标志及图案（包括但不限于<img src=\"//:0\">、<img src=\"//:0\">、<img src=\"//:0\">、<img src=\"//:0\">等）或任何类似公司名称、商号、商标、产品或服务名称、域名、图案标示、标志、标识或通过特定描述使第三方能够识别小米或其任何关联方。</p><p><br></p><p><strong>7.&nbsp;保密条款</strong></p><p>7.1.&nbsp;本协议所称保密信息，是指一方（以下简称“接受方”）从对方（以下简称“披露方”）取得的、获知的、或因双方履行本协议而共同创造且具有不可分割性的商业秘密（包括财务秘密）、技术秘密、经营诀窍和（或）其他应予保密的信息和资料，无论上述信息和资料以何种形式或载于何种载体，无论披露方在披露时是否以口头、图像或书面等方式表明其具有保密性。</p><p>7.2.&nbsp;本协议有效期内及其终止后五年内，任何一方均不应向任何第三方披露、泄漏或提供保密信息，保密信息包括但不限于产品单价、小米经营数据、用户信息等。</p><p>7.3.&nbsp;双方应采取适当措施妥善保存对方提供的保密信息，措施的审慎程度不少于其保护自身的保密信息时的审慎程度。双方仅能将保密信息用于与本协议项下的有关用途或目的。</p><p>7.4.&nbsp;双方保证保密信息仅可在各自一方从事该业务的负责人和雇员范围内知悉。在双方上述人员知悉该保密信息前，应向其提示保密信息的保密性和应承担的义务，并以可证明的方式表明上述人员确实承担本协议项下的保密责任。</p><p>7.5.&nbsp;如确有必要，接受方应按照保密信息披露方的指示将含有保密资料的所有文件或其他资料归还给披露方，或按其指示予以销毁。</p><p>7.6.&nbsp;本条上述限制条款不适用于以下情况，但接受方应当提供证据证明：</p><p>7.6.1.&nbsp;在签署本协议之时或之前，该保密信息已以合法方式属接受方所有；</p><p>7.6.2.&nbsp;保密信息在通知给接受方时，已经公开或能从公开领域获得；</p><p>7.6.3.&nbsp;保密信息是接受方从与其没有保密或不透露义务的第三方获得的；</p><p>7.6.4.&nbsp;在不违反本协议项约定责任的前提下，该保密信息已经公开或能从公开领域获得；</p><p>7.6.5.&nbsp;该保密信息是接受方或其关联或附属公司独立开发，而且未从通知方或其关联或附属公司获得的信息中获益；</p><p>7.6.6.&nbsp;接受方应法院或其它法律、行政管理部门要求披露的信息（通过口头提问、询问、要求资料或文件、传唤、民事或刑事调查或其他程序）因而透露保密信息，在该种情况发生时，接受方应立即向披露方发出通知，并作出必要说明。</p><p>7.7.&nbsp;双方亦对本协议的具体内容负有保密责任。</p><p><br></p><p><strong>8.&nbsp;声明及保证</strong></p><p>8.1.&nbsp;双方互相向对方声明、陈述和保证如下：</p><p>8.1.1.&nbsp;其是合法设立并有效存续的独立法人；</p><p>8.1.2.&nbsp;其有资格从事本协议项下之合作，而该合作符合其经营范围之规定；</p><p>8.1.3.&nbsp;其授权代表已获得充分授权可代表其签署本协议；</p><p>8.1.4.&nbsp;其有能力履行其于本协议项下义务，并且该等履行义务的行为不违反任何对其有约束力的法律文件的限制。</p><p>8.2.&nbsp;除本协议明示之保证外，小米未对其他事项有任何明示或暗示的保证。</p><p><br></p><p><strong>9.&nbsp;不可抗力</strong></p><p>9.1.&nbsp;“不可抗力”是指本协议双方不能控制且不可预见，或者虽可预见但不可避免地妨害任何一方全部或部分履行本协议的一切事件。此种事件只包括地震、塌方、陷落、洪水、台风、天文异常等自然灾害以及火灾、爆炸、事故、战争、恐怖事件、大规模流行性疫病、破坏活动、黑客入侵、网络崩溃或任何其他类似的或不同的偶发事件。</p><p>9.2.&nbsp;如发生不可抗力，以至于任何一方因这种事件的发生而无法履行其义务，一方对另一方的损失不承担责任。</p><p>9.3.&nbsp;遇有上述不可抗力事件的一方，应立即将事件情况书面通知对方，并应于十五日内提出事件详情及协议不能履行或不能完全履行、或需要延期履行的理由的政府部门开具的有效证明文件或权威媒体报道。按照事件对协议的履行的影响程度，由双方协商决定是否继续履行本协议或终止协议。遇有不可抗力事件的一方，有责任尽一切合理的努力消除或者减轻此等不可抗力事件的影响。</p><p>9.4.&nbsp;不可抗力事件发生时，双方应立即通过友好协商决定如何执行本协议。不可抗力事件或其影响终止或消除后，双方应立即恢复履行各自在本协议项下的各项义务。如不可抗力及其影响持续超过20日或无法终止或消除而致使协议任何一方丧失继续履行协议的能力，则双方可协商解除协议或暂时延迟协议的履行，且遭遇不可抗力一方无须为此承担责任。但因迟延履行后发生不可抗力的，不能免除责任。</p><p><br></p><p><strong>10.&nbsp;违约责任</strong></p><p>10.1.&nbsp;除非本协议另有约定，任何一方直接或间接违反本协议的任何条款，或不承担或不及时、充分地承担本协议项下其应承担的义务即构成违约行为，守约方有权以书面通知要求违约方纠正其违约行为并采取充分、有效、及时的措施消除违约后果，并赔偿守约方因违约方之违约行为而遭致的损失。若违约方在收到守约方关于其违约行为的上述通知后10日内未纠正其违约行为，守约方有权以书面通知的方式单方提前终止本协议，并追究违约方之违约责任。</p><p>10.2.&nbsp;在违约事实发生以后，经守约方的合理及客观的判断，该等违约事实已造成守约方履行本协议项下其相应的义务已不可能或不公平，则守约方有权以书面形式通知违约方提前终止本协议，违约方应赔偿守约方因违约方之违约行为而遭致的损失。</p><p><br></p><p><strong>11.&nbsp;协议有效期、变更与终止</strong></p><p>11.1.&nbsp;双方中任何一方欲变更、或修改本协议必须提前十五天书面通知另一方。双方应协商一致并以书面形式变更或修改本协议。</p><p>11.2.&nbsp;如果一方发生以下情况时，本协议可自另一方收到书面通知时立即终止：</p><p>11.2.1.&nbsp;双方协商一致终止或解除本协议；</p><p>11.2.2.&nbsp;任一方受到政府行政主管部门吊销营业执照或停业处分，或其它丧失合法经营身份或资格的情况发生时；</p><p>11.2.3.&nbsp;任一方申请破产、进入清算程序；</p><p>11.2.4.&nbsp;任一方由于不可抗力事件持续无法履行本协议时间超过20日的。</p><p>11.2.5.&nbsp;任一方经营状况严重恶化，或转移资产抽逃资金，或丧失商业信誉，或有丧失或可能丧失履行债务的其他情形的；</p><p>11.2.6.&nbsp;任何一方书面声明其不能清偿到期债务；</p><p>11.2.7.&nbsp;实质性违反本合同项下的义务；</p><p>11.2.8.&nbsp;适用第9.1条的情形</p><p>11.2.9.&nbsp;守约方依据本协议其他条款单方终止本协议的情形。 </p><p>11.3.&nbsp;本协议的终止不影响双方于本合同终止前根据本合同已产生的权利和义务，且保密义务不随本合同的终止而终止。</p><p><br></p><p><strong>12.&nbsp;本协议的确认、接受、修订</strong></p><p>12.1&nbsp;<strong>只要开发者通过在线方式点击接受技术服务协议或者签订本协议纸质文本，即表示开发者同意受本协议及小米相关规则约束。本协议生效后，本协议自动替代开发者此前点击确认的合作协议，此前协议自动终止。</strong></p><p>12.2&nbsp;<strong>鉴于互联网相关技术、市场、业务模式等等的发展迅速，开发者同意，小米有权随时根据中华人民共和国有关法律、法规的变化、互联网的发展以及公司经营状况和经营策略的调整等不定时地制定、修改本协议及各类规则。如有修订，小米将通过自助系统、站内消息、帮助中心公告等渠道通知。经修订的协议、规则一经公布，则立即自动生效，且成为本服务协议不可分割的一部分。如开发者不同意上述修订，则开发者必须立即停止使用本协议下各项服务。开发者登录或继续使用服务，则表示开发者认可并接受经修订的协议、规则。</strong></p><p><br></p><p><strong>13.&nbsp;通知</strong></p><p>13.1.&nbsp;双方因履行本协议而相互发出或提供的所有通知、文件、资料等，均应按照本协议所列明的通讯地址、传真以邮寄、传真、电子邮件方式送达；一方如果迁址或者变更电话，应当书面通知对方。</p><p>13.2.&nbsp;通过邮寄方式的，挂号寄出或者投邮当日视为送达；以传真或电子邮件方式的，发出时视为送达。</p><p>13.3.&nbsp;一方变更通知或通讯地址，应自变更之日起3日内，以书面形式通知对方；否则，由未通知方承担由此而引起的相关责任。</p><p>13.4.&nbsp;双方接口联系人：</p><p>开发者指定联系人：</p><p>姓名： </p><p>移动电话： </p><p>固定电话：</p><p>邮件：</p><p>通讯地址：</p><p>邮政编码：</p><p>小米指定联系人：</p><p>姓名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><p>移动电话：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><p>固定电话：</p><p>邮件：&nbsp;&nbsp;</p><p>通讯地址：&nbsp;</p><p>邮政编码：</p><p><br></p><p><br></p><p><strong>14.&nbsp;争议解决与适用法律</strong></p><p>14.1.&nbsp;如双方就本协议内容或其执行发生任何争议，双方应进行友好协商；协商不成时，<strong>任何一方可将争议提交协议签订地有管辖权人民法院诉讼解决。</strong></p><p>14.2.&nbsp;本协议的订立、执行和解释及争议的解决均适用中华人民共和国相关法律约束。</p><p><br></p><p><strong>15.&nbsp;其他</strong></p><p>15.1.&nbsp;本协议对每一方的承继人和受让人均有约束力。</p><p>15.2.&nbsp;本协议的任何一方未能及时行使本协议项下的权利不应被视为放弃该权利，也不影响该方在将来行使该权利。</p><p>15.3.&nbsp;如果本协议中的任何条款无论因何种原因完全或部分无效或不具有执行力，或违反任何适用的法律，则该条款被视为删除。但本协议的其余条款仍然有效并且有约束力。</p><p>15.4.&nbsp;本协议未尽事宜由双方另行协商解决。</p><p>15.5本协议签订地：北京市海淀区</p><p>15.6 本协议发布日期：</p><p><br></p><p><br></p>".getBytes.length)
    def findEnumByValue[T: ClassTag](value: Int)(implicit ): Option[T] = {
        try {
            val clazz =  classOf[T]
            val enumMethod = clazz.getMethods.filter(_.getName.equals("findByValue"))(0)
            Some(enumMethod.invoke(null, value).asInstanceOf[T])
        } catch {
            case e: Exception => None
        }
    }

}
object A{
    def fun1(a:Int) = println(a)
    def fun2() = print("fun2")
    val t = 1
}*/
