package oop.inheritance;

public class Son extends Father{ //Multi level inheritance since father already extends grandfather

    //Variable
    public String favoriteDish="Steak";
    public String favoriteSport="Soccer";
    public String sonSSN="1324341412";

    private String sonAccountNumber;

    public Son(){ //Default Constructor

    }
    public Son(String favoriteDish){ //Parameterized Default Constructor
        this.favoriteDish=favoriteDish;
        System.out.println("Son Favorite Dish is "+favoriteDish);
    }

    public Son(String favoriteDish, String favoriteSport){ //Parameterized Default Constructor
        this.favoriteDish=favoriteDish;
        this.favoriteSport=favoriteSport;
        System.out.println("Son Favorite Dish is "+favoriteDish + "Sport is "+favoriteSport);
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    //Methods
    public void student(){
        System.out.println("Son is a student");
    }

    public void player(){
        System.out.println("Son can play soccer");
    }

    public void hairStyle(){
        System.out.println("Son hair style is Duck");
    }

    public void bodyBuilder(){
        System.out.println("Son has six pack abs");
    }


}
