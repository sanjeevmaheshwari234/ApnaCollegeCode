import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class ArrRough {
    public static Boolean cheack(int [] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int start = i+1;
            for(int j=start;j<n;j++) {
                if(arr[i] == arr[j]) {
                    return true ;
                    
                } 

            }
        }
        return false ;
    }
    public static int cheackNum(int arr1[] ,int o) {
        int n = arr1.length;
        for(int i=0;i<n;i++){
           if(arr1[i] ==o) {
            return i;
            
           }
        }
        return -1;
    }
    public static int stockPrice (int arr2[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0;i<arr2.length;i++) {
            if(buyprice<arr2[i]){
                int profit = arr2[i] - buyprice ;
                maxprofit = Math.max(maxprofit,profit);
                
            } else {
                buyprice = arr2[i] ;
            }  
        }
               return maxprofit ;
    }
    public static int rain (int hight []) {
        int n = hight.length;
        int leftMax[] = new int [hight.length] ;
        leftMax[0] = hight[0];
        for(int i=1;i<n;i++){
            // compare current hight to previous hight se
           leftMax[i] = Math.max(leftMax[i-1],hight[i]);
        }
        int rightMax[] = new int[hight.length];
        rightMax[n-1] = hight[n-1];
        for(int i=n-2;i>=0;i--){
            // compare current hight to 'next  / forward /Aagaiwali ' hight  se 
            rightMax[i] = Math.max(hight[i],rightMax[i+1]);
        }
        int watertrap = 0;
        for(int i=0;i<n;i++){
            // waterlevel = min(left boundary , right boundary)
           int watertlevel = Math.min(leftMax[i],rightMax[i]) ; 
           // watertrap = waterleve - hight[i]
           watertrap += (watertlevel - hight[i] )* 1;    
        }
        return watertrap ;
    } 
    public static void main(String[] args) {
        // int hight [] = {2,1,4,0,6,0,8};
        // System.out.println(cheack(arr));
        // System.out.println(cheackNum(arr,8));
       // System.out.println(stockPrice(arr));
    //    System.out.println("Total area TrapWatre : "+ rain(hight));
       
    }
    
}
