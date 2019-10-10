package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Sample_2 {
    static List<Integer> oddNumbers(int l, int r) {

        List<Integer> li = new ArrayList<>() ;
        while(l<=r){
            if(l%2!=0){
                li.add(l);
            }
            l++;
        }
        return li;
    }


}
