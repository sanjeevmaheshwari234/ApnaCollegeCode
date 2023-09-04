package oopsPractisQuestions;

//public class Questions {
//	public static void main(String[] args) {
//		Vehicle obj1 = new Car();
//		obj1.print();
//		
//		//obj2.print();
//	}
//}
//	class Vehicle{
//	    void print() {
//	        System.out.println("Superclass / Base class(Vehicle)");
//	    }
//	}
//	class Car extends Vehicle {
//	    void print1(){
//	        System.out.println("Derived class(Car)");
//	    }
//	}


 //     Questions 2
    
//public class Questions{
//	public static void main(String[] args) {
//		final Car nw = new Electric();
//		System.out.println(nw.Drive());
//		
//	}
//}
//
// class Automobile {
//	private String Drive() {
//		return "Derive vehicle";
//		
//	}
//}
// 
// class Car extends Automobile {
//	 protected String Drive() {
//		 return "Drive car";
//	 }
// }
// 
// class Electric extends Car {
//	 public final String Drive() {
//		 return "electric car";
//	 }
// }


//Questions 3

/* public class Questions {
	public static void main(String[] args) {
		new BlueCar();
	
	}
	
	
}

abstract class Car {
	static {
		System.out.print("1 ");
	}
	
	public  Car(String name) {
		super();
		System.out.print("2 ");
	}
	
	{
		System.out.print("3 ");
	}
}

 class BlueCar extends Car {
	{
		
		System.out.print("4 ");
	}
	
	public BlueCar() {
		super("blue");
		System.out.print("5 ");
	}
}    */

//Questions 4

//import java.util.*;

 public class Questions {
	public static void main(String[] args) {
		Complex c= new Complex(4,5);
		
		Complex d  = new Complex(9,4);
		
		
		Complex e = Complex.add(c, d);
		Complex f = Complex.diff(d, e);
		Complex g = Complex.product(e, f);
		
		e.printComplex();
		f.printComplex();
		g.printComplex();
	}
}

class Complex{
	int real;
	int image;
	
	// creat constructor 
	public Complex(int r,int i) {
		real = r;
		image = i;
	}
	
	public static Complex add(Complex a, Complex b ) {
		return new Complex ((a.real+b.real),(a.image+b.image));
	}
	
	public static Complex diff(Complex a, Complex b) {
		return new Complex((a.real-b.real),(a.image-b.image));
	}
	
	public static Complex product(Complex a, Complex b) {
		return new Complex (((a.real*b.real) - (a.image*b.image)) , ((a.real*b.real) + (a.image*b.real)));
	}
	
	public void printComplex() {
		if(real == 0 && image != 0) {
			System.out.println(real);
		} else {
			System.out.println(real +" + "+ image+" i ");
		}
	}
}





