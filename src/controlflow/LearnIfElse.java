package controlflow;

public class LearnIfElse {
    //Control Flow: Makes some decision based on some condition

    //if(condition){}
    //if condition is true then it will execute if block
    //if condition is false it will execute else block

    //ctrl+shift+f to format code

    public static void main(String[] args) {
        int number=24;

        if(number==24){ //if block
            System.out.println("Number equals 24");
        }
        else{
            System.out.println("Number does not equal 24");
        }

        int age=19;
        if(age >= 18 && age<21){
            System.out.println("You are and Adult but you cannot buy cigarettes");
        }
        else{
            System.out.println("You are not an Adult");
        }

        String gender="female";
        if(gender=="female" || age>=25 && number==224){
            System.out.println("You dont have to buy ticket");
        }
        else{
            System.out.println("You have to buy ticket");
        }


    }
}
