import java.util.*;
public  class Ternaryoperator {
    public static void main (String args [] ) {
Scanner sc = new Scanner (System.in);

// Syntax :  Variable  = Conditions?Statement1: Statement2 ;

// int number = sc.nextInt();
//  String type = ((number%2)==0) ? "even" : "odd" ;
//  System.out.println(type);

// Example :
double mark = sc.nextDouble();
String Student = (mark >=33)? "pass" : "fail" ;
System.out.println(Student);

    }
}