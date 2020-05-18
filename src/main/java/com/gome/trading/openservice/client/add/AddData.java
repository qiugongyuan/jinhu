package com.gome.trading.openservice.client.add;

import com.gome.rpc.base.RequestDTO;
import org.testng.annotations.DataProvider;

public class AddData {

    @DataProvider(name = "add_01")
    public static Object[][] deleteAddressToCart_Provider(){
        return new Object[][]{
                {new Object[]{com.alibaba.fastjson.JSON.parseObject("{\"body\":{\"itemParams\":[{\"addressVO\":{\"cityCode\":\"11010000\",\"countyCode\":\"11010200\",\"orgCode\":\"1001\",\"stateCode\":\"11000000\",\"townCode\":\"110102002\"},\"extensionMap\":{},\"quantity\":1,\"shopNo\":\"G001\",\"shopType\":\"fshop\",\"skuId\":\"1000225772\"}],\"operateDomain\":\"cart_domain\",\"requestSource\":{\"bizId\":\"ADD_NORMAL\",\"invokeFrom\":\"pc_cart\",\"siteId\":\"homeSite\",\"terminal\":\"pc\",\"txId\":\"1a6d880b57a64bd5af3a22fd1ee54247\"},\"resultCondition\":\"4\",\"user\":{\"loginName\":\"shilibing318\",\"loginStatus\":\"logined\",\"mobile\":\"18039123996\",\"userExtension\":{\"accountPeriod\":false,\"engineeringMachine\":false},\"userGrade\":\"14\",\"userIP\":\"127.0.0.1\",\"userId\":\"100014465780\",\"userType\":\"COMMON\"}}}", RequestDTO.class)}}
        };
    }

}
