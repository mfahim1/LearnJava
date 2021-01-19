package constructor;

public class Burger {

    String nameOfBurger;
    char size;
    String topping;
    double priceOfBurger;
    int quantityOfBurger;
    double totalValue;
    String isBurgerAvailable;

    //Default Constructor
    public Burger(){

    }

    public Burger(String nameOfBurger){
        this.nameOfBurger=nameOfBurger;
        String burgerName=this.nameOfBurger=nameOfBurger;
        System.out.println("Burger name is "+nameOfBurger);
     //   System.out.println("Burger name is "+this.nameOfBurger);
        //   System.out.println("Burger name is "+burgerName);
    }

    public Burger(String nameOfBurger, char size){
        this.nameOfBurger=nameOfBurger;
        char burgerSize=this.size=size;
        System.out.println("Burger name is "+ nameOfBurger + "Size is "+burgerSize);
    }

    public Burger(String nameOfBurger, char size, String topping){
        this.nameOfBurger=nameOfBurger;
        char burgerSize=this.size=size;
        String burgerTopping=this.topping=topping;
        System.out.println("Burger name is "+ nameOfBurger + "Size is "+burgerSize + "Topping is "+ burgerTopping);
    }

    public Burger(String nameOfBurger, char size, String topping, double priceOfBurger){
        this.nameOfBurger=nameOfBurger;
        char burgerSize=this.size=size;
        String burgerTopping=this.topping=topping;
        double burgerPrice=this.priceOfBurger=priceOfBurger;
        System.out.println("Burger name is "+ nameOfBurger + "Size is "+burgerSize + "Topping is "+ burgerTopping+"Price of Burger is "+ priceOfBurger);
    }

    public Burger(String nameOfBurger, char size, String topping, double priceOfBurger, int quantityOfBurger){
        this.nameOfBurger=nameOfBurger;
        char burgerSize=this.size=size;
        String burgerTopping=this.topping=topping;
        double burgerPrice=this.priceOfBurger=priceOfBurger;
        int burgerQuantity=this.quantityOfBurger=quantityOfBurger;
        System.out.println("Burger name is "+ nameOfBurger + "Size is "+burgerSize + "Topping is "+ burgerTopping+
                "Price of Burger is "+ priceOfBurger+ "Quantity of Burgers is "+burgerQuantity);
    }

    public Burger(String nameOfBurger, char size, String topping, double priceOfBurger, int quantityOfBurger, double totalValue){
        this.nameOfBurger=nameOfBurger;
        char burgerSize=this.size=size;
        String burgerTopping=this.topping=topping;
        double burgerPrice=this.priceOfBurger=priceOfBurger;
        int burgerQuantity=this.quantityOfBurger=quantityOfBurger;
        double burgerValue=this.totalValue=totalValue;
        System.out.println("Burger name is "+ nameOfBurger + "Size is "+burgerSize + "Topping is "+ burgerTopping+
                "Price of Burger is "+ priceOfBurger+ "Quantity of Burgers is "+burgerQuantity+"Value is "+burgerValue);
    }

    public Burger(String nameOfBurger, String isBurgerAvailable){
        this.nameOfBurger=nameOfBurger;
        String burgerAvailable= this.isBurgerAvailable= isBurgerAvailable;
        System.out.println("Burger name is "+ nameOfBurger +"Burger availability: "+burgerAvailable);
    }

    public static void main(String[] args) {
        Burger fahimOrder=new Burger("Cheese Burger");
        Burger jamesOrder=new Burger("Waffle Burger",'L',"Lettuce",29.5,2,
                42);
        Burger muhammadOrder=new Burger("Chicken Sandwich", 'M',"Tomatoes",35, 5, 35);

    }
}
