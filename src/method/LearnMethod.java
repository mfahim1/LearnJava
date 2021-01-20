package method;

public class LearnMethod {
    //Method: block of code which runs when it is called. Method is used to perform certain actions and they are known as functions
    //Method Type:
    //Return Method without Parameter
    //Return Method with Parameter
    //Non Return Method without Parameter
    //Non Return Method with Parameter

    //Method Syntax: AccessModifier ReturnType/MethodType Method(){Method Body}
    //ReturnType/MethodType : Data Type/Class Type
    //MethodName: verb+Noun

    //Method Syntax:
    //AccessModifier ReturnType/MethodType MethodName(){Method Body}

    //Return Types are: All Data type, void, class and object
    //Method Syntax: AccessModifier ReturnType/MethodType MethodName(){Method Body}

    public static int doSummation(){ //Return Type Method without Parameter:
        int num1=40;
        int num2=30;
        int total=num1+num2; //Hard Coded
        System.out.println("Total Value is "+total); //concatenation
        return total; //Return has to be last line if data type is string or integer,boolean. If it is a return type method
    }
    public static int doSum(int number1, int number2){ //Return Type Method with Parameter/Dynamic Method
        int num1=number1;
        int num2=number2;
        int total=num1+num2;
        System.out.println("Total Value is "+total);
        return total; //Return has to be last line if data type is string or integer,boolean. If it is a return type method
    }
    public static int doMultiply(int number1, int number2){ //Return Type Method with Parameter/Dynamic Method
        int num1=number1;
        int num2=number2;
        int total=num1*num2;
        System.out.println("Total Value is "+total);
        return total; //Return has to be last line if data type is string or integer,boolean. If it is a return type method
    }

    //Non  Return Method without Parameter --- you have to use void
    public static void studentInfo(){
        String name="James";
        String address="Queens, NY";
        System.out.println("Student name is "+name+" "+"Address is "+ address);
    }

    //Non Return Method with Parameter
    public static void studentInformation(String stName, String stAddress){
        String name=stName;
        String address=stAddress;
        System.out.println("Student name is "+name+" "+"Address is "+ address);
    }

    public static String name="james";

    public static void main(String[] args) { //Non Return Type Method
        LearnMethod.doSummation(); //Always return 70
        LearnMethod.doSum(50,70);
        LearnMethod.doMultiply(23,25);
        LearnMethod.studentInfo();
        LearnMethod.studentInformation("Muhammad","Dhaka, Bangladesh");
    }

}
