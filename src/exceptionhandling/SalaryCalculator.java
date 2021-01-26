/*package exceptionhandling;

public class SalaryCalculator {
    //Exception Handling - ArithmeticException
    int div; //Declared a global variable

    public static int doDivision(int num1, int num2) {
*//*        try{
            this.div=num1/num2;
            System.out.println("Division value is "+div);
        } catch (Exception e){ //You can also put in ArithmeticException instead of Exception in the parameter if you know the exception type
            System.out.println("This is an Arithmetic Exception");
        }
        return div;
    }*//*


*//*
    public int doDivision1(int num1, int num2) throws Throwable{
        this.div=num1/num2;
        System.out.println("Division value is "+div);
        // System.out.println("This is an Arithmetic Exception");
        return div;
        }
*//*

    public static void main(String[]) throws Exception {

        //SalaryCalculator.doDivision(60,20);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        //salaryCalculator.doDivision(30, 2);

*//*        try { //try catch block
            SalaryCalculator.doDivision(70,0);
        }catch (Exception e){ //Catch block helps us get exception
           // e.printStackTrace(); //Print Error or comment it out to not display anything
            System.out.println("This is an Arithmetic Exception"); //Custom message
        }*//*
*//*        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException in){
            System.out.println("This is an InterruptedException");
        }*//*

       // salaryCalculator.doDivision1(20,0);

        }

    }*/


