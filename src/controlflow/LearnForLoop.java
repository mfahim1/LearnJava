package controlflow;

public class LearnForLoop {
    //Loop allows us to execute a statement or a group of statements multiple times
    //Types of Loop:
    //For Loop
    //While Loop
    //Do..While Loop
    //For Each Loop

    //For Loop Syntax:
    // for(Declaration: Expression){//Statements}
    // for(Initialization; Condition;Iteration){}
    // Initialization=StartPoint; Condition=EndPoint; Iteration=Looping/AgainNAgain

    public static void main(String[] args) {
        //int i=0 Initialization, i<5 Condition, i++ Iteration

/*        for(int i=0;    i<5;    i++){
            System.out.println("Hello");

            int number1=20;
            int number2=30;
            int total=number1+number2;
            System.out.println(total);
        }

        for(int i=0;    i<6;    i++){
            System.out.println("We Are Learning For Loop"+i);
        }

        //Nested For Loop

        for(int i=2; i<=8; i++){
            //Parent Loop
            System.out.println("We love to eat pizza"+i);
            for(int j=4; j<=7; j++){
                //child loop/nested
                System.out.println("Nested Loop"+j);
            }
        }*/

/*        for (int i=10; i>5; i++){   //Infinite Loop unless you add a break
            System.out.println("We are learning Java");
            break;
        }*/

/*        for (int i=10; i>5; i--){
            System.out.println("We are learning Java");
        }*/

        for (int i=10; i>5; ++i){
            System.out.println("We are learning Java");
            break; //When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
        }



    }
}
