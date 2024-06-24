public class RotateMatrix {

    public static void rotateMatrixClockwise(int[][] matrix) {
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix[i]);
        }

    }

    public static void rotateMatrixAntiClockwise(int[][] matrix) {
        transpose(matrix);
        reverseCol(matrix);

    }

    public static void reverseCol(int[][] matrix) {
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        for (int col = 0; col < colNum; col++) {
            int[] tempCol = new int[rowNum];
            for (int row = 0; row < rowNum; row++) {
                tempCol[row] = matrix[row][col];
            }
            for (int row = 0; row < rowNum; row++) {
                matrix[row][col] = tempCol[rowNum - 1 - row];
            }
        }
    }

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("before transpose");
        printMatrix(matrix);
        // transpose(matrix);
        //rotateMatrixClockwise(matrix);
        rotateMatrixAntiClockwise(matrix);
        System.out.println("After Transpose");
        printMatrix(matrix);

    }
}
