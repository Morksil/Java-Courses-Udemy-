package Bartosz.wieczorek;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addAdditional1("Chips",2.75);
        super.addAdditional2("Drink",3.4);
    }

    @Override
    public void addAdditional1(String name, double price) {
        System.out.println("Can not add additional items in a deluxe burger");
    }

    @Override
    public void addAdditional2(String name, double price) {
        System.out.println("Can not add additional items in a deluxe burger");
    }

    @Override
    public void addAdditional3(String name, double price) {
        System.out.println("Can not add additional items in a deluxe burger");
    }

    @Override
    public void addAdditional4(String name, double price) {
        System.out.println("Can not add additional items in a deluxe burger");
    }
}
