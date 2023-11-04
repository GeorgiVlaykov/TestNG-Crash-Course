package dataproviders;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderMethodTest {
    @Test(dataProvider = "NumbersWithMethod", dataProviderClass = DataProv.class)
    public void dataprovMethodTestNotEqual(int a, int b) {
        Assert.assertNotEquals(a, b, "Inputs are equal:");
    }

    @Test(dataProvider = "NumbersWithMethod", dataProviderClass = DataProv.class)
    public void dataprovMethodTestEqual(int a, int b) {
        Assert.assertEquals(a, b, "Inputs are not equal:");
    }

}
