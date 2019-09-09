package LeetCode;

public class E14_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        int n = strs.length;

        for(int i=0;i<strs[0].length();i++){
            //i refers to length of first item. Will stop when ith ele isnt present in jth string
            for(int j=0;j<n-1;j++){
                //j is n -> No of strings
                if(strs[j].length() >i && strs[j+1].length()>i) {
                    //making sure every item is atleast of length n
                    if (strs[j].charAt(i) != strs[j+1].charAt(i)){
                        return res;
                    }
                } else{
                    return res;
                }
            } //Marks that all items have i characters common
            res += strs[0].charAt(i);
        }
        return res;
    }
}
