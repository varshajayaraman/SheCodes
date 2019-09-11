package LeetCode;

public class E38_CountAndSay {
    public static String countAndSay(int n) {
        String ans = "1";
        int j = 2;
        while(j!=n+1){
            ans = findSequence(ans);
            System.out.println("In "+j+"th iteration: "+ans);
            j+=1;
        }
        return ans;
    }

    public static String findSequence(String  num){
        int count = 1;
        int length = num.length();
        int index = length-1;
        String ans = "";
        String curr_rem = Character.toString(num.charAt(index));
        index-=1;
        while(index>=0){

            String  prev_rem = Character.toString(num.charAt(index));
            index -= 1;
            while(curr_rem.equals(prev_rem)){
                count +=1;
                curr_rem = prev_rem;
                if(index>=0) {
                    prev_rem = Character.toString(num.charAt(index));
                } else{
                    prev_rem = null;
                    break;
                }
                index -= 1;
            }

            ans += curr_rem + Integer.toString(count) ;
            count = 1;
            if(prev_rem == null){
                curr_rem = null;
                break;
            }
            curr_rem = prev_rem;

        }
        if(curr_rem != (null)){
            ans += curr_rem + Integer.toString(count) ;
        }
        StringBuilder x = new StringBuilder();
        x.append(ans);
        return x.reverse().toString();
    }
}
