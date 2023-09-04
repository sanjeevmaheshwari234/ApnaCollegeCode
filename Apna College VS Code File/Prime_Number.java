import java.util.* ;
public class Prime_Number {
    public static boolean checkPrime(int n) {
        if(n == 2) {
            return true ;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n % i == 0 ) {
                return false ;
            }

        }
        return true ;
    }
    public static void primeInRange (int n) {
        for(int i=2;i<=n;i++) {
            if(checkPrime(i) ) {
                System.out.print(i + " ") ;
            }

        }
        System.out.println();
    }
    public static void isPrime(int n) {
        boolean prime = true ;
        
        if( n == 2) {
            System.out.println("n is prime  :  "+n);
        } else {
            for(int i =2;i<= Math.sqrt(n);i++){
                if(n% i  == 0){
                    // n is a multiple of i (i not equal 1 or n)
                    prime = false ;
                }
            }
    
            if(prime == true){
                System.out.println("is prime :  "+n);
            } else {
                System.out.println("is not prime :   " +n);
            }
        }

      //  return prime ;


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();
        primeInRange(n);

        
       
          
         



    }
}
