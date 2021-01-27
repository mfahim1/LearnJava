package oop.abstraction;

public class GeneralMotor extends ModernCar implements Car { //Concrete Class because its implementing another interface
    //Develop a car for the year 2022
    //Implemented methods you can modify and customize in your own way
    //Can we create regular (return/non return) method in Concrete class? yes

    //variables below:
    String carModel="M22";
    String modelYear="2022";
    static double price=70000;

    //Methods Below
    public static void carInfo(){
        System.out.println("This is GeneralMotor car information");
    }
    //Return Method
    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth=availability;
        return releaseMonth;
    }


    public void startCar() {
        System.out.println("GeneralMotor car has start Feature");
    }

    public void stopCar() {
        System.out.println("GeneralMotor car has stop Feature");
    }

    public void carWheel() {
        System.out.println("GeneralMotor car has wheel");
    }

    public void carEngine() {
        System.out.println("GeneralMotor car has engine");
    }

    public void carBrake() {
        System.out.println("GeneralMotor car has brake feature");
    }

    public void steering() {
        System.out.println("GeneralMotor car has Steering");
    }

    public void acceleration() {
        System.out.println("GeneralMotor car has acceleration Feature");
    }


    public void navigation() {
        System.out.println("GeneralMotor car has navigation Feature");
    }

    public void autoLaneControl() {
        System.out.println("GeneralMotor car has auto lane control Feature");
    }

    public void display() {
        System.out.println("GeneralMotor car has display Feature");
    }

    public void cameras() {
        System.out.println("GeneralMotor car has cameras Feature");
    }

    public void autoGear() {
        System.out.println("GeneralMotor car has auto gear Feature");
    }

    public void selfDriven() {
        System.out.println("GeneralMotor car has seld driven Feature");
    }

    public void emergencyBrake() {
        System.out.println("GeneralMotor car has emergency brake Feature");
    }
}
