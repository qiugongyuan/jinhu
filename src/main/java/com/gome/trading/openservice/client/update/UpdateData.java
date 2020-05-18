package com.gome.trading.openservice.client.update;

import com.alibaba.fastjson.JSONObject;
import com.gome.rpc.base.RequestDTO;
import org.testng.annotations.DataProvider;

public class UpdateData {

    @DataProvider(name = "update_01")
    public static Object[][] deleteAddressToCart_Provider(){
        String txId = java.util.UUID.randomUUID().toString();
        String version = java.util.UUID.randomUUID().toString();
        String param ="{\"body\":{\"user\":{\"userId\":\"%s\",\"mobile\":\"%s\",\"userGrade\":\"%s\",\"userCardNum\":\"%s\",\"userType\":\"%s\",\"loginStatus\":\"%s\",\"loginName\":\"%s\",\"userIP\":\"%s\",\"userExtensionInfo\":{\"engineeringMachine\":\"%s\",\"accountPeriod\":\"%s\"}},\"requestSource\":{\"siteId\":\"%s\",\"side\":\"%s\",\"txId\":\"%s\",\"invokeFrom\":\"%s\",\"version\":\"%s\",\"updateBizId\":\"%s\"}}}";
        return new Object[][]{
                //正常参数用例
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,null,"15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"AAAA","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"用户ID","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************mobile验证*****************************************/
                //异常参数认证：必填项mobile为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003",null,"G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","AAAA","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","手机号码","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userGrade验证*****************************************/
                //异常参数认证：必填项userGrade为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971",null,"userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","AAAA","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","用户身份","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userCardNum验证*****************************************/
                //异常参数认证：必填项userCardNum为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5",null,"COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","AAAA","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","会员卡编号","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userType验证，普通用户*****************************************/
                //异常参数认证：必填项userType为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum",null,"logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","AAAA","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","普通用户","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userType验证，企业用户*****************************************/
                //正常useType选择，必填项userType=ENTERPRISE
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","ENTERPRISE","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************loginStatus验证*****************************************/
                //正常loginStatus选择，必填项loginStatus=logined
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //以下注释内容，loginStatus只能为正常、临时等状态；不能验证为空或者特殊字符
//                //异常参数认证：必填项loginStatus为空""
//                 {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
//                //异常参数认证：必填项loginStatus为空null
//                 {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON",null,"suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
//                //异常参数认证：必填项loginStatus为特殊字符"AAAA"
//                 {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","AAAA","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
//                //异常参数认证：必填项loginStatus为特殊字符"汉字"
//                 {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","登录状态","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
/************************loginName验证*****************************************/
                //异常参数认证：必填项loginName为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined",null,"192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","AAAA","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","登录名称","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userIP验证*****************************************/
                //异常参数认证：必填项userIP为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123",null,"false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","AAAA","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","用户IP","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************engineeringMachine验证*****************************************/
                //正常engineeringMachine参数认证：engineeringMachine=Y
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","true","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常engineeringMachine参数认证：engineeringMachine=N
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine=""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9",null,"false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","AAAA","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","汉字","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************accountPeriod验证*****************************************/
                //正常accountPeriod参数认证：accountPeriod=Y
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","true","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常accountPeriod参数认证：accountPeriod=N
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod=""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false",null,"homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","AAAA","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","汉字","homeSite","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************siteId验证*****************************************/
                //异常参数认证：必填项siteId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false",null,"PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","AAAA","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","汉字","PC",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************side验证*****************************************/
                //异常参数认证：必填项side为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite",null,txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","AAAA",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","端",txId,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************txId验证*****************************************/
                //异常参数认证：必填项txId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC","","app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",null,"app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC","AAAA","app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC","汉字","app_cart",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************invokeFrom验证*****************************************/
                //异常参数认证：必填项invokeFrom为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,null,version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"AAAA",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"汉字",version,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************version验证*****************************************/
                //异常参数认证：必填项version为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","","quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",null,"quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","AAAA","quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","汉字","quantity"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************updateBizId验证*****************************************/
                //异常参数认证：必填项updateBizId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,""),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项updateBizId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,null),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项updateBizId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"AAAA"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项updateBizId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",version,"汉字"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
        };
    }

}
