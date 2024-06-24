public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int min = findMinV1(nums);
       // int min = findMin(nums);
        if(target >= nums[min] && target <= nums[nums.length-1]){
            return binarySearch(nums, min, nums.length-1, target);
        }else{
            return binarySearch(nums, 0, min, target);
        }
    
    }

    public static int binarySearch(int[] nums ,int left,int right , int target){
        int low=left;
        int high=right;
        int mid=-1;
        while(low<=high){
             mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                index=i;
            }
        }
        return index;
    }

    // {4,5,6,7,0,1,2}
    //{5,6,7,0,1,2,4}
    //{6,7,0,1,2,4,5}
    public static int findMinV1(int[] nums){
        int low = 0; 
        int high=nums.length -1;
        int mid=-1;
        while(low<=high){
            mid = (low+high)/2;
            if(mid>0 && nums[mid-1]>nums[mid]){
                return mid;
            }
           else if(nums[low] <= nums[mid] && nums[mid]>nums[high] ){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return mid;
    }
    public static void main(String[] args) {
        //int []nums = {4,5,6,7,0,1,2};
        int []nums= {5,6,7,0,1,2,4};
        //{6,7,0,1,2,4,5}
        //System.out.println(findMin(nums));
        System.out.println(search(nums,1));
        System.out.println(searchKeyInRotatedSortedArray(nums, 1));
    }

    public static int searchKeyInRotatedSortedArray(int []arr, int key){
        int min = 0;
        int max = arr.length -1;
        int mid = -1;
        while (min<=max){
            mid = (min+max)/2;
            if(key ==arr[mid]){
                return mid;
            }
            if (arr[min]<arr[mid]){
                if(key > arr[min] && key < arr[mid]){
                    max = mid -1;
                }else{
                    min = mid + 1;  
                }
            }else {
                if(key > arr[mid] && key < arr[max]){
                    min = mid+1;
                }else{
                    max = mid-1;
                }
            }
        }
        return -1;
    }
}

/*
 * Easiest Solution 
 * 
 * 1. find minimum elements index
 * 2. check if (target >= nums[min] && target <= nums[nums.length-1]) 
 * because from minimum to right side all in sorted state
 * then -> binarySearch(nums, min, nums.length-1, target);
 * 3. if not -> binarySearch(nums, 0, min, target);
 */