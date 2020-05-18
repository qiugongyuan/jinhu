package com.gome.trading.openservice.client.delete;

import com.alibaba.fastjson.JSONObject;
import com.gome.rpc.base.RequestDTO;
import org.testng.annotations.DataProvider;

public class DeleteData {

    @DataProvider(name = "delete_01")
    public static Object[][] deleteAddressToCart_Provider(){
        String txId = java.util.UUID.randomUUID().toString();
        String version = java.util.UUID.randomUUID().toString();
        String param = "{\"userId\":\"%s\",\"mobile\":\"%s\",\"userGrade\":\"%s\",\"userCardNum\":\"%s\",\"userType\":\"%s\",\"loginStatus\":\"%s\",\"loginName\":\"%s\",\"userIP\":\"%s\",\"engineeringMachine\":\"%s\",\"accountPeriod\":\"%s\",\"siteId\":\"%s\",\"side\":\"%s\",\"txId\":\"%s\",\"invokeFrom\":\"%s\",\"version\":\"%s\"}";
        String deleteparam = "{\"deleteItemDomain\":\"%s\",\"selltementId\":\"%s\",\"commerceItemIds\":\"%s\"}";
        return new Object[][]{
                //正常参数用例
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************61430003验证*****************************************/
                //异常参数认证：必填项61430003为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项61430003为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项61430003为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项61430003为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************15810366971验证*****************************************/
                //异常参数认证：必填项15810366971为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项15810366971为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项15810366971为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项15810366971为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************G5验证*****************************************/
                //异常参数认证：必填项G5为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项G5为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项G5为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项G5为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userCardNum验证*****************************************/
                //异常参数认证：必填项userCardNum为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************COMMON验证*****************************************/
                //异常参数认证：必填项COMMON为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项COMMON为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项COMMON为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项COMMON为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************COMMON验证*****************************************/
                //正常useType选择，必填项COMMON=COMMON
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常useType选择，必填项COMMON=ENTERPRISE
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常useType选择，必填项COMMON=SUPER
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常useType选择，必填项COMMON=DUIGONG
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项COMMON为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项COMMON为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项COMMON为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项COMMON为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************logined验证*****************************************/
                //正常logined选择，必填项logined=transients
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常logined选择，必填项logined=fakeLogin
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常logined选择，必填项logined=logined
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项logined为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项logined为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项logined为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项logined为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************suoni123验证*****************************************/
                //异常参数认证：必填项suoni123为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项suoni123为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项suoni123为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项suoni123为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************127.0.0.1验证*****************************************/
                //异常参数认证：必填项127.0.0.1为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项127.0.0.1为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项127.0.0.1为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项127.0.0.1为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************false验证*****************************************/
                //正常false参数认证：false=Y
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常false参数认证：false=N
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false=""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************false验证*****************************************/
                //正常false参数认证：false=Y
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常false参数认证：false=N
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false=""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项false为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************homeSite验证*****************************************/
                //异常参数认证：必填项homeSite为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项homeSite为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项homeSite为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项homeSite为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************side验证*****************************************/
                //异常参数认证：必填项side为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************txId验证*****************************************/
                //异常参数认证：必填项txId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************app_cart验证*****************************************/
                //异常参数认证：必填项app_cart为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项app_cart为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项app_cart为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项app_cart为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************version验证*****************************************/
                //异常参数认证：必填项version为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"61430003","15810366971","G5","userCardNum","COMMON","logined","suoni123","127.0.0.1","false","false","homeSite","side",txId,"app_cart",version),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
        };
    }

}
