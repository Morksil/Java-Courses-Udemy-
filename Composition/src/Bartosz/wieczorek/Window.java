package Bartosz.wieczorek;

public class Window {
    private int numberOfWindows;
    private String type;

    public Window(int numberOfWindows, String type) {
        this.numberOfWindows = numberOfWindows;
        this.type = type;
    }

    public void openWindows(){
        System.out.println("All windows are open.");
    }
    public void closeWindows() {
        System.out.println("All windows are closed.");
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getType() {
        return type;
    }
}
