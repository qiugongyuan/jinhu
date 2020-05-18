package com.gome.trading.openservice.client.mergeCart;


import com.gome.auto.common.annotation.AUTO_DUBBO_INVOKE;
import com.gome.auto.common.annotation.AUTO_DUBBO_SERVER;

@AUTO_DUBBO_SERVER
public interface MergeCartClientProvide {
    @AUTO_DUBBO_INVOKE(method = "mergeCart",
            attributes = {"com.gome.rpc.base.RequestDTO"},
            dubbio_interface = "com.gome.trading.openservice.client.mergeCart.MergeCartClient")
    Object mergeCart(Object[] objs);
}

