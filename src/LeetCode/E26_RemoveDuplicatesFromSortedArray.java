package LeetCode;

import java.util.Arrays;

public class E26_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int lastNew = 0;
        int l = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                l+=1;
                nums[lastNew+1] = nums[i];
                lastNew += 1;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, lastNew);
        return l;
    }
}
