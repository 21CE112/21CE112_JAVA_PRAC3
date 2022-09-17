Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git

// This program is created by Aryaan Rabara 21CE112
import java.util.Date;

public class Testgeometric  {
    public static void main(String []args)
    {
//Here we call the method by using of objects
        circle c = new circle(10,"green",true);
        Rectangle x = new Rectangle(10,20);
        Date d =new Date();
        System.out.println("The area and perameter of circle And Rectangle is :");
       System.out.println("The Area of Circle is : "+c.getarea()); 
       System.out.println("The Area of Rectangle is : "+x.getarea()); 
       System.out.println("The Parameter of Circle is : "+c.getperameter());
        System.out.println("The Parameter of Rectangle is : "+x.getperameter());
        System.out.println(d);
        System.out.println("This program is created by Aryaan Rabara 21CE112");

    }
}
