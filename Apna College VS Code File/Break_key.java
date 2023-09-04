import java.util.*;
public class Break_key {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

   /*        do{
           
            System.out.print("enter your name  :");
            int n = s.nextInt();
            if(n %10  == 0 ){
                break ; 
            }
            System.out.println(n);
        }while(true) ; 

        */


//     continue keyword : 
      
   do {
    System.out.print("Enter Your Number : ");
    int n  = s.nextInt();

    if(n % 10 == 0 ){
        continue ;
    }
    System.out.println("Number was  :  "+n);
   }while(true) ;

    }
}
