// This program is created by Aryaan Rabara 21CE112
Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git

import java.util.*;
public abstract class Geometric{
    private String color;
    private boolean filled;
    private Date datecreated; 
    protected Geometric()
    {}
//here we use protected constructor
    protected Geometric(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
//here we us getter setter method
    public String getColor() {
        return color;
    }
    public Date getDatecreated() {
        return datecreated;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public  abstract double getarea();
    public  abstract double getperameter();
        

}
