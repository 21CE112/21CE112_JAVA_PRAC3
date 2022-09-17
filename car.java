//Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git
// This progra is created by Aryaan Rabara 21CE112
interface Vehicle {

    void cleanVehicle();
//here we Use Default keyward
//if we use default kewward we define the method in interface
    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}
public class car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

    public static void main(String args[]){
        car car = new car();
        car.cleanVehicle();
        car.startVehicle();
        System.out.println("This progra is created by Aryaan Rabara 21CE112");
    }
}