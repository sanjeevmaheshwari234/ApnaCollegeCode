import java.util.*;
public class BinarySearching {
    public static int  arryCC (int [] n ,int key) {
       int start = 0 ,end = n.length-1;
       
       while(start <= end ) {
        int mid = (start+end)/2;
        // coomparisons
        if(n[mid] == key){
            return mid ;
        }
        if(n[mid]<key) {
            // right 
            start = mid + 1;
        }else {
            // left 
            end = mid-1 ;
        }
       }
       return -1;
     }
      public static void revOrder (int lop []) {
        int last = lop.length-1 ;
        int first =0;

        while(first<last) {
            int temp = lop[last] ;
            lop[last] = lop[first] ;
            lop[first] = temp ;
            first++;
            last --;


        }
        
        
      //  return n;
      } 
      public static void printArr (int row[]) {
        for(int i=0;i<row.length;i++){
            System.out.print(row[i]+", ");

        }
      }
      public static void main(String[] args) {
            // Scanner s = new Scanner(System.in) ;
            // System.out.print("Array length  :  ");
            // int n = s.nextInt();
            // int arr [] = new int [n] ;
            // for(int i=0;i<arr.length;i++){
            //    System.out.print("index "+i+ " th potions is : ") ;
            //     arr[i] = s.nextInt();

            // }

            // System.out.print("key : ");
            // int key = s.nextInt() ;
            // System.out.println( arryCC (arr,key));

            int lop[] = {1,2,3,4,5,6}; 
            revOrder(lop);
           printArr(lop);
    
        // for(int i=0;i<lop.length;i++){
        //     System.out.print(lop[i]+", ");

        // }

        }
    
}
