import java.util.*;


public class Strings {
    public static void printchar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static Boolean palinDrome(String lat){
        for(int i=0;i<lat.length()/2;i++){
            int n = lat.length();
            if(lat.charAt(i)!=lat.charAt(n-1-i)){
                return false;
            }
        }
        return true ;
    }
    public static float sortestPath (String path){
        int x = 0, y = 0 ;
        for(int i=0;i<path.length();i++){
           char distance = path.charAt(i);
           // South 
            if(distance == 's'){
                  y--;
            }
            // North 
            else if(distance == 'n'){
                   y++;
            }
            //West 
            else  if(distance == 'w'){
                   x--;
            }
            //  East 
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
             return (float)Math.sqrt(x2+y2);
        }
        
        public static String subString(String str ,int si , int ei){
            String sub = "";
            for(int i=si;i<ei;i++){
                // Concatinive
                sub += str.charAt(i);
            }
            return sub ; 
        }
        public static String upperCase(String name){
            StringBuilder sb = new StringBuilder("");
            char ch = Character.toUpperCase(name.charAt(0));
            sb.append(ch);

            for(int i=1; i<name.length(); i++){
                if(name.charAt(i) == ' ' &&  i<name.length()-1){
                    sb.append(name.charAt(i));
                   i++;
                    sb.append(Character.toUpperCase(name.charAt(i)));
                } else {
                    sb.append(name.charAt(i));
                }
            }
            return sb.toString() ;
        }

        public static String compress(String later){//O(n)
            String newStr = "";
            for(int i=0;i<later.length();i++){
                Integer count = 1 ;
                while(i<later.length()-1 && later.charAt(i) == later.charAt(i+1)){
                    count++;
                    i++;
                }
                newStr += later.charAt(i);
                if(count > 1){
                    newStr += count.toString();
                }
            }
            return newStr ;
        }
    
    public static void main(String[] args) {
    //     char arr[] = {'a' , 'b' , 'c' , 'd'};
    //     String str = "efghi" ;
    //     String str2 = new String("jklmn123@#$");
    //    // System.out.println(str2);

            //////////////////////////
    //     // String are IMMUTABLE 
 
    //     Scanner sc = new Scanner(System.in);
    //     String name  ; 
    //            // sc.next A sirf ek single word ko leta hai na space or newline k bad ignore kr deta hai 
    //     name = sc.next();
    //     System.out.println(name);
                 //////////////
    //      //  sc.nextLine A   space or newline ko pure capture kr leta hai
    //     String name2 ; 
    //     name2 = sc.nextLine();
    //     System.out.println(name2);
                  //////////////////////
        //    String fullname = "Tony stark";
        //    System.out.println(fullname+"\nour length  :"+fullname.length());
               /////////////////////
           // Concatenations
        //    String first = "Alon" ;
        //    String last = "Musk" ;
        //    String fulname = first +" "+ last ;  //  this is a concatenations
          // System.out.println(fulname.charAt(5));
        //   printchar(fulname);
               ////////////////
        // String name = "bdkhcgydc";
        // System.out.println(palinDrome(name));
             /////////////
        // String path = "wneenesennn";
        // System.out.println(sortestPath(path));
          ///////////////
         /*   String s1 = "tony" ,s2 = "tony" ;
          String s3 = new String("tony");
          if(s1==s3){
            System.out.println("equal");
          }else{
            System.out.println("not equal");
          }


          if(s1.equals (s3)){
            System.out.println("equal");
          }else{
            System.out.println("not equal");
          } */
          //////////////////
        //   String str = "helloWorld";
        //    System.out.println(subString(str,0,5));
        // System.out.println(subString(str, 4, 6));

                   ///////////////////////
      /*   String fruit [] ={"aple","mango","banana"} ;
                                   //   O(x*n) time comp
        String largest = fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest = fruit[i];
            }
        }
        System.out.println(largest);

        */
                 //////////////////
        
                //  StringBuilder sn = new StringBuilder("");
                //  for(char i='a';i<='z';i++){
                //     // time complixity O(26)
                //     // O(26*n^2) of give string
                //   sn.append(i);
                //  }
                //  System.out.println(sn+" ");
                //  System.out.println(sn.length());  
                
                ///////////////////////////////

                //  String name = "hey, i am good boy " ;
                //  System.out.println(upperCase(name));
                   
                 /////////////
                 
                 String later = "aaabccccddf";
                 System.out.println(compress(later));





    }
    
}
