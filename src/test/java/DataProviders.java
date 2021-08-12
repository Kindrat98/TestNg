import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

    @DataProvider(name = "strings and ints")
    public Object[][] createStringData() {
        return new Object[][] {
                new Object[] { "Cedric", 1 },
                new Object[] { "Oleg", 2}
        };
    }

    @DataProvider(name = "ints")
    public Object[][] createIntegerData() {
        return new Object[][] {
                new Object[] { 1 },
                new Object[] { 2 }
        };
    }

    @DataProvider(name = "objs")
    public Object[][] createCustomData() {
        return new Object[][] {
                {new TestData(1,1)},
                {new TestData(0, 0)}
        };
    }

    @Test(dataProvider = "strings and ints")
    public void stings(String s, Integer i){
        System.out.println(s + i);
    }

    @Test(dataProvider = "ints")
    public void ints(Integer i){
        System.out.println(i);
    }

    @Test(dataProvider = "objs")
    public void objs(TestData i){
        System.out.println(i);
    }

    @Test(enabled = true)
    public void t(){
        int actual = 2 + 2;
        int expected = 5;
        Assert.assertEquals(actual, expected, "Sum is not correct");
    }
}
