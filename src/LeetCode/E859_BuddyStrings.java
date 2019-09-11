package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class E859_BuddyStrings {
    public static boolean buddyStrings(String A, String B) {
        if(A.length() == 0 || B.length() == 0 || A.length() ==1 || B.length() == 1){
            return false;
        }

        Integer mismatch = null;
        int count = 0;
        Set<Character> common = new HashSet<>();
        Boolean safeFlag = false; // Found two interchangeable characters
        for(int i=0;i<Integer.min(A.length(), B.length()); i++){
            if(A.charAt(i) == B.charAt(i)){


                if(safeFlag == false){
                    if(common.contains(A.charAt(i))){
                        safeFlag = true;
                    }
                }
                common.add(A.charAt(i));
            } else{

                if(count == 2){
                    return false;
                }
                count += 1;
                if(count == 1){
                    mismatch = i;
                    continue;
                }
                if((A.charAt(i) == B.charAt(mismatch) && A.charAt(mismatch) == B.charAt(i))){
                //    System.out.println("Setting onceFlag");
                    continue;
                 //   i += 1;
                } else{
                    return false;
                }
            }
        }
        return safeFlag || count==2;
    }
}
