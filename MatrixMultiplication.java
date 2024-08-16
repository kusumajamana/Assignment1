public class MatrixMultiplication {
    public static void main(String[] args) {
    
        int[][] matrixA = {{1, 9},{3, 4}};

        int[][] matrixB = { {5, 6},  {7, 6} };

        int[][] resultMatrix = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}