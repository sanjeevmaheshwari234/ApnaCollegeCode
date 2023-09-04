package recursionBasic;

public class DividAndConquerQuestions {
	public static void main(String[] args) {
     String arr [] = {"moon","zoom","meet","apple","goot"};
		String[] a = mergeSort(arr, 0, arr.length-1);
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		} 
		
	/*	int nums[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums)); 
		*/
		
	/*	int arr[] = {1, 20, 6, 4,5};
		//System.out.println("inversion Count = "+ getInvCount(arr));
        System.out.println("inversion Count = "+getInversions(arr));  */
	}
	// functions to mergeSort 2 arrays
	public static String[] mergeSort(String []arr, int lo, int hi) {
		if(lo == hi) {
			String [] A = { arr[lo] };
			return A;
		}
		int mid = lo + (hi - lo)/ 2;
		String[] arr1 = mergeSort(arr, lo, mid);
		String[] arr2 = mergeSort(arr, mid+1, hi);
		
		
		String[] arr3 = merge(arr1, arr2);
		//System.out.println("lembae "+arr1.length+" and "+arr2.length);
		return arr3;
		
	}
	
	static String[] merge(String[] arr1, String[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		String[] arr3 = new String[m + n];
		
		int idx = 0;
		
		int i = 0;
		int j = 0;
		
		while(i < m && j < n) {
			if(isAlphabeticallySmaller(arr1[i],arr2[j])) {
				arr3[idx] = arr1[i];
				i++;
				idx++;
			}else {
				arr3[idx] = arr2[j];
				j++;
				idx++;
			}
		}
		while(i < m ) {
			arr3[idx] = arr1[i];
			i++;
			idx++;
		}
		
		while(j < n){
			arr3[idx] = arr2[j];
			j++;
			idx++;
		}
		return arr3;
	}
	 // Return true if str1 appears str2 in apphabetical order
	
	static boolean isAlphabeticallySmaller(String str1, String str2) {
		if(str1.compareTo(str2) < 0) {
			return true;
			
		}
		return false ;
	}
	
	///////////// Bruet foce aproch 1
	
/* 	public static int majorityElement(int [] nums) {
		int majorityCount = nums.length/2;
		
		for(int i=0; i<nums.length; i++) {
			int count = 0;
			for(int j=0; j<nums.length; j++) {
				if(nums[j] == nums[i]) {
					count += 1;
				}
			}
			
			if(count > majorityCount) {
				return nums[i];
			}
		}
		return -1;
	} */ 
	
	// second aproch 2
	private static int countInRange(int[] nums, int num, int lo, int hi) {
		int count = 0;
		for(int i=lo; i<= hi; i++) {
			if(nums[i] == num) {
				count++;
				
			}
		}
		
		return count;
	}     
	  
	
	private static int  majorityElementRec(int[] nums, int lo, int hi) {
		// base case : the only element in an array of size 1 is the majority element
		
		if(lo == hi) {
			return nums[lo];
		}
		
		// recurse on left and right halves of this slice
		int mid = (hi-lo)/2 + lo;
		int left = majorityElementRec(nums, lo, mid);
		int right = majorityElementRec(nums, mid+1, hi);
		
		// if the 2 halves agree on the majority element, return it.
		
		if(left == right) {
			return left;
		}
		
		// otherwise, count each element and return the "winner"	
	
	int leftCount = countInRange(nums, left, lo, hi);
	int rightCount = countInRange(nums, right, lo, hi);
	
	return leftCount > rightCount? left : right;
	
	}
	
	public static int majorityElement(int[] nums) {
		return majorityElementRec(nums, 0, nums.length-1);
	}
	
// Q.3 ka Solutions 
	// Brute force aproch 1
	
/*	public static int getInvCount(int arr[]) {
		int n = arr.length;
		int invCount = 0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					invCount++;
				}
			}
		}
		return invCount;
	}   */
	
	// aproch 2
	
	public static int merge(int arr[], int left, int mid, int right) {
		int i = left, j = mid, k = 0;
		int invCount = 0;
		int temp[] = new int[(right - left +1)];
		
		while((i<mid) && (j <= right)) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}else {
				temp[k] = arr[j];
				invCount += (mid - i);
				k++;
				j++;
			}
		}
		
		while(i < mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		
		while(j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		
		for(i=left, k=0; i<=right; i++, k++) {
			arr[i] = temp[k];
		}
		return invCount;
	}
	
	private static int mergeSort(int arr[], int left, int right) {
		int invCount =0;
		
		if(right > left) {
			int mid = (right+ left)/2;
			
			invCount = mergeSort(arr, left, mid);
			invCount += mergeSort(arr, mid +1, right);
			invCount += merge(arr, left, mid+1, right);
		}
		return invCount;
	}
	
	public static int getInversions(int arr[]) {
		int n = arr.length;
		return mergeSort(arr, 0, n-1);
	}
	
	

	

	
}
