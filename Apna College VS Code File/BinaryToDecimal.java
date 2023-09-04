public class BinaryToDecimal {


    public static int number(int n ) {
        int power = 0;
        int decimal = 0 ;
         
        while (n > 0) {
            int last_n = n % 10 ;
             decimal = decimal+(last_n * (int)Math.pow(2,power)) ;
             power ++ ;

             n = n/ 10 ;
        }
        return decimal ;
    }

    public static int deciToBinary (int n) {
       
        int powr = 0 ;
        int binr = 0 ;
        while (n>0){
            int  remainder = n % 2 ;
            binr +=  remainder * (int)Math.pow(10,powr) ;
            n = n / 2  ;
            powr ++ ;
        }
        return binr ;
    }



    public static void main(String[] args) {
      //  System.out.println(number(1011));
      System.out.println(deciToBinary (5));
    }
}
