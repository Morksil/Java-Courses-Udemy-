package Bartosz.wieczorek;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(4,3,4,"Automatic",4);
        System.out.println(car1.getBody());
        Opel opel1 = new Opel(3,5,2,"Automatic");
        System.out.println(opel1.getLights());
        car1.ride(4);

        opel1.drive(15);

    }
}
