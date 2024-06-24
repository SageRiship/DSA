import java.util.Arrays;

public class MultiplicationOfMatrix {

    public static int[][] multiplicationOfMatrices(int[][] matrix1, int[][] matrix2) {
        int rA = matrix1.length;
        int rB = matrix2.length;
        int cA = matrix1[0].length;
        int cB = matrix2[0].length;

        // Check if the matrices can be multiplied
        if (cA != rB) {
            return null; // Return null if they cannot be multiplied
        }

        int[][] result = new int[rA][cB];

        // Perform matrix multiplication
        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < cB; j++) {
                result[i][j] = 0; // Initialize the result cell to 0
                for (int k = 0; k < cA; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result; // Return the resulting matrix
    }
    public static void printRowWise(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] A = new int[][]{{2, 0, 1}, {3, 4, 0}};
        int[][] B = new int[][]{{3, 1}, {8, 0}, {0, 5}};
        printRowWise(multiplicationOfMatrices(A, B));
    }
}
