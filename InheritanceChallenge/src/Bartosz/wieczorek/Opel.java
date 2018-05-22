package Bartosz.wieczorek;

public class Opel extends Car {
    public Opel(int windows, int doors, int lights, String gear) {
        super(windows, doors, lights, gear, 5);
        System.out.println("This is a fucking good Opel man!");
    }

    public void drive(int speed) {
        System.out.println("Opel drives at speed: "+speed);
        move(speed);
    }

}
