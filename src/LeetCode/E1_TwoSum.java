package LeetCode;

import java.util.HashMap;

public class E1_TwoSum{
    public static void E1_TwoSum(int[] array, int target) {

        System.out.println("In TwoSum");
        int[] resArray = findTarget(array, target);
        if (resArray[0] == -1) {
            System.out.println("No elements are present to add up to the given Target");
        } else {
            System.out.println("The operands are present in the indices: " + resArray[0] + " &" + resArray[1]);

        }
    }


    public static int[] findTarget(int[] array, int target){
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int[] resArray = new int[2];
        for(int i=0; i<array.length;i++){
            int compl = target-array[i];
            System.out.println(compl);
            if (hMap.containsKey(compl)) {
                resArray[0] = i;
                resArray[1] = hMap.get(compl);
                return resArray;
            }
            hMap.put(array[i], i);
            System.out.println("No");
        }
        resArray[0] = -1;
        resArray[1] = -1;
        return resArray;
    }
}