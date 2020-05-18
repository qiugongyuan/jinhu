package com.gome.trading.openservice.client.commitOrder;


import com.gome.auto.common.utils.ProxyDubboUtils;
import com.gome.test.api.annotation.AutoCaseOwner;

import org.testng.annotations.Test;

public class CommitOrderTest {

    CommitOrderClientProvide commitOrderClientProvide =ProxyDubboUtils.create(CommitOrderClientProvide.class);

    @AutoCaseOwner(description = "zhaoming")
    @Test(dataProvider = "commitOrder_01",description = "提交订单接口",dataProviderClass=CommitOrderData.class)
    public void commitOrder(Object[] objects) throws InterruptedException {
        Object object=commitOrderClientProvide.commitOrder(objects);
        object.toString();
    }

}
