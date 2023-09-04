import java.util.*;
public class SwitchStatement {
    public static void main (String args [] ) { 
   Scanner sv = new Scanner (System.in);
   System.out.print("Enter  number   A :  ");
   int a = sv.nextInt();
   System.out.print("Enter Number B ");
   int b = sv.nextInt();
   System.out.print("Enter operator ");
   char symbol = sv.next().charAt(0); 
        switch(symbol) { 
        case  '+' :  System.out.println("SUM " + (a+b)) ;
                         break ;
        case '-'  : System.out.println("SUBTRACT "+(a-b)); 
                         break;
        case '*'  : System.out.println("MULTI  "+(a*b));
        break;   
        case '/' : System.out.println("DIVI  "+(a/b));
        break;
        case '%' : System.out.println("Remain "+(a%b));
           break;
           default : System.out.println("Error");

         }
    }
}