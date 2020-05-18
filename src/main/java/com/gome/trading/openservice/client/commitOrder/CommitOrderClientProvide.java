package com.gome.trading.openservice.client.commitOrder;


import com.gome.auto.common.annotation.AUTO_DUBBO_INVOKE;
import com.gome.auto.common.annotation.AUTO_DUBBO_SERVER;

@AUTO_DUBBO_SERVER
public interface CommitOrderClientProvide {
    @AUTO_DUBBO_INVOKE(method = "commitOrder",
            attributes = {"com.gome.rpc.base.RequestDTO"},
            dubbio_interface = "com.gome.trading.openservice.client.commitOrder.CommitOrderClient")
    Object commitOrder(Object[] objs);
}

