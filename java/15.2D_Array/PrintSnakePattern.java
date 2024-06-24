public class PrintSnakePattern {
    public static void printSnakePattern(int[][] arr) { //printColWise means transpose
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr.length-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]matrix = new int[][]{{3, 4, 1, 8}, {1, 4, 9, 11}, {76, 34, 21, 1}, {2, 1, 4, 5}};
        printSnakePattern(matrix);
    }
}
