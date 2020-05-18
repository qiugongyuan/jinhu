package com.gome.trading.openservice.client.delete;


import com.gome.auto.common.annotation.AUTO_DUBBO_INVOKE;
import com.gome.auto.common.annotation.AUTO_DUBBO_SERVER;

@AUTO_DUBBO_SERVER
public interface DeleteClientProvide {
    @AUTO_DUBBO_INVOKE(method = "delete",
            attributes = {"com.gome.rpc.base.RequestDTO"},
            dubbio_interface = "com.gome.trading.openservice.client.delete.DeleteClient")
    Object delete(Object[] objs);
}

