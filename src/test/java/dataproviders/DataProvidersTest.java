package dataproviders;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvidersTest {
    @Test(dataProvider = "Numbers", dataProviderClass = DataProv.class)
    public void dataprovTest(int a, int b) {
        Assert.assertNotEquals(a, b, "Inputs are equal:");
    }

}
