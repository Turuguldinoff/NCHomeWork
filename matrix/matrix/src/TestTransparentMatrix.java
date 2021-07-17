import org.junit.Test;
import org.junit.Assert;

public class TestTransparentMatrix{

    @Test        
    public void testGetElement() {
        int[][] m = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
                m[i][j] = i*2+j;
            }
        }
        MatrixImpl mm = new MatrixImpl(m);

        TransparentMatrix mas = new TransparentMatrix(mm);


        Assert.assertEquals(1, mas.getElement(1,0));
    }

}