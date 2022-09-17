// This program is created by Aryaan Rabara 21CE112
Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git

public class Rectangle extends Geometric {
    private double width;
    private double height;
//here we extends geometric class
    Rectangle()
    {}
    Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;

    }
    Rectangle(double width,double height,String color,boolean filled)
    {
        
       super(color,filled);
    }
   
    
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
        
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getarea() {
        // TODO Auto-generated method stub
        return height*width;
    }
    @Override
    public double getperameter() {
        // TODO Auto-generated method stub
        return 2*(height*width);
}
}
