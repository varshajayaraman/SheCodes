package LeetCode;

public class E665_NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        int l = nums.length;
        if(l==1){
            return true;
        }
        int dipIndex = -1;
        for(int i=1;i<l;i++){
            if(nums[i]<nums[i-1]){
                if(dipIndex != -1){
                    return false;
                }
                dipIndex = i;
                if(i==l-1){
                    return true;
                }
                if(nums[i+1]>=nums[i-1]){
                    continue;
                } else{
                    if(nums[i+1] >= nums[i]){
                        if(i>1){
                            if(nums[i-2] <= nums[i]){
                                continue;
                            } else{
                                return false;
                            }
                        } else{
                            continue;
                        }
                    } else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
