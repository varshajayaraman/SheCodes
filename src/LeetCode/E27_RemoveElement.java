package LeetCode;

import java.util.Arrays;

public class E27_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int l = 0;
        int lastNot = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[lastNot] = nums[i];
                lastNot += 1;
                l += 1;
            }
        }
        if(lastNot==0){
            nums = null;
        } else {
            nums = Arrays.copyOfRange(nums, 0, lastNot - 1);
        }
        return l;
    }
}
