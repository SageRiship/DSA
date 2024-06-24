import java.util.HashMap;

public class FindSubArraySum {

    public static void FindSubArraySumWithTargetSumAndPrint(int[] nums, int target) {
        int[] subArrayIndex = FindSubArraySumWithTargetSum(nums, target);
        if (subArrayIndex != null) {
            for (int i = subArrayIndex[0]; i <= subArrayIndex[1]; i++) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println("we didnt found subarray with target sum");

    }

    public static int[] FindSubArraySumWithTargetSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
           
            currSum += nums[i];
            if (currSum == target) {
                return new int[] { 0, i };
            }
            if (map.containsKey(currSum - target)) {
                int startIndex = map.get(currSum - target) + 1;
                return new int[] { startIndex, i };
            }

            map.put(currSum, i);

        }
        return null;
    }

    public static void main(String[] args) {
        // Given nums = { 1, 4, 20, 3, 10, 5 } and targetSum = 33
        int[] nums = { 1, 4, 20, 3, 10, 5 };
        int target = 33;
        FindSubArraySumWithTargetSumAndPrint(nums, target);
    }
}
