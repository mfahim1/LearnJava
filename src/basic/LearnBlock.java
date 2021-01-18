package basic;

public class LearnBlock {

    //we cannot put system.out.println under class. it has to go inside a block

    {
        System.out.println("This is a block");
        System.out.println("This is a block");
        System.out.println("This is a block");
        System.out.println("This is a block");

    }

    public static void display(){
        System.out.println("This is a from outside main block");
        System.out.println("This is a from outside main block");

    }

    public static void main(String[] args) { //block start

        System.out.println("Main Block");
        LearnBlock.display();


    } //block end point



}
