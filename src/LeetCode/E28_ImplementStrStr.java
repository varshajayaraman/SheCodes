package LeetCode;

public class E28_ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null){
            return -1;
        }
        if(haystack.length() == 0 || needle.length() == 0){
            return -1;
        }
        if(needle.equals("")){
            return 0;
        }
        int smallest_index = Integer.MAX_VALUE;
        int index = -1;
        int j = needle.length()-1;
        Boolean found = false;
        Boolean onceFound = false;
        for(int i=haystack.length()-1;i>=0;i--){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j==needle.length()-1) {
                    found = true; //Setting flag if first time
                    index = i;
                    System.out.println(i+" "+haystack.charAt(i)+" "+j);
                }

                if(j == 0){ //has needle been found, instance saved in smallest index
                    if(!onceFound){
                        onceFound = true;
                    }
                    j = needle.length()-1;
                    smallest_index = Integer.min(smallest_index, index);
                    System.out.println("FIrst instance at: "+ smallest_index);
                    i = index; // Checking for immediate previous sequences, going for next iteration
                    found = false;
                    continue;

                } else{
                    System.out.println("reducing");
                    j -= 1;
                }
            } else if(found){ //Half of needle is found
                found = false;
                i = index;
                index = -1;
                j = needle.length()-1;
            }
        }
        if(onceFound){
            return smallest_index-(needle.length()-1);

        }
        return -1;
    }
}
