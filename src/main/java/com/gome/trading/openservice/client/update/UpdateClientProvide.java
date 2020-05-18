package com.gome.trading.openservice.client.update;


import com.gome.auto.common.annotation.AUTO_DUBBO_INVOKE;
import com.gome.auto.common.annotation.AUTO_DUBBO_SERVER;

@AUTO_DUBBO_SERVER
public interface UpdateClientProvide {
    @AUTO_DUBBO_INVOKE(method = "update",
            attributes = {"com.gome.rpc.base.RequestDTO"},
            dubbio_interface = "com.gome.trading.openservice.client.update.UpdateClient")
    Object update(Object[] objs);
}

