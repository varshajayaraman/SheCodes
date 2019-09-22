package LeetCode;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDup(int[] arr){
        if(arr.length ==0){
            return 0;
        }
        if(arr.length == 1){
            return 1;
        }

        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[j++] = arr[i];
            }
        }
        return j;
    }
}
