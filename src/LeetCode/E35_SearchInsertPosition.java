package LeetCode;

public class E35_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int high = nums.length-1;
        int low = 0;
        int ans;
        int mid = low + (high-low)/2;
        ans = bsearch(nums, nums.length-1, 0, target);
        return ans;
    }

    public static int bsearch(int[] nums, int high, int low, int target){
        int mid = low + (high-low)/2;
        if(nums[mid] == target) {
            return mid;
        } else if(nums.length == 1){
            if(nums[0] < target){

                return 1;
            } else{
                return 0;
            }
        } else{
            if (mid == 0) {
                if (nums[mid] > target) {
                    return mid;
                } else if (nums[mid] < target && nums[mid + 1] > target) {
                    return mid + 1;
                } else {
                    return bsearch(nums, high, mid + 1, target);
                }
            } else if (mid == nums.length-1) {
                if (nums[mid] < target) {
                    return mid + 1;
                } else if (nums[mid] > target && nums[mid - 1] < target) {
                    return mid;
                } else {
                    return bsearch(nums, mid - 1, low, target);
                }
            } else {
                if (nums[mid - 1] < target && nums[mid] > target) {
                    return mid;
                } else if (nums[mid] < target && nums[mid + 1] > target) {
                    return mid + 1;
                } else {
                    if (nums[mid] < target) {
                        return bsearch(nums, high, mid + 1, target);
                    } else {
                        return bsearch(nums, mid - 1, low, target);
                    }
                }
            }


            //return mid;
        }
    }
}
