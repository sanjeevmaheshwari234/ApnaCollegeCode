public class Arraypair {
    public static void printPair (int arr []) {
          int total_pair = 0 ;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i] ;
            for(int j=i+1;j<arr.length;j++) {
                System.out.print(" ("+curr +"," + arr[j]+")"+"   ");
                total_pair ++;
            }
            System.out.println();
        }
        System.out.println("total pair : "+total_pair);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        printPair(arr);
    }
    
}
