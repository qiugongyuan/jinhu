package com.gome.trading.openservice.client.add;


import com.gome.auto.common.annotation.AUTO_DUBBO_INVOKE;
import com.gome.auto.common.annotation.AUTO_DUBBO_SERVER;

public interface AddClientProvide {
    @AUTO_DUBBO_INVOKE(method = "add",
            attributes = {"com.gome.rpc.base.RequestDTO"},
            dubbio_interface = "com.gome.trading.openservice.client.add.AddClient")
    Object add(Object[] objs);
}

