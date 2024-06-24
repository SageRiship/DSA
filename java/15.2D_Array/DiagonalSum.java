public class DiagonalSum {

    public static int DiagonalSumBruteforce(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int DiagonalSumOptimised(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];

            /*
             * 2nd condition i+j = arr.length -1
             * so simple math equation
             * 
             * i+j=arr.length-1
             * j=arr.length-1-i
             * 
             */

            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(DiagonalSumBruteforce(matrix));
        System.out.println(DiagonalSumOptimised(matrix));
    }
}
