package com.org.demo.launcher;

import com.alibaba.fastjson.JSON;
import com.org.demo.launcher.net.BaseEntity;

/**
 * create by guozhk on 2019/3/19 16:14
 **/
public class TestClass {

    public static void main(String[] agrs){
        System.out.println("-=-=");

        String json ="{\"status\":\"0000\",\"result\":\"您已经成功登录\",\"dangSessionID\":\"7974db46-c526-467a-a80c-5f0f24f32676\",\"data\":{\"developerMessage\":null,\"code\":\"D101\",\"data\":{\"pwdExpireTime\":1707660169000,\"loginModel\":{\"pwdAttemptTimes\":0,\"pwdExpTime\":null,\"KSSOST\":null,\"businessCode\":\"UA_0\",\"processCode\":\"201\",\"TGCValue\":\"TGC-990001625-UOP-100-DkBRg7pfxLof1sGJbCyaDEffM3r4fzdwfEw2NdZ2vY1e5bzd47\",\"resourceMap\":{\"iTable_OSM\":{\"resourceID\":\"e6t0qdp09z2xbnjmjesxkrz6vhtmobu3\",\"resourceCode\":\"iTable_OSM\",\"resourceURL\":\"http://10.233.93.110:211/OSM/index/doLoginForSSO.action\",\"accountDsc\":\"\",\"resourceName\":\"itable行政印章\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"aaa\":{\"resourceID\":\"7cf917578b9eu44xig4uc0k7z9eaydpv\",\"resourceCode\":\"aaa\",\"resourceURL\":\"http://10.232.48.83:88/usap/login/LoginAction_goMainFrame.action\",\"accountDsc\":\"\",\"resourceName\":\"aaa\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"PMIS\":{\"resourceID\":\"ay6b485f8r4nw3ru1e9057thbe23f45n\",\"resourceCode\":\"PMIS\",\"resourceURL\":\"http://10.230.217.115:9080/pmis/loginByITable.action\",\"accountDsc\":\"\",\"resourceName\":\"采购管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"UCS\":{\"resourceID\":\"w5aorzl55mbof8vxb38l6bap2ww0vwv1\",\"resourceCode\":\"UCS\",\"resourceURL\":\"http://ucs.abc\",\"accountDsc\":\"\",\"resourceName\":\"统一通讯系统\",\"account\":\"110101198200000010\",\"resourceType\":\"1\"},\"EBA\":{\"resourceID\":\"8jdl9d56wvax0v1vcocbek9l2kh373gj\",\"resourceCode\":\"EBA\",\"resourceURL\":\"http://10.237.146.198:8080/eba/orgstruc/AuthenticationProcessingAction_ssoLogin.action\",\"accountDsc\":\"\",\"resourceName\":\"数据中心三线一网格管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"OVM\":{\"resourceID\":\"s8vwwjzc6d35ximk19m5hiinr67o3tzr\",\"resourceCode\":\"OVM\",\"resourceURL\":\"http://10.233.81.214:9080/ovm/index/ssologin.action\",\"accountDsc\":\"\",\"resourceName\":\"机构视图管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"DLP\":{\"resourceID\":\"bfjh5mcovbxyrfz7fnjwxjicqpna3009\",\"resourceCode\":\"DLP\",\"resourceURL\":\"https://10.233.5.54:443/v1/service/auth/\",\"accountDsc\":\"\",\"resourceName\":\"邮件防泄漏系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"APMS\":{\"resourceID\":\"h8kpt4geq6wjxseoi3a5itzwhal3aiv0\",\"resourceCode\":\"APMS\",\"resourceURL\":\"http://10.232.50.232:8023/verify/login\",\"accountDsc\":\"\",\"resourceName\":\"应用问题管理系统\",\"account\":\"gaozhengang\",\"resourceType\":\"2\"},\"EHR\":{\"resourceID\":\"4906cyxctqgwo9sl5q3erphgi0xyovzb\",\"resourceCode\":\"EHR\",\"resourceURL\":\"http://10.232.48.84:223/ehr/login.do?state=ssoLogin\",\"accountDsc\":\"\",\"resourceName\":\"新型人力资源信息化系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"GSTV\":{\"resourceID\":\"insv4tr71nxf4gmtukzy85irhi2q3j8z\",\"resourceCode\":\"GSTV\",\"resourceURL\":\"http://10.230.165.71:9080/stms/serviceValidate.action\",\"accountDsc\":\"\",\"resourceName\":\"中国农业银行新一代自助设备业务管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"FMIS\":{\"resourceID\":\"hzi1o7vybix3szldhxxyer8xa9wtgpxc\",\"resourceCode\":\"FMIS\",\"resourceURL\":\"http://fmiserp.abc\",\"accountDsc\":\"\",\"resourceName\":\"财务管理信息系统\",\"account\":\"110101198200000010\",\"resourceType\":\"3\"},\"AIIP\":{\"resourceID\":\"8jx4pzw8xi7kio2em9tsbihk8yikgvnm\",\"resourceCode\":\"AIIP\",\"resourceURL\":\"http://10.233.93.110:233/sharemodule/AuthenticationProcessingAction_usapLogin.action\",\"accountDsc\":\"\",\"resourceName\":\"众创平台\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"DMSmart\":{\"resourceID\":\"2pfo7g1fyqoq1ppz2ey1rfmtggi2xl4w\",\"resourceCode\":\"DMSmart\",\"resourceURL\":\"http://dmsmart.abc\",\"accountDsc\":\"\",\"resourceName\":\"数据模型设计与管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"31MS\":{\"resourceID\":\"eqopu79ofihpsdx6m4on77l7lpmhax8g\",\"resourceCode\":\"31MS\",\"resourceURL\":\"http://10.233.93.65:318/to31ms/privmng/To31msAuthenticationAction_ssologin.action\",\"accountDsc\":\"\",\"resourceName\":\"三线一网格管理模式应用系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"ISmart\":{\"resourceID\":\"bjs0tobyp859c8sf7qrl8eigfvzmosnw\",\"resourceCode\":\"ISmart\",\"resourceURL\":\"http://40.129.25.95:8080/ismart/indexlogin.action\",\"accountDsc\":\"\",\"resourceName\":\"应用接口管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"MMSP\":{\"resourceID\":\"ju789m19uculcwdk908gvew0rfbx5nt1\",\"resourceCode\":\"MMSP\",\"resourceURL\":\"http://1.1.1.11:11/\",\"accountDsc\":\"\",\"resourceName\":\"客户经理在线2.0\",\"account\":\"110101198200000010\",\"resourceType\":\"4\"},\"MDMS\":{\"resourceID\":\"5eliu2h7i3habi8uzkyxfzw8etoymonh\",\"resourceCode\":\"MDMS\",\"resourceURL\":\"http://10.229.169.168:210/mdms/login.action\",\"accountDsc\":\"\",\"resourceName\":\"元数据管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"3\"},\"ToMarsIM\":{\"resourceID\":\"va5h6z2n0b117iolsynb41qlqrnr9jz1\",\"resourceCode\":\"ToMarsIM\",\"resourceURL\":\"http://tomars.abc/\",\"accountDsc\":\"\",\"resourceName\":\"移动营销服务系统即时通讯\",\"account\":\"110101198200000010\",\"resourceType\":\"4\"},\"PRINCE\":{\"resourceID\":\"2e9gwsmridnj1x8porrxnbf0c65jfbaf\",\"resourceCode\":\"PRINCE\",\"resourceURL\":\"http://10.233.14.146:8080/prince/rest/loginForUsap\",\"accountDsc\":\"\",\"resourceName\":\"产品管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"MASFA\":{\"resourceID\":\"cswsk9ljrgucwstqezllqvquq99p0a8x\",\"resourceCode\":\"MASFA\",\"resourceURL\":\"http://10.233.5.37/auth/sso.php\",\"accountDsc\":\"\",\"resourceName\":\"邮件归档审计系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"STMS\":{\"resourceID\":\"c8dbqzy2d5dgr9etx6uxcdlst96zg0qh\",\"resourceCode\":\"STMS\",\"resourceURL\":\"http://10.230.165.71:9080/stms/serviceValidate.action\",\"accountDsc\":\"\",\"resourceName\":\"自助设备监控管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"iReport\":{\"resourceID\":\"79dxjvexahfl9i4txw30n15wsyujlpng\",\"resourceCode\":\"iReport\",\"resourceURL\":\"http://10.230.136.194/index.aspx\",\"accountDsc\":\"\",\"resourceName\":\"报表智能视窗\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"usaptest\":{\"resourceID\":\"q0ymqazb6z7i6smeuug71q9a0erg0hcs\",\"resourceCode\":\"usaptest\",\"resourceURL\":\"http://10.232.48.83:88/usaptest/index.jsp\",\"accountDsc\":\"\",\"resourceName\":\"usaptestaa\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"EMM\":{\"resourceID\":\"fr8xi5ux7ap9xusx73z1d017bi304f5n\",\"resourceCode\":\"EMM\",\"resourceURL\":\"https://10.230.171.132/html/login.html\",\"accountDsc\":\"\",\"resourceName\":\"企业移动设备管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"ECMS\":{\"resourceID\":\"dcxbq0887x4sinh6rtq1hli8oy7yei1m\",\"resourceCode\":\"ECMS\",\"resourceURL\":\"http://10.230.160.67:9080/sso/ssoLogin.action\",\"accountDsc\":\"\",\"resourceName\":\"中国农业银行网络学院\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"EMM_VPN\":{\"resourceID\":\"ldtl95wwdz14xp0154owmue3s4on7g2x\",\"resourceCode\":\"EMM_VPN\",\"resourceURL\":\"http://emm-vpn.abc\",\"accountDsc\":\"\",\"resourceName\":\"农行移动办公VPN\",\"account\":\"110101198200000010\",\"resourceType\":\"1\"},\"ITSM\":{\"resourceID\":\"vv5x3numhwlxnhf2a5urwyxeotwbixra\",\"resourceCode\":\"ITSM\",\"resourceURL\":\"http://10.237.130.7:9999/ITAPSM/openITSMIndex.action\",\"accountDsc\":\"\",\"resourceName\":\"IT服务管理平台\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"ICCS\":{\"resourceID\":\"mr8u6lcee0cy4174etvr1t15mxcsohrm\",\"resourceCode\":\"ICCS\",\"resourceURL\":\"http://44.9.0.22:8090/irms/sysadmin/authentication/IrmsAuthenticationAction_ssologin.action\",\"accountDsc\":\"\",\"resourceName\":\"内控合规管理信息系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"PSM\":{\"resourceID\":\"qcwk86boneyt7oni74hz49b2onblmbb1\",\"resourceCode\":\"PSM\",\"resourceURL\":\"http://10.229.183.27:9081/informationmanage/AuthenticationProcessingAction_loginPSMByUSAP.action\",\"accountDsc\":\"\",\"resourceName\":\"后勤保障综合管理平台\",\"account\":\"110101198200000010\",\"resourceType\":\"3\"},\"BMIP\":{\"resourceID\":\"9gnq8u2q748vwj35gtk2niaes8kxe52r\",\"resourceCode\":\"BMIP\",\"resourceURL\":\"http://10.230.146.168:9080/bmip/ssoJump\",\"accountDsc\":\"\",\"resourceName\":\"经营管理信息平台\",\"account\":\"110101198200000010\",\"resourceType\":\"4\"},\"DFAULTCLINAME\":{\"resourceID\":\"8aqp81ansnvjh9eolp1r40ajtatix9ik\",\"resourceCode\":\"DFAULTCLINAME\",\"resourceURL\":\"http://10.232.48.83:88/usaptest/index.jsp\",\"accountDsc\":\"\",\"resourceName\":\"默认从账号测试系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"PORTAL\":{\"resourceID\":\"ns6c1ionfyh476tro6apgkc4ll14wxn5\",\"resourceCode\":\"PORTAL\",\"resourceURL\":\"http://portal.abc\",\"accountDsc\":\"\",\"resourceName\":\"门户系统测试\",\"account\":\"110101198200000010\",\"resourceType\":\"3\"},\"EAM\":{\"resourceID\":\"9aqnkwd927fmrd2m1u9c4h6s74zh52op\",\"resourceCode\":\"EAM\",\"resourceURL\":\"http://10.233.107.229:28080/informationmanage/AuthenticationProcessingAction_loginEAMByUSAP.action\",\"accountDsc\":\"\",\"resourceName\":\"实物资产管理系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"UPTP\":{\"resourceID\":\"2yddzrx3erorx3rx2gqmwzrzf7q2jkev\",\"resourceCode\":\"UPTP\",\"resourceURL\":\"http://10.230.146.221:9080/itms/login.html\",\"accountDsc\":\"\",\"resourceName\":\"一体化支付终端\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"UOP\":{\"resourceID\":\"688s0fjqwqoil8d3okph9xplscgtgq0r\",\"resourceCode\":\"UOP\",\"resourceURL\":\"http://itable.abc\",\"accountDsc\":\"\",\"resourceName\":\"统一办公门户\",\"account\":\"365302268300000020\",\"resourceType\":\"4\"},\"ITA\":{\"resourceID\":\"obrnltndhlbgxe1ukdrdg1p4tgaluw3d\",\"resourceCode\":\"ITA\",\"resourceURL\":\"http://10.233.93.55:257/ita/doLoginForSso.action\",\"accountDsc\":\"\",\"resourceName\":\"科技管理工作台\",\"account\":\"110101198200000010\",\"resourceType\":\"4\"},\"PIMP\":{\"resourceID\":\"egvm5n0cpk3c7nk2nrh4wvy1ef5540lf\",\"resourceCode\":\"PIMP\",\"resourceURL\":\"http://10.230.157.90:9080/pimp/index/doLoginForSSO.action\",\"accountDsc\":\"\",\"resourceName\":\"流程综合管理平台\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"LAMP\":{\"resourceID\":\"mjxc1cifp6awnnhxa4tdz0gttxr90mbs\",\"resourceCode\":\"LAMP\",\"resourceURL\":\"http://10.233.82.22:9080/fimp/LoginAction_login.action\",\"accountDsc\":\"\",\"resourceName\":\"综合财会管理平台\",\"account\":\"110101198200000010\",\"resourceType\":\"4\"},\"OCP\":{\"resourceID\":\"zps6judq3lmtnycf9ejegape6y52cdp3\",\"resourceCode\":\"OCP\",\"resourceURL\":\"http://10.233.93.65:259/users/sso\",\"accountDsc\":\"\",\"resourceName\":\"基础应用软件支持平台\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"Taihang_Manager\":{\"resourceID\":\"g1b1nx4t2jjq8ywnl6y4937qgjb1fvmn\",\"resourceCode\":\"Taihang_Manager\",\"resourceURL\":\"http://10.233.17.51:8080/taihang-manager/authority/login/SSOlogin.action\",\"accountDsc\":\"\",\"resourceName\":\"综合应用平台（太行）运行管理工具\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"LCMS\":{\"resourceID\":\"v6u6gvkpfvkhka5sq9jes8fn8xd4qqfj\",\"resourceCode\":\"LCMS\",\"resourceURL\":\"http://10.231.105.14:8080/LCMS/rest/doLoginForSSO\",\"accountDsc\":\"\",\"resourceName\":\"信访管理信息系统\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"RCP\":{\"resourceID\":\"iz4vfbamrd4zjigvd2u2tkwvho9zwome\",\"resourceCode\":\"RCP\",\"resourceURL\":\"http://10.230.215.180:8585/usap\",\"accountDsc\":\"\",\"resourceName\":\"Redis缓存云平台\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"},\"DAMP\":{\"resourceID\":\"85omknj25bk5oeqhsj3ct6vq81eaz9lj\",\"resourceCode\":\"DAMP\",\"resourceURL\":\"http://10.233.93.55:375/damp/ssoJump\",\"accountDsc\":\"\",\"resourceName\":\"数据分析挖掘平台\",\"account\":\"110101198200000010\",\"resourceType\":\"2\"}},\"TGCTimeout\":14400,\"randomCode\":null,\"userName\":\"@刚\",\"userCode\":\"990001625\"},\"pwdExpireTimeStr\":\"2024-02-11 15:02:49\",\"perList\":[],\"userInfoDomain\":{\"postcode\":null,\"photo\":\"\",\"remark\":\"\",\"officeAdd\":null,\"officeFax\":null,\"officeTel\":null,\"workingAreas\":\"[{\\\"workingArea\\\":\\\"liuchangcy\\\",\\\"officePhone\\\":\\\"\\\",\\\"mailAddress\\\":\\\"CN=刘畅/OU=成研应用开发二部/OU=软件开发中心/OU=总行机关/O=ABC\\\",\\\"postcode\\\":\\\"\\\",\\\"taxNumber\\\":\\\"\\\"}]\",\"mobilephone\":\"18810464530\",\"cardId\":\"e455b2855accee55ee2e6daf0d09823b\",\"reserved3\":null,\"reserved2\":null,\"reserved1\":null,\"communicationAdd\":null,\"id\":\"b42f6631a98d4feeb814d2eb59b39d7d\",\"email\":\"\"},\"userDomain\":{\"birthday\":null,\"userTypeId\":\"1\",\"serviceYear\":0,\"code\":\"990001625\",\"departmentId\":\"\",\"orderNum\":0,\"remark\":\"\",\"inOrgStartDate\":null,\"headshipIdName\":null,\"synNeedFlag\":\"1\",\"orgId\":\"f6fd3928a75d4305bb41c89c2e364537\",\"ssoName\":\"hudaihai\",\"coopDeptId\":\"\",\"character\":\"2\",\"notesId\":\"CN=胡代海/OU=成研开发二部/OU=研发中心/OU=总行机关/O=ABC\",\"ssoResourceCode\":\"SOI_ZH_ABC\",\"orgShort\":\"开放平台处\",\"sexName\":null,\"reserved3\":\"\",\"reserved2\":\"kz\",\"reserved1\":\"\",\"coopBranchName\":null,\"id\":\"b42f6631a98d4feeb814d2eb59b39d7d\",\"soiIp\":\"zhkfc.zh.abc\",\"nationName\":null,\"orgName\":\"信息技术管理部开放平台处\",\"isActiveFlag\":\"1\",\"sex\":\"\",\"headshipName\":\"\",\"haveSubuserFlag\":\"0\",\"headshipId\":\"\",\"nationId\":\"\",\"marryId\":null,\"spellName\":\"kangzheng\",\"employeeCard\":\"990001625\",\"coopDeptName\":null,\"coopBranchId\":\"\",\"serviceStartDate\":938707200000,\"inABCDate\":null,\"branchCompanyId\":\"648da2f09f3342669ac9f418d1143c1e\",\"cardId\":\"e455b2855accee55ee2e6daf0d09823b\",\"name\":\"康政\",\"headshipTypeName\":null,\"soiHubIp\":\"zhkfc.zh.abc\",\"registerName\":\"kangzheng\",\"emailIp\":\"test.mail.abc\"},\"sessionId\":null,\"allowApps\":null},\"httpCode\":null,\"message\":\"登录成功\",\"status\":true}}";


        TestEnty baseEntity=    JSON.parseObject(json, TestEnty.class);

        System.out.println("-=-=");

    }
}