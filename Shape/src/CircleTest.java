import org.junit.Test;
import org.junit.Assert;

public class CircleTest {
    @Test
    public void getAreaCircle2() {
        Shape c = new Circle(2);

        Assert.assertEquals(Math.PI * 4.0, c.getArea(), 0.1);
    }

    @Test
    public void getAreaCircleNegative2() {
        Shape c = new Circle(-2);

        Assert.assertEquals(-1, c.getArea(), 0.1);
    }

    @Test
    public void getAreaCircleColor2() {
        Shape c = new Circle(2, "red");

        Assert.assertEquals(Math.PI * 4.0, c.getArea(), 0.1);
    }

    @Test
    public void noGetAreaCircle2() {
        Shape c = new Circle(2);

        Assert.assertEquals(Math.PI * 5.0, c.getArea(), 0.1);
    }
}