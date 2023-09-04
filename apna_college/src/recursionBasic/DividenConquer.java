package recursionBasic;

public class DividenConquer {
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
//		int arr [] = {6, 3, 9, 5, -3,2, 8};
//		mergeSort(arr,0, arr.length-1);
		//////////////////////
//		int arr [] = {6,3,9,8,2,5,-5};
//		quickSort(arr,0,arr.length-1);
//		printArr(arr);
		///////////////
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0 ;
		int tarIdx = search(arr,target,0,arr.length-1);
		System.out.println("index no. "+tarIdx);
	}
	
	public static int search(int arr[], int tar, int si, int ei ) {
		// base case
		if(si > ei) {
			return -1;
		}
		// Kaam
		int mid = si+(ei-si)/2;
		// case FOUND 
		if(arr[mid] == tar) {
			return mid;
		}
		
		//mid on L1
		if(arr[si] <= arr[mid]) {
			// case a : left
			if(arr[si] <= tar && tar <= arr[mid]) {
				return search(arr,tar,si,mid-1);
			}else {
				// case : right
				return search(arr,tar,mid+1,ei);
			}
			// mid on L2
		}else {
			// case c : right
			if(arr[mid] <= tar && tar <= arr[ei]) {
				return search(arr,tar,mid+1,ei);
			}else {
				// case d : left
				return search(arr,tar,si,mid-1);
			}
		}
		
	}
	
	public static void quickSort(int arr[],int si, int ei) {
		//Base case 
		if(si >= ei) {
			return ;
		}
		// pivot last index		
		int pIdx = partitions(arr, si, ei);
		quickSort(arr,si,pIdx-1) ; // left part
		quickSort(arr,pIdx+1,ei) ; // right part
		
	}
	
	public static int partitions(int arr[], int si, int ei) {
		 int pivot = arr[ei];
		 int i = si-1;// to make place for els smaller then pivot (i = -1)
		 
		 for(int j=si; j<ei; j++) {
			 if(arr[j] <= pivot) {
				 i++;
				 // Swap
				 int temp = arr[j];
				 arr[j] = arr[i] ;
				 arr[i] = temp ;
			 }
		 }
		 
		 i++;
		 // Swap
		 int temp = pivot; 
		 arr[ei] = arr[i] ;
		 arr[i] = temp ;
		 return i ;
		 
	}
	
	public static void mergeSort(int arr[], int si,int ei) {
		// Base Case 
		if(si >= ei) {
			return;
		}
		
		// Kaam
		int mid = si+(ei-si)/2; // (si+ei)/2
		mergeSort(arr, si, mid); // left part
		mergeSort(arr, mid+1, ei); // right part
		merge(arr, si, mid, ei);
	}
	
	public static void merge(int arr[], int si, int mid, int ei) {
		// leftElement(0,3)=4 rightElement(4,6)=3 -> 6-0+1 = 7length
		int temp[] = new int[ei-si+1];
		int i = si; //iterator for left part
		int j = mid+1; // iterator for right part
		int k = 0; // iterator for temp arr
		
		// Both part
		while(i <= mid && j <= ei) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++; k++;
			} else {
				temp[k] = arr[j];
				j++; k++;
			}
		}
		
		// left part
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		// right part 
		 while(j <= ei) {
			 temp[k++] = arr[j++];
		 }
		 
		 // copy temp to original arr
		 
		 for( k=0, i=si; k<temp.length; k++, i++) {
			 arr[i] = temp[k];
		 }
		
		}
	
}
