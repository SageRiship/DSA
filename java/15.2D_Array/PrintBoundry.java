public class PrintBoundry {
    private static void printBoundary(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // Traverse only the first row and print elements.
        for (int i = 0; i < c; i++) {
            System.out.print(matrix[0][i] + " ");
        }
        // Traverse only the last column and print elements.
        for (int i = 1; i < r; i++) {
            System.out.print(matrix[i][c - 1] + " ");
        }
        // Traverse only the last row and print elements.
        for (int i = c - 2; i >= 0; i--) {
            System.out.print(matrix[r - 1][i] + " ");
        }
        // Traverse only the first column and print elements.
        for (int i = r - 2; i >= 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 3, 4, 1, 8 }, { 1, 4, 9, 11 }, { 76, 34, 21, 1 }, { 2, 1, 4, 5 } };
        printBoundary(matrix);
    }
}
