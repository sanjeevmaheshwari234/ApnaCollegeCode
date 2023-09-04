public class SuperKeywordOops {
    public static void main(String[] args) {// Creat object 
        Horse h = new Horse();
                        //  property call
        System.out.println(h.color);

        
    }
    
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constractor is called ");
    }
}

class Horse extends Animal {
    Horse(){
       super.color= "brown";
        // super();
        System.out.println("horse constractor is called ");
    }
}

// Go To Next Code Eclips 
