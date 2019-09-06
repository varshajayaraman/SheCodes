package LeetCode;

public class E7_ReverseInteger {
    public static int reverse(int x){
        if(x!=0 && x>-10 && x<10){
            return x;
        }
        int num=x;
        int base = 0;
        while(x!=0){
        //    System.out.println("ENtering loop base: "+base);
            int rem = x%10;

            if(num>=0) {
                if((base*10 < Integer.MAX_VALUE)&& ((base*10)/10 == base)){
                  //  System.out.println(Integer.MAX_VALUE+ "Greater than "+base*10);
                  //  System.out.println("Printing max: "+Integer.max(Integer.MAX_VALUE, (base*10)));
                    base = base * 10;
                  //  System.out.println("Old"+base/10+" New: "+base);
                }else {
                  //  System.out.println("here");
                    return 0;
                }
                if (Integer.MAX_VALUE - base < rem){
                    return 0;
                }else{
                  //  System.out.println("Adding"+rem);
                    base = base + rem;
                 //   System.out.println(base);
                }
            }else{
                if((base*10 > Integer.MIN_VALUE) && ((base*10)/10 == base)){
                    base*=10;
                }else{
                    return 0;
                }
                if (Integer.MIN_VALUE - base > rem){
                    System.out.println("here");
                    return 0;
                }else{
                    base = base + rem;
                }
            }
            x = x/10;
        //    System.out.println("x: "+x);
        //    System.out.println("Leaving loop: "+base);
        }
        return base;
    }
}
