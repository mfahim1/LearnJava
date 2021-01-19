package operators;

public class LearnConditionalOperator {

    // && Conditional AND: all condition must be true then it will execute the block of code
    // || Conditional OR: if one condition is true then block of code will execute

    // pipe ||

    public static void main(String[] args) {

        int num1=50;
        int num2=40;
        if (num1 ==num2){
            System.out.println("Number1 and Number2 is Equal");
        }
        if (num1==55 && num2==40){
            System.out.println("Burgers are yummy!");
        }
        if (num1==55 || num2==40){
            System.out.println("Burgers are not Potatoes!");
        }


    }
}
