package operators;

public class LearnUnaryOperator {

    //Increment operator: ++ always add 1
    //PreIncrement: ++number
    //PostIncrement: number++

    //Decrement Operator: -- Decrease -1
    //PreDecrement: --number
    //PostDecrement: number--

    public static void main(String[] args) {

        int number = 30;
        //  System.out.println(++number); //1+number
        System.out.println(number++); //number+1(this 1 is for future use)
        System.out.println(number); //31
        number++; //31 + 1 for future
        number++; //32 + 1 for future
        ++number; //1+1+32=34
        System.out.println(number);

        --number;
        System.out.println(number); //33
        number--;
        number--;
        number--;
        --number;
        --number;
        ++number;
        number++;
        System.out.println(number);

        for (int i=0; i<10;i++){
            System.out.println("Hello");
        }

    }
}