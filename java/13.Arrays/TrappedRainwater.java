import java.util.Arrays;

public class TrappedRainwater {

    public static int trappedRainwater(int[] height) {

        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];
        // to calculate leftMax
        for (int i = 1; i < height.length; i++) {
            // if(height[i]>leftMax[i-1]){
            // leftMax[i]=height[i];
            // }else{
            // leftMax[i]=leftMax[i-1];
            // }
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // to calculate rightMax
        for (int i = height.length - 2; i >= 0; i--) {
            // if (height[i]>rightMax[i+1]){
            // rightMax[i]=height[i];
            // }else{
            // rightMax[i]=rightMax[i+1];
            // }
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 2, 0, 6, 3, 2, 5 };
        int water = trappedRainwater(numbers);
        System.out.println("Trapper water :"+water);
    }
}
