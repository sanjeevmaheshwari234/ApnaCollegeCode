public class BitbyesOperater {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0 ){
           // Even
           System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static int getIthBit(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;

        } else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        // original number print on this methode 
            return n | bitMask;
        
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i) ;
        return n & bitMask ;
    }
    public static int updateIthBit (int n , int i, int  newBit) {
        // if(newBit == 0 ){
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }
        //////////
        n = clearIthBit(n, i);
        int bitMask = newBit<<i; 
        return n | bitMask ;    
    }
    public static int clearIthBitsLast(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearithAndjthBitsRange(int n , int i ,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a | b ;
        return n & bitmask ;
    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) ==0;
    }
    public static int countsetBits(int n){
        int count = 0 ;
         while (n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
         }
         return count ;
    }
    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n >0){
            if((n & 1) != 0){
                // cheack LSB Bit
               ans = ans *a;  
            }
            a = a * a;
            n = n >>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3,2 ));
        //  System.out.println(countsetBits(10));
        // System.out.println(isPowerOfTwo(8));
        // System.out.println(clearithAndjthBitsRange(10, 2, 4));
        //    System.out.println(clearIthBitsLast(11, 2));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
       // System.out.println(getIthBit(8, 2));
        /*     oddOrEven(3);
        oddOrEven(10);
        oddOrEven(11);
        */
        ///////////////
        
        // System.out.println( 5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~1);
        // System.out.println(5<<2);
        // System.out.println(6>>1);

    }
    
}
