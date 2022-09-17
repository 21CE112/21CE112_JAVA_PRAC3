Github Link: https://github.com/21CE112/21CE112_JAVA_PRAC3.git
//This program is created by Aryaan Rabara 21CE112
public class overriding {
    //Here we create displayinfo method in class overriding
        public void displayInfo() {
           System.out.println("I am an animal.");
        }
     }
     
     class Dog extends overriding {
        @Override
        //Here we create another displayinfo method in class dog
        public void displayInfo() {
           System.out.println("I am a dog.");
        }
     }

     