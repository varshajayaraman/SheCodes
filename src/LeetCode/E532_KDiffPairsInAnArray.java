package LeetCode;

import java.util.*;

public class E532_KDiffPairsInAnArray {
    public static int findPairs(int[] nums, int k) {
        Integer[] arr = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
//        if(k>=0) {
//            Arrays.sort(arr);
//        } else{
//            Arrays.sort(arr, Collections.reverseOrder());
//        }
        Arrays.sort(arr);
        int count = 0;
        Integer same = null;
        for(int i =1; i<nums.length;i++){
            if(Math.abs(arr[i] - arr[i-1]) == k){
                if(k==0) {
                    if (same != arr[i]) {
                        same = arr[i];
                        count += 1;
                    }
                } else{
                    count += 1;
                }
            }
        }
        return count;
    }
}
