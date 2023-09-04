package apna_college;
import java.util.*;
public class Two_dayArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int matrix [][] = new int[row] [col];
		
		for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				matrix[i][j] = sc.nextInt();
				
			}
			System.out.println();
		}
		
		int x=sc.nextInt();
		
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(matrix[i][j]==x) {
					System.out.print(i+" "+j);
				}
				 
			}
			System.out.println();
		}

	}

}
