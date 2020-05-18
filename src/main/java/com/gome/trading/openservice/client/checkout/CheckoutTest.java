package com.gome.trading.openservice.client.checkout;


import com.gome.auto.common.utils.ProxyDubboUtils;
import com.gome.test.api.annotation.AutoCaseOwner;
import org.testng.annotations.Test;

public class CheckoutTest {
    CheckoutClientProvide checkoutClientProvide = ProxyDubboUtils.create(CheckoutClientProvide.class);

    @AutoCaseOwner(description = "zhaoming")
    @Test(dataProvider = "checkout_01",description = "去结算接口",dataProviderClass=CheckoutData.class)
    public void checkout(Object[] objects) throws InterruptedException {
        Object object=checkoutClientProvide.checkout(objects);
        object.toString();
    }

}
