public class MaxSubarraySum {
    //This is Brute force solution
    public static void maxSubarraySum(int[] numbers) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum = currentSum + numbers[k];
                }
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
                System.out.println("Current Sum :"+currentSum);
            }
            System.out.println();
        }
        System.out.println("Max Sum :" + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2,  4, 6, 8,10  ,-2,-1 };
        maxSubarraySum(numbers);
    }
}
