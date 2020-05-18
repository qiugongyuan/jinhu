package com.gome.trading.openservice.client.mergeCart;


import com.gome.auto.common.utils.ProxyDubboUtils;
import com.gome.test.api.annotation.AutoCaseOwner;
import org.testng.annotations.Test;

public class MergeCartTest {
    MergeCartClientProvide mergeCartClientProvide = ProxyDubboUtils.create(MergeCartClientProvide.class);

    @AutoCaseOwner(description = "zhaoming")
    @Test(dataProvider = "mergeCart_01",description = "合并购物车接口",dataProviderClass=MergeCartData.class)
    public void mergeCart(Object[] objects) throws InterruptedException {
        Object object=mergeCartClientProvide.mergeCart(objects);

    }

}
