package advance;

public class LearnRecursion {

    //Recursion: process in which a method calls itself continuously
    //Must call itself, must have a base case, must change its state and move toward the base case

    static int count=0;

    public static void tvDisplay(){
        count++;
        if(count<10){
            System.out.println("This is a TV Display");
            tvDisplay(); //Recursion
        }
    }

    public static void main(String[] args) {
        LearnRecursion.tvDisplay();
    }

}
