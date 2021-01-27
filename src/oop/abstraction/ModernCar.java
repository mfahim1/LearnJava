package oop.abstraction;

public abstract class ModernCar {
    //Abstract Class: which is not fully Abstract

    String modernCarBrand="Tesla"; //Variable
    double modernCarSuggestedPrice=65000; //Variable

    //Methods
    public abstract void navigation(); //Abstract method
    public abstract void autoLaneControl();
    public abstract void display();
    public abstract void cameras();
    public abstract void autoGear();
    public abstract void selfDriven();
    public abstract void emergencyBrake();

    //static and non static methods are allowed
    public void dualClimateControl(){
        System.out.println("Modern Car has Dual Climate Control Feature");
    }





}
