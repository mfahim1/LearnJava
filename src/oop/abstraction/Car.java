package oop.abstraction;

public interface Car {

    public interface NewCar{
        //Nested Interface
        public void carRoof();

    }

    //Interface: Guideline for future
    //Interface is 100% abstract

    //Variables with initialization
    String brand="Mercedes";
    int carQuantity=200;
    String seat="2";
    String headlight="4";
    boolean gasTank=true;

    //Method: able to declare method without body for void type
    public void startCar(); //Abstract Method
    public void stopCar();
    public void carWheel();
    public void carEngine();
    public void carBrake();
    public void steering();
    public void acceleration();

    public static int carDoor(int doorNumber){  //Declare and initialize static/non static methods
        int totalDoor=1*doorNumber;
        return totalDoor;
    }



}
