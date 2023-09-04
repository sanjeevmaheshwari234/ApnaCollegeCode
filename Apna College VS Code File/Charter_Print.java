public class Charter_Print {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        // outer loop 
        for(int i=1;i<=n;i++){
            // iner loop
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
