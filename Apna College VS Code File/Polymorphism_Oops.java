public class Polymorphism_Oops {
    public static void main(String[] args) {
        Deer food = new Deer();
        food.eatf();
        
        
        
        //Craet Object 
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2,8));
        // System.out.println(calc.sum((float)4.6,(float)6.4));
        // System.out.println(calc.sum(4,6,8));
    }
}
class Animal {
    void eatf(){
        System.out.println("eat anything");
    }
}
class Deer extends Animal {
    void eatf () {
        System.out.println("eat grass");
    }
}

class Calculator{ // Compile Time Polymorphism And Method Overloading
     // Constructor 
    int sum(int a,int b){
        return a + b;
    }
    float sum(float a, float b){
        return a+ b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
