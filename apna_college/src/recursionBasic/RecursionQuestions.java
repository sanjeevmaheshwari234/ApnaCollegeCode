package recursionBasic;

public class RecursionQuestions {
	public static void main(String [] args) {
		int n = 2;
		towerOfHonai( n,"a","b","c");	
	}
	
	public static void towerOfHonai(int n,String a,String b,String c) {
		if(n == 1) {
			System.out.println("transfer"+n+" th disk from "+a+" to "+c);
			return;
		}
		
		towerOfHonai(n-1,a,c,b);
		System.out.println("transfer"+n+" th disk from "+a+" to "+c);
		towerOfHonai(n-1,b,a,c);
	}
	
}
