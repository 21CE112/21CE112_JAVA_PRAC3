//Thia program is created by Aryaan Rabara 21ce112
//Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git
/*Question:Write a program to create a default method in an interface IPrinter. 
Create an interface IPrinter and IScanner. You can assume variables and methodsfor both interfaces.
 Create a concrete class to implement both the interfaces. 
Create 5 objects of the class, store it in Vector and display the result of the vector. */
import java.util.*;

public class TestInterfaceMain {
    public static void main(String[] args) {
        Vector<TestInterface> ti = new Vector<TestInterface>(5);
        for(int i=0;i<5;i++)
        {
            TestInterface a = new TestInterface();
            ti.add(a);
        }
        for(int i=0;i<5;i++){
            System.out.println("For object at index " + i + ": ");
            ti.get(i).getdata();
            ti.get(i).putdata();
            System.out.println();
            
        }
        System.out.println("This Program is created By Aryaan Rabara 21CE112");
    }
}