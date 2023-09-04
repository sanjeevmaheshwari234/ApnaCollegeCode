import java.util.*;
public class Pattern {
    public static void holloRectangle (int n) {
         for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
         }
    }

    public static int batterFle (int n) {
       // first half 
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                
                    System.out.print('*');
                } 
                   // space 
                   for(int j=1;j<=2*(n-i);j++) {
                    System.out.print(' ');
                   }

                   // star 
                   for(int j=1;j<=i;j++) {
                    System.out.print('*');
                   }
                   System.out.println();
                }


                //  2nd half 

                for(int i=n;i>=1;i--) {
                    for(int j=1;j<=i;j++) {
                        
                            System.out.print('*');
                        } 
                           // space 
                           for(int j=1;j<=2*(n-i);j++) {
                            System.out.print(' ');
                           }
        
                           // star 
                           for(int j=1;j<=i;j++) {
                            System.out.print('*');
                           }
                           System.out.println();
                        }
            
                return 0 ;
        }
        
    public static int solidRombus (int n) {
       
        for(int i=1;i<=n;i++) {
             // space 
             for(int j=1;j<=n-i;j++) {
                System.out.print(' ');
             }
             // star 
             for(int k=1;k<=n;k++) {
                System.out.print('*');
             }
            System.out.println();
        }


        return 0 ;

    }
    public static int holloRombus (int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(' ');
            }
            for(int k=1;k<=n;k++) {
                if(i == 1 || i == n || k == 1 || k == n){
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
         }
         
        return 0;
}
public static int dimond (int n) {
   // Half dimond
    for(int i=1;i<=n;i++) {
        // space 
        for(int j=1;j<=n-i;j++){
            System.out.print(' ');
        }
        // star               :- odd number 2 formua (2*(x)+1) , (2*(x)-1)
        for(int h=1;h<=(2*(i)-1);h++) {
            System.out.print('*');
        }
            System.out.println();
        }

        // inver half <>
        for(int i=n;i>=1;i--) {
            // space 
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            // star               :- odd number 2 formua (2*(x)+1) , (2*(x)-1)
            for(int h=1;h<=(2*(i)-1);h++) {
                System.out.print('*');
            }
                System.out.println();
            }
    return 0;
}

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       dimond (n) ;
       // holloRombus(n);
    }
    
}
