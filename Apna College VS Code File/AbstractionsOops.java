
public class AbstractionsOops {
    public static void main (String [] args){ // creat object
      // Animal -> Horse  ->  Mustang
        Mustang hor = new Mustang();

      
      
      
      
      
      
        // Horse h = new Horse();
        // // call for Horse 
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // // call for Chicken
        // c.eat();
        // c.walk();

        // System.out.println(h.color);
       
    }
}
abstract class Animal {
    // creat constructor 
    String color ;
     Animal (){
        System.out.println("Animal call constractor ");
        //  color = "brown";
    }
        // creat non-abstratct method
      void eat(){
        // creat implementetions 
        System.out.println("eat foood animals ");
     }
      //  creat abstract method
     abstract void walk(); 
     // this method give Idea  
     // not creat implementetions 
}
//  creat sub-class method
// this are implemetetions 
class Horse extends Animal {
  Horse () {
    System.out.println("Horse constractor called ");
  }
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
 class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constractor called ");
    }
 }

// creat sub-class method
class Chicken extends Animal {
   
    void changecolor(){
        color = "yellow";
    }
    void walk() {
        System.out.println("walk on 2 legs");
    }
} 



