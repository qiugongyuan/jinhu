package com.gome.trading.openservice.client.checkout;


import com.gome.auto.common.annotation.AUTO_DUBBO_INVOKE;
import com.gome.auto.common.annotation.AUTO_DUBBO_SERVER;

@AUTO_DUBBO_SERVER
public interface CheckoutClientProvide {
    @AUTO_DUBBO_INVOKE(method = "checkout",
            attributes = {"com.gome.rpc.base.RequestDTO"},
            dubbio_interface = "com.gome.trading.openservice.client.checkout.CheckoutClient")
    Object checkout(Object[] objs);
}

