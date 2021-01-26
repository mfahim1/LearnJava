package exceptionhandling;

public class LearnFinalFinallyFinalize {
    //what is final, finally, & finalize?
    //if you use final keyword, you cannot change the value anywhere
    //Finally: Runs after try catch
    //Garbage Collection - unnecessary stuff, removing unused variables
    //Finalize is used to perform clean up processing just before object is garbage collected

    final String name="Muhammad"; //Not used anywhere
    int div;

    public int doDivision(int num1, int num2) {
        try { //try this block of code, if anything happens, throw exception in catch block
            this.div = num1 / num2;
            System.out.println("Division value is " + div);
        } catch (Exception e) { //You can also put in ArithmeticException instead of Exception in the parameter if you know the exception type
            System.out.println("This is an Arithmetic Exception");
        } finally {
            System.out.println("Division is done");
        }
        return div;
    }

    public static void main(String[] args) {
        LearnFinalFinallyFinalize lf=new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf1=new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf2=new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf3=new LearnFinalFinallyFinalize();
        lf.doDivision(12,0);
        //System.out.println(lf.name="James"); //unable to change final variable
        lf1=null;
        lf2=null;
        lf3=null;

        System.gc(); //Garbage Collection, unused variables will be deleted during runtime
    }

}
