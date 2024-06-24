public class LargestInArray02 {

    public static int largestNum(int[] numbers) {
        int big = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > big) {
                big = numbers[i];
            }
        }
        return big;
    }

    public static int smallestNum(int[] numbers) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < small) {
                small = numbers[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 1001, 5,121, 34, 14, 86 };
        int largest = LargestInArray02.largestNum(numbers);
        int smallet = LargestInArray02.smallestNum(numbers);
        System.out.println("Largest Number :" + largest);
        System.out.println("Smallest Number : "+smallet);
    }
}
