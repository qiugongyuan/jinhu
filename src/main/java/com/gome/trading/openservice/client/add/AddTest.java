package com.gome.trading.openservice.client.add;


import com.gome.auto.common.utils.ProxyDubboUtils;
import com.gome.test.api.annotation.AutoCaseOwner;
import org.testng.annotations.Test;

public class AddTest {
    AddClientProvide addClientProvide = ProxyDubboUtils.create(AddClientProvide.class);

    @AutoCaseOwner(description = "zhaoming")
    @Test(dataProvider = "add_01",description = "添加接口",dataProviderClass=AddData.class)
    public void add(Object[] objects) throws InterruptedException {
        Object object=addClientProvide.add(objects);
        object.toString();
    }

}
