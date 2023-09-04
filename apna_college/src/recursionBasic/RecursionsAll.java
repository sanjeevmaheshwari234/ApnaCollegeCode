 package recursionBasic;

public class RecursionsAll {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 8;
		int [] arr = {2,3,4,5,6,5,9};
		//incre(n);
		//System.out.print(factorial(n)+" ");
//		System.out.println(naturalnum(n));
		//System.out.println( fibnacci(n));
//		System.out.println(isShort(arr,0));
//		System.out.println("index number "+firstOccurence(arr,5,0));
		int arr1[] = {5,5,5,5,5};
//	    System.out.println(lastOccurence(arr1,5,0));
//		System.out.println("Power : "+powerN(2,5));
//		System.out.println(tilingproblem(4)+" : tarikaa se");
		String apna = "appnnacollege";
//		removeDuplicates(apna,0,new StringBuilder(""),new boolean [26]);
		//System.out.println(friendPair(5));
		printBinaryString(3,0,"");
	}
	
	public static void incre(int n) {
		
		if(1 == n) {
			System.out.print(1+" ");
			return;
		}
		// first recursions after print statement 
		incre(n-1);
		System.out.print(n+" ");
		
	}
	
	//    factorial number of N 
	
	public static int factorial(int n) {//O(n) space completxiti O(n)
		// Base ase
		if(n == 0) {
			return 1;
		}
		int fnm1 = factorial(n-1);
		int fn = n * factorial(n-1) ;
		return fn ;
	}
	
	// print Sum of first N natural number
	
	public static int naturalnum(int n) {
		// Base Case
		if(n == 1) {
			return 1;
		}
		
		int Sum_nm1 = naturalnum(n-1);
		int Sum_n = n + Sum_nm1; // F(n) = n + F(n-1)
		return Sum_n ;
	}
	
	// Fibnacchi number 
	public static int fibnacci(int n) {// Sc O(n) , exponetail Tc O(2^n) kyun ki exponet ho gya n
		
		if(n == 0 || n == 1) {
			return n ;
		}
		
		int fibnm1 = fibnacci(n-1);
		int fibnm2 = fibnacci(n-2);
		int fibn = fibnm1 + fibnm2 ;
		return fibn ; 
		
	}
	public static boolean isShort(int [] arr ,int i) {
		// Base case is
		if(i == arr.length-1) {
			
			return true ;
		}
		
		if(arr[i] > arr[i+1]) {
		
			return false ;
		}
		return isShort(arr,i+1);
	}
	
	  // find number 
	public static int firstOccurence(int []arr,int key,int i) {
		if(i == arr.length) {
			return -1;
		} 
		if(arr[i] == key) {
			return i;
		}
		return firstOccurence(arr,key,i+1);
	}
	
	//    WAF to find the last occurence of an element in an array 
	
	public static int lastOccurence(int arr[] , int key, int i) {
		if(i == arr.length) {
			return -1;
		}
		// look forward check index n 
		int isFound = lastOccurence(arr,key,i+1);
		if(isFound == -1 && arr[i] == key) {
			return i;
		}
		
		return isFound;
		
	}
	
	// power of n number 
		public static  int powerN(int base, int n) {
			if(n == 0) {
				return 1 ;
			}
			 // int xnm1 = powerN(base,n-1);
			// int xn = base * xnm1 ;
			// return xn ;
			
			
			return  base *powerN(base,n-1);
			 
		}
		 // OptimizedPower
		
		public static  int optimizedPowerN(int base, int n) {//  Tc O(logN)
			if(n == 0) {// Base Case
				return 1;
			}
			int halfPower =  optimizedPowerN(base,n/2)  ;
			
			int halfpowerSq =   halfPower * halfPower ;
			
			// n is odd 
			if(n % 2 != 0) {
				halfpowerSq = base * halfPower ;
			}
			return halfpowerSq ;
		}
		
		// Tilling problem questions floor
		
		public static int tilingproblem(int n) { // 2 x n (Floor Size)
			//{Given Tile Size 2x1} and (floor,tiles ki size change bhi ho sakta hai according questions) 
			// base 
			if(n == 0 || n == 1) {
				return 1;
			}
			
			// kaam / tarikaa 
			// Vertical choice
			int fnm1 = tilingproblem(n-1);
			
			// Horizontal choice 
			 int fnm2 = tilingproblem(n-2);
			 
			 int totalway = fnm1 + fnm2 ;
			 return totalway;
			 
			
		}
		
		// remove duplicate string
		
		public static void removeDuplicates(String str, int idx , StringBuilder newStr, boolean map []) {
			if(idx == str.length()) {
			
				System.out.println(newStr);
				return ;
			}
			
			//Kaam 
			char currChar = str.charAt(idx);
			if(map[currChar - 'a'] == true ) {
				// duplicate hai yha charter
				removeDuplicates(str, idx+1, newStr, map);
				
			} else {
				map[currChar - 'a'] = true;
				removeDuplicates(str, idx+1, newStr.append(currChar), map);
			}
		}
		
		// friend Pairing Problem 
		public static int friendPair(int n) {
			//Base Case
			if(n == 1 || n == 2) {
				return n;
			}
//			// choice 
//			// single
//			int fnm1 = friendPair(n-1);
//			
//			// pair
//			
//			int fnm2 = friendPair(n-2);
//			int pairWays = (n-1) * fnm2 ;
//			
//			
//			// total ways
//			int totalway = fnm1 + pairWays ;
//			//int totalway = fnm1 + fnm1 * fnm2 ;
//			
//			return totalway ;
			
			return friendPair(n-1) + (n-1) *friendPair(n-2);
			
		}
		// print all binary string of N without Consecutive Ones. (Consecutive ka matlb ek saat nahi) 
		//  01010100110 esme 11 ek sat nhi ana chahiye esliye A galat binaryString hai
		
		public static void printBinaryString(int n, int lastPlace, String str) {
			// base Case 
			if(n == 0) {
				System.out.println(str);
				return ;
			}
			// kaam
			printBinaryString(n-1,0,str+"0");
			if(lastPlace == 0 ) {
				printBinaryString(n-1,1,str+"1");
			}
		}
	
}
