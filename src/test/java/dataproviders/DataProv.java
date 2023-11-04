package dataproviders;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProv {

    @DataProvider(name = "Numbers")
    public Object[][] dpMethod() {
        return new Object[][]{
                {1, 2},
                {3, 3},
                {4, 5},
        };
    }

    @DataProvider(name = "NumbersWithMethod")
    public Object[][] dpMethod(Method m) {
        if (m.getName().equalsIgnoreCase("dataprovMethodTestNotEqual")) {
            return new Object[][]{
                    {1, 2},
                    {3, 5},
                    {4, 5},
            };
        } else {
            return new Object[][]{
                    {2, 2},
                    {5, 5},
                    {4, 4},
                    {4, 4},
                    {4, 4},
            };
        }
    }
}
