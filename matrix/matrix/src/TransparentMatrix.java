public class TransparentMatrix implements Matrix{
    
    private MatrixImpl matrix;

    public TransparentMatrix(MatrixImpl matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getElement(int i, int j){
        return matrix.getElement(j, i);
    }

}