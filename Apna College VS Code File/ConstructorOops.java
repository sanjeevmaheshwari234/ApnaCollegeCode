// public class Constructor {
//     public static void main(String[] args) {
//         Student s1 = new Student();                                 /*    kon sa constructor kis k liye call hoga                                             
//         // System.out.println(s1.name);                                   es process ko constructor overloading ya                                         
//         Student s2 = new Student("tonny Strak");                           polymorphisam kehte hai or esme peramitar k                                            
//         Student s3 = new Student(12345);                                    hisab se call hota hai                 */                          
//         // wrong constructor this type                                                                            
//         // Student s4 = new Student("hello",123);                                                                       
//     }
// }
    
//     class Student {
//         // properties name and roll number 
//         String name;
//         int roll;
//          // Type of constructor below  
//          //   creat a constructor Student  
//         Student(){
//         //   this.name = name ;
//         System.out.println("constructor is called...");
//         }
//         Student(String name){
//          this.name = name;
//         }
//         Student(int roll){
//             this.roll = roll;
//         }
    // }

     ///////   Creat  Copy Constructor lecture
    public class ConstructorOops{
        public static void main(String[] args) { // Creat object 1
            Student s1 = new Student();
            s1.name = "Tony Stark";
            s1.roll =  1234;
            s1.password = "abcd";
            s1.mark [0] = 100;
            s1.mark [1] = 90;
            s1.mark [2] =  80;

            // new  Object 2
            Student s2 = new Student(s1);  //Copy  constructor: s1 to => s2
                      // Creat new password ;
            s2.password = "hey";
            s1.mark[1] = 100;
            for(int i=0;i<3;i++){
                // shallow copy
                System.out.println(s2.mark[i]);
                // deep copy below
               // System.out.println(s2.mark[i]);
            }
           
        }
    }
    

     class Student{
        String name;
        int roll;
        int mark[] ;
        String password;

        // // Shallow creat Copy constructor 
               // khud ka hy object as a argument 
        Student(Student s1){
            mark = new int [3]; 
            this.name = s1.name;
            this.roll = s1.roll;
            this.mark = s1.mark;
        }

        // Deep Copy Constructor

        //    Student(Student s1){
        //     mark = new int [3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //       //  copy maarks below
        //     for(int i=0;i<mark.length;i++){
        //         this.mark[i] = s1.mark[i];  
        //     }
        //    }
        
        Student(){
            System.out.println("constructor is called...");
               mark = new int [3];   
        }
       Student(String name){
           // ensurty of 3 subject each constructor
           mark = new int [3];
            this.name = name;
        
        }
        Student(int roll){
           mark = new int [3];
            this.roll = roll;
        }

    }

