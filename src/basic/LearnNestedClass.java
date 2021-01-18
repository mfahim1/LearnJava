package basic;

public class LearnNestedClass {
    //nested class: Child Class, class inside of a class
int num=20;
int num1=30;

    public static void main(String[] args) {
        LearnNestedClass lnc=new LearnNestedClass();

        System.out.println(lnc.num);

        Computer com=new Computer();

        System.out.println(com.computerName);
        System.out.println(com.computerPrice);
    }

    public static class Computer{ //child class is Computer, Main Class is LearnedNestedClass. Have to declare static or
        //Class won't be found

        String computerName="HP";
        String computerPrice="2000";

        public void display(){

        }

    }

}
