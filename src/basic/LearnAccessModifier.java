package basic;

public class LearnAccessModifier {
//public is an Access modifier, class is a key word, LearnAccessModifier is the class name
    //Access modifier/specifier: Applicable for Class, Variable, method
    //Types of Access modifiers:
    //Public - we can call or use within the class where it is located from anywhere including other packages
    //Private - we can only use within the same class where it is located. Cannot use outside of the class
    //Protected - only accessible from all the classes of the same package. Cannot access in other package
    //Default - int num= 123; Not declaring any Access modifier makes it default to public

    public String name="James";
    private String address="Queens, NY";
    protected String contactNumber="12738123";

    int num= 123;  //Default Access modifier

    public static void display()
    {
        System.out.println("We are learning Access Modifier");
    }

    public static void main(String[] args) {

        int num1=29;
        System.out.println(num1);
        num1=34; //reassigning
        System.out.println(num1);

        LearnNestedClass.Computer com = new LearnNestedClass.Computer();
        System.out.println(com.computerName); //retrieving child class

    }

}
