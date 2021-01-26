package doenum;

public class LearnEnum {
    //Enum: Enum declaration can be done outside of a class or inside a class but not inside a method
    //Enum vs CLass
    //An Enum can just like a class have attributes and methods
    //Enum constants are public, static, final. Unchangeable cannot be override
    //An enum can not be used to create objects and it cannot extend other classes but it can implement interfaces
    //Use enums when you have values that you know are not going to change Ex: Days, Colors

    public enum Level{
        HIGH,LOW,MEDIUM
    }

    public static void main(String[] args) {
        System.out.println(Color.GREEN);
        Color color=Color.RED;
        System.out.println(color);
        System.out.println(Employee.SADIA);
        System.out.println(Level.HIGH);
    }

}
