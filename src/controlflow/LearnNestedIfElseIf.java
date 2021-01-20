package controlflow;

public class LearnNestedIfElseIf {

    public static void main(String[] args) {
        //Nested if Else: Child if Else
        //format line: CTRL +ALT+L

        int score = 55;

        if (score >= 90) {
            System.out.println("You got A+");
            if (score == 92) {
                System.out.println("You are Excellent");
            } else {
                if (score == 95) {
                    System.out.println("You are a Genius");
                }
            }
        } else if (score >= 80) {
            System.out.println("You got A-");
        } else if (score >= 70) {
            System.out.println("You got A");
        } else if (score >= 60) {
            System.out.println("You got B+");
        } else {
            System.out.println("You failed");
        }
    }

}
