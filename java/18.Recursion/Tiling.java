public class Tiling {

    public static int getPossibleCombination(int n){
        if(n==0||n==1){
            return 1;
        }
        int verticalCombination = getPossibleCombination(n-1);
        int horizontalCombination = getPossibleCombination(n-2);
        return verticalCombination+horizontalCombination;
    }
    public static void main(String[] args) {
        System.out.println(2);
        
    }
}
