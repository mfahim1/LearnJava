package operators;

public class LearnArithmeticOperator {
    // + Additive operator
    // - Subtraction
    // * Multiplication
    // / Division
    // % Remainder

    public static void main(String[] args) {

        int num1=40;
        int num2=3;

        int total=num1+num2;
        int balance=num1-num2;
        int monthlyValue=num1*num2;
        double weeklyValue=(double)num1/num2;
        int value=num1%num2;

        System.out.println(total);
        System.out.println(balance);
        System.out.println(monthlyValue);
        System.out.println(weeklyValue);
        System.out.println(value);
    }

}
