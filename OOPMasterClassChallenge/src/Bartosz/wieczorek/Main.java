package Bartosz.wieczorek;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic","sausage",3.56,"White");

        double price = hamburger.itemizeHamburger();

        hamburger.addAdditional1("Lettuce",0.15);
        hamburger.addAdditional2("Tomato",0.25);
        hamburger.addAdditional3("Cheese",1.12);
        System.out.println("Total Burger price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        //healthyBurger.itemizeHamburger();
        healthyBurger.addAdditional1("Lettuce",0.15);
        healthyBurger.addAdditional2("Tomato",0.25);
        healthyBurger.addAdditional3("Chees",1.12);
        healthyBurger.addAdditional4("Cucumber",0.5);

        System.out.println("Total price : " + healthyBurger.itemizeHamburger());
        healthyBurger.addHealthyAddition1("Egg",5.2);
        healthyBurger.addHealthyAddition2("Olives",4.25);
        System.out.println("Total price: " + healthyBurger.itemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addAdditional2("Gowno",1100);
        db.itemizeHamburger();

    }
}
