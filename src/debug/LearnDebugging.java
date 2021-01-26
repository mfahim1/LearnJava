package debug;

import java.util.Scanner;

public class LearnDebugging {
    //Debugging to discover bugs or errors
    //Debugging: Identify your logical Error by yourself
    //Break Point: When you execute your code, your code will stop at break point

    public static void main(String[] args) {

        int num1=23;
        int num2=25;
        int num3=45;
        int num4=45;
        int num5=45;
        int num6=45;
        int sum=num1-num2;
        System.out.println("Summation value is "+sum);

        LearnDebugging.doPattern();

    }

    public static void doPattern(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int rowNumber=input.nextInt();

        for(int i=1; i<=rowNumber; i++){
            for(int j=1; j<=i; j++){
                System.out.println(j+" ");
            }
            System.out.println();
        }
    }
}
