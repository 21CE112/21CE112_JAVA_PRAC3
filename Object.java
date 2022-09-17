Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git
//This program is created by Aryaan Rabara 21CE112
//here we make multiple interfaces
interface P
{
    public int p=5;
    void methodP();
}
interface P1 extends P
{
    public int p1=10;
    void methodP1();
}
interface P2 extends P
{
    public int p2=15;
    void methodP2();
}
//here interfaces extends to interface p12
interface P12 extends P1,P2
{
    public  int p12=20;
    void methodP12();
}
//class object implement the p12
public class Object implements P12
{
    
    public void methodP12()
    {
        System.out.println("P12 Class Method Constant : "+p12);
    }
    public void methodP1()
    {
        System.out.println("P1 Class Method Constant : "+p1);
    }
    public void methodP2()
    {
        System.out.println("P2 Class Method Constant : "+p2);
    }
    public void methodP()
    {
        System.out.println("P Class Method Constant : "+p);
    }
}

