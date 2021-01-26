package controlflow;

public class LearnWhileLoop {
    //While loop is used in situations where we do not know how many times loop needs to execute
    //For loop is used where we already know about the number of times loop needs to execute
    //Typically for a index used in iteration

    //While Loop: pre condition check
    //while(condition){++ or --}

    public static void main(String[] args) {
        //While(condition){++ or --}

        int age=24;

        while (age>21){
            System.out.println("Your age is Greater than 21");
            age--;
            //break;
            //Exit loop when condition is false
        }
        System.out.println("******************************");
        //Nested While Loop: Child while loop
        int number=24;
        while (number>21){
            System.out.println("Your age is Greater than 21");
            number--;
            int qty=30;
            while (qty<35){
                System.out.println("We are ordering pizza");
                qty++;
            }
        }
    }
}
