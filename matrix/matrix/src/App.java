public class App {
    public static void main(String[] args) throws Exception {

        int[][] matrix = new int[3][3];
        int[][] matrix2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                matrix[i][j] = i*3+j;
            }
        }

        MatrixImpl m = new MatrixImpl(matrix);

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(m.getElement(i, j) + " ");
            }
                System.out.println();
        }

        System.out.println();

        TransparentMatrix ma = new TransparentMatrix(m);

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(ma.getElement(i, j) + " ");
                matrix2[i][j] = ma.getElement(i, j);
            }
                System.out.println();
        }
        System.out.println();

        MatrixImpl m2 = new MatrixImpl(matrix2);

        SumOfTwoMatrix mas = new SumOfTwoMatrix(m, m2);

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(mas.getElement(i, j) + " ");
            }
                System.out.println();
        }
    }
}
