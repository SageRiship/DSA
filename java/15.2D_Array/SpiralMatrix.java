public class SpiralMatrix {
    public static void PrintSpiralOptimised(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top Line
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            // right line
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol] + " ");
            }

            // bottom line
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][i] + " ");
            }

            // left line
            for (int j = endRow - 1; j > startRow; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[j][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void PrintSpiral(int[][] arr) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top Line
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            // right line
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol] + " ");
            }

            // bottom line
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(arr[endRow][i] + " ");
            }

            // left line
            for (int j = endRow - 1; j > startRow; j--) {
                System.out.print(arr[j][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        PrintSpiral(matrix);
    }
}