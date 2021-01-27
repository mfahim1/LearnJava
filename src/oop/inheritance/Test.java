package oop.inheritance;

public class Test {

    public static void main(String[] args) {
/*        - Single Level (ex: Class B inherits from Class A)
        - Multi Level (ex: Class C inherits from Class B, and Class B inherits from Class A)
        - Hierarchical level (ex: Class B and C both inherit from Class A)*/

        //We cannot access private properties like account number
        //We have access on public properties only

        Father myFather=new Father();
        myFather.swim();
        myFather.hairColor();
        myFather.height(); //comes from grandfather
        myFather.weight();//comes from grandfather

        Son rois=new Son();
        rois.hairStyle(); //Son class
        rois.beard(); //Father class
        rois.jump();//Grandfather class

        Daughter fahim=new Daughter();
        fahim.musician(); //daughter class
        fahim.eyes(); //Father Class
        fahim.playGame(); // Grandfather class
    }

}
