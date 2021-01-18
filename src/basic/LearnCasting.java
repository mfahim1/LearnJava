package basic;

public class LearnCasting {
    // Casting: Converting data type
    //Primitive data type to Primitive data
    //Non Primitive to Non Primitive

    public static void main(String[] args) {

        double price = 35.67; //Local Non Static Variable
        int newPrice = (int) price; //casting - Converting Double to Integer
        System.out.println(newPrice);

        int num1= 50;
        int num2= 40;
        int num3= num1;
        int num4= num3+num2; //swapping, dynamic coding
        System.out.println(num4); //num3+num2 or 50+40

        int age= 24;
        double newAge = (double) age; //or double newAge = age;
        System.out.println(age);

        int number=54;
        byte total= (byte) number;
        System.out.println("INT TO BYTE " + total); //Byte only takes upto 127

    }
}
