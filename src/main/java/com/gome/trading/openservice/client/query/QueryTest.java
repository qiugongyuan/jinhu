package com.gome.trading.openservice.client.query;


import com.alibaba.fastjson.JSON;
import com.gome.auto.common.utils.ProxyDubboUtils;
import com.gome.test.api.annotation.AutoCaseOwner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class QueryTest {
    QueryClientProvide queryClientProvide = ProxyDubboUtils.create(QueryClientProvide.class);


    @AfterClass
    public void AfterClass(){

    }
    @AutoCaseOwner(description = "zhaoming")
    @Test(dataProvider = "query_01",description = "查询接口",dataProviderClass=QueryData.class)
    public void query(Object[] objects) throws InterruptedException {
        Object object= queryClientProvide.query(objects);

    }

}
