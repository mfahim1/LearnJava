package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {

    public static void main(String[] args) {
        //calling methods only
    LearnIfElseIf.retirementCalculation();

    }

public static void retirementCalculation(){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter yoru age");

    int age =input.nextInt();
    if(age<=24 && age<40){
        System.out.println("Your age is 24 or more/less");
    }
    else if (age>=40 && age<50){
        System.out.println("Your age is 40 or more");
    }
    else if(age >=50 && age<60){
        System.out.println("Your age is 50 or more");
    }
    else if(age>=60 && age<=65){
        System.out.println("Your Age is 60 or more");
    }
    else {
        System.out.println("Its time to retire");
    }
}

}
