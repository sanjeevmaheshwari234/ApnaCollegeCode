public class TrappingRainWater {
    public static int trapWater (int height[] ) {  // Time complexcity :- O(n)   
        int n = height.length;
    // calculate lef max boundary  - array
    int leftMax[] = new int [n];
    leftMax[0] = height[0];
    for(int i=1; i<n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i-1] ) ;
    }
    // calculate Right max boundary - array 
    int rightMax[] = new int [n];
    rightMax[n-1] = height[n-1];
    for(int i=n-2; i>=0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }


     int trappedWater = 0;
    // loop 
    for(int i=0; i<n; i++) {
        // WaterLevel = min(leftmax bound, rightmax bound )
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        // trapped water = waterLevel - height[i] 
        trappedWater += waterLevel - height[i];
    }



    return trappedWater;



}




    public static void main(String[] args) {
        int hight [] = {4,2,0,6,3,2,5};
        System.out.println("Water Area ocupai : "+trapWater(hight));

    }
    
    

    
}
