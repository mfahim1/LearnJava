package singleton;

public class Pizza {

    String pizzaName;
    String toppingName;
    int qt;
    double price;


    public Pizza(){ //Default Constructor

    }

    public static void main(String[] args) {
        Pizza myPizza=new Pizza(); //Constructor Default Non Parameterized

        Pizza yourPIzza=new Pizza(); //We can create multiple objects at a time

        LearnSingleton ls=LearnSingleton.getInstance();
        System.out.println(ls.collegeName);
    }

}
