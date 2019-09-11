package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E414_ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Integer n = null;
        Integer first = null;
        Integer second = null;
        Integer third = null;
        if(nums.length<3){
            if(nums.length == 1){
                return nums[0];
            } else{
                return Integer.max(nums[0], nums[1]);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(first == null){
                first = nums[i];
            }else if(nums[i] >= first){
                if(nums[i] == first){
                    continue;
                }
                third = second;
                second = first;
                first = nums[i];
            } else if(second == null){
                second = nums[i];
            } else if(nums[i] >= second){
                if(nums[i] == second){
                    continue;
                }
                third = second;
                second = nums[i];
            } else if(third == null) {
                third = nums[i];
            } else if(nums[i] >= third){
                if(nums[i] == third){
                    continue;
                }
                third = nums[i];
            }
        }
        return third == null? first:third;
    }
}
