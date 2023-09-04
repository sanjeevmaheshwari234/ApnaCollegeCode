package apna_college;

public class Oops {
    public static void main(String[] args) {
    /*  System.out.print("1st Atempted :  ");
    	Vehicle obj1 = new Car();
        obj1.print1();

        Vehicle obj2 = new Vehicle();
        obj2.print();                             */
    	
//    	System.out.println(Book.count+" ");
//    	Book s1 = new Book(150);
//    	Book s2 = new Book(150);
//    	System.out.println(Book.count+"  "+Book.price);      
    	
    	
    	Test t= new Test();
    	t.set_mark(98);
    	System.out.println(Test.mark);

        
    }
}
 
/*class Vehicle{
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle {
    void print(){
        System.out.println("Derived class(Car)");
    }
}*/


class Vehicle{
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle {
    void print1(){
        System.out.println("Derived class(Car)");
    }
}


 class Book{
    static int price  ;
	static int count;
	
	public  Book(int how){
		 this.price += how;
		count++;
		System.out.println("count: " +count);
		System.out.println();
	}
	
}
 class Test {
	 static int mark;
	 void set_mark(int value) {
		 this.mark = value;
	 }
 }
