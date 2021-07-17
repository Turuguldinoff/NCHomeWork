public class SumOfTwoMatrix implements Matrix{

    private MatrixImpl matrix1, matrix2;
    
    public SumOfTwoMatrix(MatrixImpl matrix1, MatrixImpl matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    @Override
    public int getElement(int i, int j){
        return matrix1.getElement(i, j) + matrix2.getElement(i, j);
    }
}