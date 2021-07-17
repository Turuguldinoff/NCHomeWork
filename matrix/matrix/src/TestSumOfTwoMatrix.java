import org.junit.Test;
import org.junit.Assert;

public class TestSumOfTwoMatrix{

    @Test        
    public void testGetElement() {
        int[][] m = new int[2][2];
        int[][] m2 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
                m[i][j] = i*2+j;
                m2[i][j] = j*2+i;
            }
        }
        MatrixImpl mm = new MatrixImpl(m);
        MatrixImpl mm2 = new MatrixImpl(m2);

        SumOfTwoMatrix mas = new SumOfTwoMatrix(mm, mm2);


        Assert.assertEquals(6, mas.getElement(1,1));
    }

}