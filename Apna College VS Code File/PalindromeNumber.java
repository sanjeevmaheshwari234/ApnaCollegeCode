public class PalindromeNumber {
    public static int revers (int n) {
        int ans= 0;
        int powr = (int) (Math.log10(n)); // integer ki length nikaalai k liye  
        // int remdr = 0;
        while(n>0) {
           int  remdr = n%10;
            ans =  ans+remdr*(int)Math.pow(10,powr) ;
            n = n/10 ; 
            powr -- ;
        }
            if(ans == n ) {  return ans ;
               // System.out.println("It's no equal   :  ");
            } else {
                System.out.println("not equal   :  ");
            }
             return 0 ;
    }


    public static void main(String[] args) {
        System.out.println(revers(121));
    }
}
