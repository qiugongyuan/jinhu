package com.gome.trading.openservice.client.delete;


import com.gome.auto.common.utils.ProxyDubboUtils;
import com.gome.test.api.annotation.AutoCaseOwner;
import org.testng.annotations.Test;

public class DeleteTest {
    DeleteClientProvide deleteClientProvide = ProxyDubboUtils.create(DeleteClientProvide.class);

    @AutoCaseOwner(description = "zhaoming")
    @Test(dataProvider = "delete_01",description = "删除接口",dataProviderClass=DeleteData.class)
    public void delete(Object[] objects) throws InterruptedException {
        Object object=deleteClientProvide.delete(objects);
        object.toString();
    }

}
