package com.gome.trading.openservice.client.mergeCart;

import com.alibaba.fastjson.JSONObject;
import com.gome.rpc.base.RequestDTO;
import org.testng.annotations.DataProvider;

public class MergeCartData {

    @DataProvider(name = "mergeCart_01")
    public static Object[][] deleteAddressToCart_Provider(){
        String param="{\"userId\":\"%s\",\"mobile\":\"%s\",\"userGrade\":\"%s\",\"userCardNum\":\"%s\",\"userType\":\"%s\",\"loginStatus\":\"%s\",\"loginName\":\"%s\",\"userIP\":\"%s\",\"engineeringMachine\":\"%s\",\"accountPeriod\":\"%s\",\"siteId\":\"%s\",\"side\":\"%s\",\"txId\":\"%s\",\"invokeFrom\":\"%s\",\"visitorId\":\"%s\"}";
        return new Object[][]{
                //正常参数用例
                {new Object[]{JSONObject.parseObject(String.format(param,"userId","mobile","userGrade","userCardNum","userType","loginStatus","loginName","userIP","engineeringMachine","accountPeriod","siteId","side","txId","invokeFrom","visitorId"),RequestDTO.class)},
                        //以下字符串为预期返回结果
                        //"0"
                },
        };
    }

}
