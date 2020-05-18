package com.gome.trading.openservice.client.query;

import com.alibaba.fastjson.JSONObject;
import com.gome.rpc.base.RequestDTO;
import org.testng.annotations.DataProvider;

import java.util.UUID;

public class QueryData {

    @DataProvider(name = "query_01")
    public static Object[][] deleteAddressToCart_Provider(){
        String txId = UUID.randomUUID().toString();
        String param = "{\"body\":{\"user\":{\"userId\":\"%s\",\"mobile\":\"%s\",\"userGrade\":\"%s\",\"userType\":\"%s\",\"loginStatus\":\"%s\",\"loginName\":\"%s\",\"userIP\":\"%s\",\"userExtensionInfo\":{\"engineeringMachine\":\"%s\",\"accountPeriod\":\"%s\"}},\"requestSource\":{\"siteId\":\"%s\",\"side\":\"%s\",\"txId\":\"%s\",\"invokeFrom\":\"%s\",\"queryBizId\":\"%s\"}}}";
        return new Object[][]{
                //正常参数用例
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,null,"15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"AAAA","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"用户ID","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************mobile验证*****************************************/
                //异常参数认证：必填项mobile为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003",null,"G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","AAAA","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","手机号码","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userGrade验证*****************************************/
                //异常参数认证：必填项userGrade为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971",null,"COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","AAAA","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","用户身份","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userType验证*****************************************/
                //正常useType选择，必填项userType=COMMON
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5",null,"logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","AAAA","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","用户类型","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userType验证，企业用户验证；需要一个企业用户，重写一条测试用例*****************************************/
                //正常useType选择，必填项userType=ENTERPRISE
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","ENTERPRISE","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************loginStatus验证*****************************************/
                //正常loginStatus选择，必填项loginStatus=logined
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //以下注释内容，loginStatus只能为正常、临时等状态；不能验证为空或者特殊字符
//                //异常参数认证：必填项loginStatus为空""
//                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
//                //异常参数认证：必填项loginStatus为空null
//                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON",null,"suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
//                //异常参数认证：必填项loginStatus为特殊字符"AAAA"
//                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","AAAA","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
//                //异常参数认证：必填项loginStatus为特殊字符"汉字"
//                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","正常登陆状态","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
//                        //以下字符串为预期返回结果
//                        //"0"
//                },
/************************loginName验证*****************************************/
                //异常参数认证：必填项loginName为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined",null,"192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","AAAA","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","登陆名称","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userIP验证*****************************************/
                //异常参数认证：必填项userIP为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123",null,"false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","AAAA","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","用户IP","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************engineeringMachine验证*****************************************/
                //正常engineeringMachine参数认证：engineeringMachine=false
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常engineeringMachine参数认证：engineeringMachine=true
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","true","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine=""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9",null,"false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","AAAA","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","验证汉字","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************accountPeriod验证*****************************************/
                //正常accountPeriod参数认证：accountPeriod=false
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常accountPeriod参数认证：accountPeriod=true
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","true","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod=""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false",null,"homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","AAAA","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","验证汉字","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************siteId验证*****************************************/
                //异常参数认证：必填项siteId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false",null,"PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","AAAA","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","站点","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************side验证*****************************************/
                //异常参数认证：必填项side为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite",null,txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","AAAA",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","端",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************txId验证*****************************************/
                //异常参数认证：必填项txId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",null,"app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC","AAAA","app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC","事务id","app_cart","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************invokeFrom验证*****************************************/
                //异常参数认证：必填项invokeFrom为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,null,"cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"AAAA","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"方法调用来源","cart"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************queryBizId验证*****************************************/
                //异常参数认证：必填项queryBizId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",""),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项queryBizId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart",null),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项queryBizId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","AAAA"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项queryBizId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","COMMON","logined","suoni123","192.168.1.9","false","false","homeSite","PC",txId,"app_cart","购物车业务标识"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
        };
    }

}
