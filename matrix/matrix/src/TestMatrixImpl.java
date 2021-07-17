import org.junit.Test;
import org.junit.Assert;

public class TestMatrixImpl{

    @Test        
    public void testGetElement() {
        int[][] m = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
                m[i][j] = i*2+j;
            }
        }
        MatrixImpl mm = new MatrixImpl(m);


        Assert.assertEquals(2, mm.getElement(1,0));
    }

}
