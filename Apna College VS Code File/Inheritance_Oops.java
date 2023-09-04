public class Inheritance_Oops {
    public static void main(String[] args) {
      
      
      
        // Fish sharFish = new Fish();
        // sharFish.swim();
    
    //    Dog dobby = new Dog();
    //    dobby.eats();
    //    dobby.legs = 4;
    //    System.out.println(dobby.legs);


        // Fish shark = new Fish();
        // shark.eats();

    }
    
}
// single level
// parent / Base / Super class 
class Animal {
    String color;
    void eat(){
        System.out.println("Eats ");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

// Drived class / subclass / child class 
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("swim in water");
//     }
// }
           ///////////
  /// multi level

//   class Mammal extends Animal {
//     int legs;
//   }
//   class Dog extends Mammal {
//     String breed;
//   }

    ///////////  
    
    // Hierarchial inheritance   
    class Mammal extends Animal {
       void walk() {
        System.out.println("Walk");
       }
      }
      class Fish extends Animal {
        void swim(){
            System.out.println("Swimming");
        }
      }

      class Bird extends Animal {
        void fly(){
            System.out.println("Flying");
        }
      }
      
     
      
     


