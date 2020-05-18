package com.gome.trading.openservice.client.query;


import com.gome.auto.common.annotation.AUTO_DUBBO_INVOKE;
import com.gome.auto.common.annotation.AUTO_DUBBO_SERVER;

@AUTO_DUBBO_SERVER
public interface QueryClientProvide {
    @AUTO_DUBBO_INVOKE(method = "query",
            attributes = {"com.gome.rpc.base.RequestDTO"},
            dubbio_interface = "com.gome.trading.openservice.client.query.QueryClient")
    Object query(Object[] objs);
}

