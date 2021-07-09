import org.junit.Test;
import org.junit.Assert;

public class BoxTest {
    @Test
    public void getAreaBox2() {
        Shape box = new Box(2);

        Assert.assertEquals(4.0, box.getArea(), 0.1);
    }

    @Test
    public void getAreaBoxColor2() {
        Shape box = new Box(2, "red");

        Assert.assertEquals(4.0, box.getArea(), 0.1);
    }

    @Test
    public void noGetAreaBox2() {
        Shape box = new Box(2);

        Assert.assertEquals(5.0, box.getArea(), 0.1);
    }
}
