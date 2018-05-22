package Bartosz.wieczorek;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double additionalPrice;

    private String addition2Name;
    private double additiona2Price;

    private String addition3Name;
    private double additiona3Price;

    private String addition4Name;
    private double additiona4Price;
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAdditional1(String name, double price) {
        this.addition1Name=name;
        this.additionalPrice=price;
    }

    public void addAdditional2(String name, double price) {
        this.addition2Name=name;
        this.additiona2Price=price;
    }

    public void addAdditional3(String name, double price) {
        this.addition3Name=name;
        this.additiona3Price=price;
    }

    public void addAdditional4(String name, double price) {
        this.addition4Name=name;
        this.additiona4Price=price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice=this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll with " + this.meat +
                                                                                        " price is " + this.price);

        if(this.addition1Name!=null) {
            hamburgerPrice+=this.additionalPrice;
            System.out.println("Added " + this.addition1Name + " for an extra " + additionalPrice);
        }
        if(this.addition2Name!=null) {
            hamburgerPrice+=this.additiona2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + additiona2Price);
        }
        if(this.addition3Name!=null) {
            hamburgerPrice+=this.additiona3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + additiona3Price);
        }
        if(this.addition4Name!=null) {
            hamburgerPrice+=this.additiona4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + additiona4Price);
        }
        return hamburgerPrice;
    }



}
