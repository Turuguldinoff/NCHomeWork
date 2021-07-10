import org.junit.Test;
import org.junit.Assert;

public class EllipseTest {
    @Test
    public void getAreaEllipse2() {
        Shape c = new Ellipse(2, 3);

        Assert.assertEquals(Math.PI * 2.0 * 3.0, c.getArea(), 0.1);
    }

    @Test
    public void getAreaEllipseNegative2() {
        Shape c = new Ellipse(-2, 3);

        Assert.assertEquals(-1, c.getArea(), 0.1);
    } 

    @Test
    public void getAreaEllipseNegative3() {
        Shape c = new Ellipse(2, -3);

        Assert.assertEquals(-1, c.getArea(), 0.1);
    }

    @Test
    public void getAreaEllipseColor2() {
        Shape c = new Ellipse(2, 3, "red");

        Assert.assertEquals(Math.PI * 2.0 * 3.0, c.getArea(), 0.1);
    }

    @Test
    public void noGetAreaEllipse2() {
        Shape c = new Ellipse(2, 3);

        Assert.assertEquals(Math.PI * 5.0, c.getArea(), 0.1);
    }
}