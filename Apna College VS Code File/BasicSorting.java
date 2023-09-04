public class BasicSorting {
    public static void print (int arr[]) {
     for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
     }
    }
    public static void bubble (int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]) {
                    // Swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ; 
                }
            }
        }
        
    }

    public static void selectionSort (int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
               // abhi aacending order me print hoga 
               // yadi decending order me print karana hoga to '<' operater ko change krna hoga
                if(arr[minPos] > arr[j]){
                    minPos = j ;
                }
            }
            // swap  
            int temp=arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp ;
        }
    }
    public static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i] ;
            int prev = i-1;
            //  finding out the correct postions to insert
                              //  below side '<' operater change an decending oreder print
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //  insertions
            arr[prev+1] = curr ;
        }
    }
    public static int compare (int a,int b){
        // a< b -ve
        // a == b 0
        // a > b +ve
        return a-b ;
    }

    public static void countingSort (int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        int count [] = new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sort
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,5,4,1,3,2} ;
        //bubble(arr);
        //selectionSort(arr) ;
        // insertionSort(arr);
        int arr1[] = {1,4,1,3,2,4,3,7};
        countingSort(arr1);
        print(arr1);
        

    }
}