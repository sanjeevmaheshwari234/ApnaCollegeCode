import java.util.*;
public class Reverse_Number {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("enter number : "); 
       int n = s.nextInt();
        int i = 0;
        while(i<n){   
        int r = n%10;
         n /= 10;
         System.out.print(r);
         
        }
       
         System.out.println();
        System.out.print("Enter 5 Digit Reverse Number  :");
        int f = s.nextInt();
        int r = 0 ;
        while(f>0){
          int  w = f%10;
            f /= 10;
            r =  ((r*10)+w) ;
        }
        System.out.print("oreginal  "+r);
    }
}
