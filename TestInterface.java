//Thia program is created by Aryaan Rabara 21ce112
//Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git
/*Question:Write a program to create a default method in an interface IPrinter. 
Create an interface IPrinter and IScanner. You can assume variables and methodsfor both interfaces.
 Create a concrete class to implement both the interfaces. 
Create 5 objects of the class, store it in Vector and display the result of the vector. */
import java.util.*;

public class TestInterface implements IScanner, IPrinter {

    private int a;
    private int b;
    
    @Override
    public void getdata() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
    }

    @Override
    public int sub() {
        // TODO Auto-generated method stub
        return a-b;
    }

    @Override
    public void putdata() {
        // TODO Auto-generated method stub
        System.out.println("Subtraction of " + a + " and " + b + " is " + sub());
        System.out.println("Addition of " + a + " and " + b + " is " + add(a,b));
    }
}