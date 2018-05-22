package Bartosz.wieczorek;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine=true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine() {
        System.out.println("Engine is not starting.");
    }

    public void accelerate() {
        System.out.println("Car is not accelerating");
    }

    public void brake() {
        System.out.println("Car is not braking.");
    }
}

class Opel extends Car {
    public Opel(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Opel is starting engine.");
    }
}

class Nissan extends Car {

    public Nissan(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Nissan is starting engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Nissan is accelerating.");

    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota is starting engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Toyota is braking.");
    }
}


public class Main {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Toyota",6);
        toyota.startEngine();
        toyota.brake();
        toyota.accelerate();

        Nissan nissan = new Nissan("Nissan",8);
        nissan.startEngine();
        nissan.brake();
        nissan.accelerate();

        Opel opel = new Opel("Opel",6);
        opel.startEngine();
        opel.accelerate();
        opel.brake();
    }
}
