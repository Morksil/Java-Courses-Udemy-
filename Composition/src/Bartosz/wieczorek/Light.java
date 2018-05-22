package Bartosz.wieczorek;

public class Light {

    private int numberOfLights;

    public Light(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void turnLightOn() {
        System.out.println("Light is on.");
    }
}
