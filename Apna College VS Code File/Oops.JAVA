// public class Oops {
//     public static void main(String[] args) {
//         Pen p1 = new Pen(); // creat a pen object called p1
//         p1.setColor("yellow");
//         System.out.println(p1.color);
//         p1.setTip = (6) ;
//         System.out.println(p1.tip);
//         // p1.setColor("Black");
//         // p1.color = "blue";
//         // System.out.println(p1.color);

//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "tome";
//         myAcc.setPassword ("jarry"); 

//     }
// }
// class BankAccount {
//     public  username;
//     private  String password;
//     public void setPassword(String pwd) {
//     password = pwd ;
//     }
// }

// class Pen {
//     // properties
//     String color;
//     int tip ;

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip){
//         tip = newTip;
//     }
// }

// class Studend {
//     // properties 
//     String name;
//     int mark;
//     float percentage; // cgpa
    
//     // funcations 
//     void calCulate(int phy, int math, int chem){
//         percentage = ( phy + math + chem ) /3 ;
//     }
// }



public class Oops {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();  

        
    }
}
 
class Vehicle{
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle {
    void print1 (){
        System.out.println("Derived class(Car)");
    }
}