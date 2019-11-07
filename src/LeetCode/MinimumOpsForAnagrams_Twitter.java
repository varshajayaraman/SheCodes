package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumOpsForAnagrams_Twitter {

    public static void wrapper(List<String> a, List<String> b){
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            alist.add(ops(a.get(i), b.get(i)));
        }

        for(int i=0;i<alist.size();i++){
            System.out.println(alist.get(i));
        }
    }

    public static int ops(String st1, String st2){
        if(st1.length() != st2.length()){
            return -1;
        }
        int count=0;
        HashMap<Character, Integer> hm = new HashMap();
        for(int i=0;i<st1.length();i++){
            if(hm.containsKey(st1.charAt(i))){
                hm.put(st1.charAt(i), hm.get(st1.charAt(i))+1);
            }else{
                hm.put(st1.charAt(i), 1);
            }
        }
        for(int i=0;i<st2.length();i++){
            if(hm.containsKey(st2.charAt(i))){
                hm.put(st2.charAt(i), hm.get(st2.charAt(i))-1);
            }
        }

        for(Map.Entry e :hm.entrySet()){
            if((int)(e.getValue())!=0){
                count += (int)e.getValue();
            }
        }
        return count;
    }
}
