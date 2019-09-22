package LeetCode;

import com.sun.deploy.util.StringUtils;

public class E686_RepeatedStringMatch {
    public static int repeatedStringMatch(String A, String B) {
        Boolean toppled = false;
        if((A.isEmpty() && B.isEmpty()) || A.equals(B) ) {
            return 1;
        }
        if(A.length()>1 && B.length()>1) {
            if (A.charAt(A.length() - 1) == B.charAt(0)) {
                A = A.substring(0, A.length() - 1);
                B = B.substring(1, B.length() - 1);
                toppled = true;
            }
        }


        if(A.contains(B)){
            if(!toppled){
                return 1;
            } else{
                return 2;
            }
        }

        StringBuffer outputBuffer = new StringBuffer(A.length());
        for (int i = 0; i < A.length(); i++){
            outputBuffer.append(" ");
        }
        if((A.isEmpty() && !B.isEmpty()) || (!A.isEmpty() && B.isEmpty())){
            return -1;
        }


        Boolean first;
        first = false;
        int fIndex, eIndex;
        fIndex = 0;
        eIndex  = 0;
        int count = 0;
        while(B.contains(A)){
            if(!first){
                fIndex = B.indexOf(A, 0);
                first = true;
            }

            B = B.replaceFirst(A, outputBuffer.toString());
            //B = B.replace(A, outputBuffer);
            System.out.println(B);
            count += 1;
        }

        System.out.println(count);
        eIndex = fIndex + count*A.length();
        fIndex = fIndex-1;
        count += 2;
        System.out.println(B+" "+fIndex+" "+eIndex);

        if(eIndex == B.length()){
            count -= 1;
        }
        if(fIndex == -1){
            count -= 1;
        }
        //int j = eIndex;
        int m=0;
        while((fIndex-m)>=0 && (eIndex+m)<B.length() ){
            System.out.println("Here"+B.length()+" "+(A.length()-m));
            if(B.charAt(fIndex-m) != A.charAt(A.length()-1-m)){
                System.out.println("Passed f");
                return -1;
            } else if(B.charAt(eIndex+m) != A.charAt(m)){
                System.out.println("Passed e");
                return -1;
            }
            m++;
        }
        return count;
    }
}
