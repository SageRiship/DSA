public class Print2DArrays {

    public static void printRowWise(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printColWise(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void printColWaveWise(int[][] arr) { //printColWise means transpose
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = arr.length-1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isIdenticalMatrix(int [][]arr){
        int r=arr.length;
        int c=arr[0].length;
        if(r!=c){
            return false;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j && arr[i][j]!=1){
                    return false;
                }
                if(i!=j && arr[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr = new int[][] { { 1, 2, 4, 5 }, { 6, 7, 8, 9 } };
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 3, 1 }, { 12, 45, -1 }, { 1, 3, 4 } };
        // printRowWise(arr);
        printColWise(matrix);
        System.out.println(" space ");
        printColWaveWise(matrix);
        /*
         * 1 4 12 1
         * 2 3 45 3
         * 3 1 -1 4
         */
        matrix = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        System.out.println(isIdenticalMatrix(matrix));
    }
}
