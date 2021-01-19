package basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner is a reference Variable

        System.out.println("Enter your First Name");
        String fName= input.nextLine();
        System.out.println("First Name is "+ fName);
        System.out.println("Enter your Last Name");
        String lName= input.nextLine();
        System.out.println("Last Name is "+ lName);
        System.out.println("Enter your course fee");
        double cFee = input.nextDouble();
        System.out.println("Course Fee is: "+cFee);
        System.out.println("Enter discount decimal percentage");
        double discount = input.nextDouble();
        System.out.println("Net Pay is "+ cFee* (1-discount));
        Scanner input1 = new Scanner(System.in);
        input.close();
        input1.close();

    }

}
