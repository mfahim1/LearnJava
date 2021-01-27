package oop.abstraction;

public class Test {

    public static void main(String[] args) {

        GeneralMotor gm=new GeneralMotor();

        gm.startCar();
        gm.acceleration();
        gm.carEngine();
        gm.steering();
        gm.stopCar();
        //gm.carDoor();

        //GeneralMotor.carDoor();
        Car.carDoor(4);
        gm.willBeAvailable(true);
        GeneralMotor.carInfo();
        gm.navigation();
        gm.cameras();
        gm.selfDriven();

        System.out.println("***********************************");

        Tesla muhammad=new Tesla(); //created object

        muhammad.startCar();
        muhammad.largeDisplay();
        muhammad.boostEngine();
        muhammad.teslaCarInfo();

        System.out.println("***********************************");

        //How to create an object?
        Tesla fahim=new Tesla();   //className objectName= keyword constructorOfClass();

        Car james= new Tesla(); //Tesla implemented Car
       // james.teslaCarinfo(); //not allowed to call from tesla
        //why we are not able to call tesla class methods? You can only call the methods from Car interface
        //All the methods coming from car interface only
        james.startCar();

        AutoPilot mihaf=new Tesla(); //Call Auto Pilot methods
        mihaf.autoPilot();
        mihaf.largeDisplay();

        ModernCar ala=new GeneralMotor();
        //ala.willBeAvailable();
        //ala.startCar(); ---in car interface
        ala.emergencyBrake();
        ala.dualClimateControl();

        //Alternative approach: Method Casting
        (   (GeneralMotor) ala).startCar(); //== ala.startCar();, c

    }



}
