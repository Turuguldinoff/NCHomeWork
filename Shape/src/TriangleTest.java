import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void getAreaTriangle2() {
        Shape c = new Triangle(9, 12, 15);

        Assert.assertEquals(54.0, c.getArea(), 0.1);
    }

    @Test
    public void getAreaTriangeColor2() {
        Shape c = new Triangle(9, 12, 15 "red");

        Assert.assertEquals(54.0, c.getArea(), 0.1);
    }

    @Test
    public void noGetAreaTriangle2() {
        Shape c = new Triangle(2, 3, 4);

        Assert.assertEquals(5.0, c.getArea(), 0.1);
    }

    @Test
    public void noGetAreaTriangle() {
        Shape c = new Triangle(1, 3, 4);

        Assert.assertEquals(0, c.getArea(), 0.1);
    }
}