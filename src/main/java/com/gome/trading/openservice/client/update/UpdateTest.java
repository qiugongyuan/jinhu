package com.gome.trading.openservice.client.update;


import com.gome.auto.common.utils.ProxyDubboUtils;
import com.gome.test.api.annotation.AutoCaseOwner;
import org.testng.annotations.Test;

public class UpdateTest {
    UpdateClientProvide updateClientProvide = ProxyDubboUtils.create(UpdateClientProvide.class);

    @AutoCaseOwner(description = "zhaoming")
    @Test(dataProvider = "update_01",description = "更新接口",dataProviderClass=UpdateData.class)
    public void update(Object[] objects) throws InterruptedException {
        Object object=updateClientProvide.update(objects);
        object.toString();
    }

}
