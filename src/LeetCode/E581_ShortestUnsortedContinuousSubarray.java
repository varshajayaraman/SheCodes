package LeetCode;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class E581_ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 0;
        }
        if(nums.length == 2){
            if(nums[0] < nums[1]){
                return 0;
            } else{
                return 2;
            }
        }

        int min = 0;
        int max = 0;
        int st = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        int i=1;
        while(i<nums.length){
            if(nums[i] < nums[min]){
                st = Integer.min(st, i);
                min = i;
                end = Integer.max(end, i);
            } else if(nums[i] == nums[min]){
                if(i == min+1){
                    continue;
                } else{
                    end = Integer.max(end, i);
                }
            } else if(nums[i] > nums[min]){
                if(nums[i] < nums[max]){
                    max = i;
                } else if(nums[i] == nums[max]){

                } else if(nums[i] > nums[max]){
                    end = Integer.max(end, i);
                }
            }
        }
        return 1;
    }
}
