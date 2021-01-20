package controlflow;

import java.util.Scanner;

public class LearnSwitchCase {
    //SwitchCase: is the same as nested if else, just an alternative option

    public static void main(String[] args) {

      //  int foodSerial = 2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Food Serial Number");
        int foodSerial=input.nextInt();
        LearnSwitchCase.foodMenu(foodSerial);
    }
        public static void foodMenu(int foodSerial){
            String foodName;
            //if Case is 1, then it will execute block, if 9, it will execute that block
            switch (foodSerial) {
                case 1:
                    foodName = "Pizza";
                    break;
                case 2:
                    foodName = "Chicken Curry";
                    break;
                case 3:
                    foodName = "Burger";
                    break;
                case 4:
                    foodName = "Tacos";
                    break;
                case 5:
                    foodName = "Couscous";
                    break;
                case 6:
                    foodName = "Spaghetti";
                    break;
                case 7:
                    foodName = "Sushi";
                    break;
                case 8:
                    foodName = "Vegetables";
                    break;
                case 9:
                    foodName = "Rice";
                    String rice="Brown";
                    if (rice=="white"){
                        System.out.println("Rice is white");
                    }
                    else{
                        System.out.println("rice is brown");
                    }
                    break;
                case 10:
                    foodName = "Fried Chicken";
                    break;
                default: //like Else, if no condition is true, then it goes for default block
                    foodName = "Invalid Food Item";
                    break;
            }
            System.out.println("Selected Food is " + foodName);


    }
}
