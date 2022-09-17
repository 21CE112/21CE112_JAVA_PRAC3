// This program is created by Aryaan Rabara 21CE112
Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git


//here we extends geometric class
public class circle extends Geometric{
    private double r;
    private String color;
    private boolean filled;
//here we create Constructor get value

    circle()
    {

    }
    circle(double r,String color,boolean filled)
    {
        super(color, filled);
        this.r=r;
    }
//here we create some method for operation
    public double getR() {
        return r;
    }
    @Override
    public double getarea() {
       
        return 3.14*r*r;
    }
    @Override
    public double getperameter() {
       
        return 2*3.14*r;
        
    }
}
