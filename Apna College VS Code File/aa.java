import java.util.*;

public class aa {
    public static void main(String[] args) { 
      Scanner sc = new Scanner (System.in);   
        //  int x,y,z;
    //  x = y = z = 2 ;
    //  x += y;
    //  y -= z;
    //  z /= (x + y);
    //  System.out.println(x + " "+y+" "+z+" ");
    
    // double input = sc.nextDouble();
    // if(0<=input){
    //    System.out.println("You Enter Positive Number  :"+input);
    // } else {
    //     System.out.println("You Enter Negative Number  :"+input);
    // }
    // String Tem = (103.5>=input)? "You Don't Have Fever :" : "You  Have Fever :" ;
    // System.out.println(Tem);
    // int day = sc.nextInt();
    // switch(day) {
    //     case 1 : System.out.println("Monday ");
    //     break;
    //     case 2 : System.out.println("Tuseday ");
    //     break;
    //     case 3 : System.out.println("Wednesday "); 
    //     break;
    //     case 4 : System.out.println("thursday ");
    //     break;
    //     case 5 : System.out.println("Friday ");
    //     break;
    //     case 6 : System.out.println("Satuarday ");
    //     break;
    //     case 7 : System.out.println("Sanday ");
    //     break;
    //     default : System.out.println("Oops... Invalid Number ");
    // }
    
         //     Case  3 

    // int year = sc.nextInt() ;
    // String  leap = (year % 4 == 0) ? "Leap Year  " : "Not leap year " ;
    // System.out.println(leap);

    
    // Case  4
      
    int even = 0;
    int odd = 0;
    do {
      System.out.println("Enter number  :  ");
      int n = sc.nextInt();
      
      if(n % 2 == 0 ) {
           even = even + n ;
      } else {
        odd += n ;
      }
         System.out.println(even);
         System.out.println(odd);
    } while(true) ;



    }

}
