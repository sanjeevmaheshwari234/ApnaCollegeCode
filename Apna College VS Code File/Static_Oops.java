public class Static_Oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JNV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        // Student s3 = new Student();
        // s3.schoolName = "ABC";

        Student mark = new Student();
       
        System.out.println( mark.returnPercentage(20,25 , 50));

        // Student s4 = new Student();
        // System.out.println(s4.schoolName);

    }
    
}
 
class Student {
    static int returnPercentage (int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll_no;

    static String schoolName;

    void setName(String name){
        this.name = name ;
    }

    String getNmae(/*Argument not */) {
        return this.name;
    }
}