public class ExeptionsTry_Catch {
    public static void main(String[] args) {
        // int arr [] = {2,3,4,5};
        // System.out.println(arr[6]);
        try{int arr [] = {2,4,9,6};
        System.out.println(arr[6]);
    } catch (Exception k){
        System.out.println("Some Thing Went Wrong....!");
    } finally {
        System.out.println("The 'try catch' is finished.");
    }

    }
    
}
