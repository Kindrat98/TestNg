import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void trHeronTest(){
        double actual = TriangleHeron.getSquare(3, 4, 5);
        double expected = 6;
        Assert.assertEquals(actual, expected);
    }
}
