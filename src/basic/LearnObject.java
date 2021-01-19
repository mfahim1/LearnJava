package basic;

public class LearnObject {

//Object = to create properties
// Syntax --- className objectName = new constructorOfClass();

    public static void main(String[] args) {

        LearnDataType dataType= new LearnDataType();
        System.out.println(dataType.pizzaSize);

        dataType.pizzaSize='M'; //reassigned value
        System.out.println(dataType.pizzaSize);

     // dataType.name   =    "Jack";
        String fName    =   dataType.firstName  =  "Jack";  //dynamic coding reassignment
        System.out.println(fName);

   //   dataType.firstName="Soumia";
        String ex= dataType.firstName = "Fahim";
        System.out.println(ex);

    }

}
