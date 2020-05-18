package com.gome.trading.openservice.client.checkout;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.gome.rpc.base.RequestDTO;
import com.gome.trading.openservice.client.checkout.pdto.CheckoutPDTO;
import org.testng.annotations.DataProvider;

public class CheckoutData {

    @DataProvider(name = "checkout_01")
    public static Object[][] deleteAddressToCart_Provider(){
        String param = "{\"userId\":\"%s\",\"mobile\":\"%s\",\"userGrade\":\"%s\",\"userCardNum\":\"%s\",\"userType\":\"%s\",\"loginStatus\":\"%s\",\"loginName\":\"%s\",\"userIP\":\"%s\",\"engineeringMachine\":\"%s\",\"accountPeriod\":\"%s\",\"siteId\":\"%s\",\"side\":\"%s\",\"txId\":\"%s\",\"invokeFrom\":\"%s\",\"version\":\"%s\"}";
        return new Object[][]{
                //正常参数用例
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userId验证*****************************************/
                //异常参数认证：必填项userId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************mobile验证*****************************************/
                //异常参数认证：必填项mobile为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项mobile为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userGrade验证*****************************************/
                //异常参数认证：必填项userGrade为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userGrade为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userCardNum验证*****************************************/
                //异常参数认证：必填项userCardNum为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userCardNum为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userType验证*****************************************/
                //异常参数认证：必填项userType为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userType验证*****************************************/
                //正常useType选择，必填项userType=COMMON
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常useType选择，必填项userType=ENTERPRISE
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常useType选择，必填项userType=SUPER
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常useType选择，必填项userType=DUIGONG
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userType为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************loginStatus验证*****************************************/
                //正常loginStatus选择，必填项loginStatus=transients
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常loginStatus选择，必填项loginStatus=fakeLogin
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常loginStatus选择，必填项loginStatus=logined
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginStatus为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginStatus为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginStatus为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginStatus为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************loginName验证*****************************************/
                //异常参数认证：必填项loginName为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项loginName为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************userIP验证*****************************************/
                //异常参数认证：必填项userIP为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项userIP为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************engineeringMachine验证*****************************************/
                //正常engineeringMachine参数认证：engineeringMachine=Y
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常engineeringMachine参数认证：engineeringMachine=N
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine=""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项engineeringMachine为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************accountPeriod验证*****************************************/
                //正常accountPeriod参数认证：accountPeriod=Y
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //正常accountPeriod参数认证：accountPeriod=N
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod=""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项accountPeriod为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************siteId验证*****************************************/
                //异常参数认证：必填项siteId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项siteId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************side验证*****************************************/
                //异常参数认证：必填项side为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项side为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************txId验证*****************************************/
                //异常参数认证：必填项txId为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项txId为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************invokeFrom验证*****************************************/
                //异常参数认证：必填项invokeFrom为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项invokeFrom为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
/************************version验证*****************************************/
                //异常参数认证：必填项version为空""
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为空null
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为特殊字符"AAAA"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
                //异常参数认证：必填项version为特殊字符"汉字"
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","version"),new TypeReference<RequestDTO<CheckoutPDTO>>(){})},
                        //以下字符串为预期返回结果
                        //"0"
                },
        };
    }

}
