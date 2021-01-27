package oop.encapsulation;

public class TestPizza {

    public static void main(String[] args) {
        Pizza myPizza=new Pizza();
        System.out.println(myPizza.pizzaName="Mexican Pizza");

        //Setter Method: To Set value
        myPizza.setToppingName("Mushroom");
        //Getter Method: To get value
        System.out.println(myPizza.getToppingName());

        myPizza.setAvailable(true);
        System.out.println(myPizza.isAvailable());

        myPizza.setTypeOfPizza("Cheese Pizza");
        System.out.println("My Favorite pizza is "+myPizza.getTypeOfPizza());

    }



}
