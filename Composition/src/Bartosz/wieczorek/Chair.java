package Bartosz.wieczorek;

public class Chair {

    private int height;
    private String manufacturer;
    private  int weight;

    public Chair(int height, String manufacturer, int weight) {
        this.height = height;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

}
