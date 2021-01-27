package oop.abstraction;

public class Tesla implements Car, BoostEngine{
    //A Class can implement multiple Interfaces at a time

    public void teslaCarInfo(){
        System.out.println("Tesla Car Information");
    }

    public void startCar() {
        System.out.println("Tesla Car has Start Feature");
    }

    public void stopCar() {
        System.out.println("Tesla Car has Stop Feature");
    }

    public void carWheel() {
        System.out.println("Tesla Car has Wheels");
    }

    public void carEngine() {
        System.out.println("Tesla Car has Engine");
    }

    public void carBrake() {
        System.out.println("Tesla Car has Brakes");
    }

    public void steering() {
        System.out.println("Tesla Car has Steering");
    }

    public void acceleration() {
        System.out.println("Tesla Car has acceleration Feature");
    }

    public void largeDisplay() {
        System.out.println("Tesla Car has large display Feature");
    }

    public void autoPilot() {
        System.out.println("Tesla Car has auto pilot Feature");
    }

    public void boostEngine() {
        System.out.println("Tesla Car has Boost Engine Feature");
    }
}
