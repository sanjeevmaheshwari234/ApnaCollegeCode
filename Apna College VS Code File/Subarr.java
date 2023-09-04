public class Subarr {
    public static void subPair(int arr[]) {
         int tsarr = 0;
        for(int i=0;i<arr.length;i++) {
            System.out.print((arr[i])+" :- ");
            int start = i;
            for(int j=i;j<arr.length;j++) {
                int end = j;
              for(int k=start;k<=end;k++) {
                System.out.print(arr[k]); //subArray
               }
              System.out.print(" ");
              tsarr++;
            } 
            System.out.println();
        }
        System.out.println("total : " +tsarr);


    }
    public static void prifixSum (int arr1 []) {
        int currntSum  = 0;
        int maxSum = Integer.MIN_VALUE;
        int prfix [] = new int [arr1.length] ;
        prfix [0] = arr1[0] ;
        // Calculate Sum 
        for (int i=1;i<prfix.length;i++) {
            prfix [i] = prfix [i-1] + arr1[i];
        }     

        // calculate prefix array 
        for(int i=1;i<prfix.length;i++) {
            int start = i ;
            for(int j=i;j<prfix.length;j++) {
                int end = j ;
                currntSum = start == 0 ? prfix[end] : prfix[end] - prfix [start - 1] ;
                
                if(maxSum < currntSum) {
                    maxSum = currntSum ;
                }
            } 
        }
        System.out.println("max sum = "+maxSum);

    }
    public static void kadanes(int arr3[] ) {
        int ms = Integer.MIN_VALUE;
        int cs = 0 ;
        for(int i=0;i<arr3.length;i++) {
            cs = cs + arr3[i] ;
            if(cs < 0) {
                cs = 0 ;
            }
            //   cs ya ms mejo bhi bada hoga vo ms me store ho jayega 
            ms = Math.max(cs ,ms);
        }
        System.out.println("our max subarray sum is : " +ms);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        // subPair(arr);
        // int arr1 [] = {1,-2,6,-1,3 } ;
        // prifixSum (arr1) ;
        int arr3[] = { -2,-3,4,-1,-2,1,5,-3};
        kadanes(arr3);
    }
    
}
