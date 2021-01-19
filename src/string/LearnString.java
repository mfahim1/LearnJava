package string;

public class LearnString {
    //String is a data type and a Class
    //Hold CRTL + Click to view JDK Code
    String name="James";

    public static void main(String[] args) {
        String burgerName="American Burger";
        System.out.println(burgerName.length()); //.length gives total characters in string
        System.out.println(burgerName.equals("American Burger"));//equals compares 2 strings
        System.out.println(burgerName.equalsIgnoreCase("American burger")); //return will be true, it will ignore case
        System.out.println(burgerName.charAt(5)); //See Char at 5th position. Starts from 0
        System.out.println(burgerName.substring(6)); //It will divide 2 parts after 6th Char
        //Reverse String
        System.out.println(burgerName.substring(3, 9)); //3 start point, 9 endpoint will display rican. Convert String to Substring
        System.out.println(burgerName.toUpperCase()); //Displays string in all Upper Case
        System.out.println(burgerName.toLowerCase());//Displays string in all lower Case

        String fname="James";
        String lName="William";
        System.out.println(fname.concat(lName)); //Concatenation of First and Last Name

       // System.out.println(burgerName.charAt(25));
        //Exception Handling - StringIndexOutOfBoundsException

        try{
            System.out.println(burgerName.charAt(25)); //tries this value without throwing exception
        }
        catch(Exception e){
            e.printStackTrace(); //it will display error message from JDK
            System.out.println("String Index Out of Bounds Exception"); //displays my custom message
        }

    }

}
