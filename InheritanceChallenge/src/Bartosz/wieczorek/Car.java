package Bartosz.wieczorek;

public class Car extends Vehicle {
    private String gear;
    private int seats;

    public Car( int windows, int doors, int lights, String gear, int seats) {
        super(4, 1, windows, doors, lights);
        this.gear = gear;
        this.seats = seats;
    }

    public String getGear() {
        return gear;
    }

    public int getSeats() {
        return seats;
    }

    public void ride(int speed) {
        System.out.println("Car is moving at speed: " + speed);
        super.move(speed);
    }
}
