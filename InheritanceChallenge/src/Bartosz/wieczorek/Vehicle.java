package Bartosz.wieczorek;

public class Vehicle {
private int wheels;
private int body;
private int windows;
private int doors;
private int lights;

    public Vehicle(int wheels, int body, int windows, int doors, int lights) {
        this.wheels = wheels;
        this.body = body;
        this.windows = windows;
        this.doors = doors;
        this.lights = lights;
    }

    public int getWheels() {
        return wheels;
    }

    public int getBody() {
        return body;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getLights() {
        return lights;
    }

    public void move(int speed){
        System.out.println("Vehicle is moving at speed: " + speed);
    }
}
