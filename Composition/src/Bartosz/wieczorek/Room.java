package Bartosz.wieczorek;

public class Room {
    private Bed theBed;
    private int width;
    private int height;
    private int depth;

    private Window theWindow;
    private Chair theChair;
    private Light theLight;

    public Room(Bed theBed, int width, int height, int depth, Window theWindow, Chair theChair, Light theLight) {
        this.theBed = theBed;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.theWindow = theWindow;
        this.theChair = theChair;
        this.theLight = theLight;
    }

    public void openWindows() {
        theWindow.openWindows();
    }

    public void closeWindows() {
        theWindow.closeWindows();
    }

    public Bed getTheBed() {
        return theBed;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    private Window getTheWindow() {
        return theWindow;
    }

    public Chair getTheChair() {
        return theChair;
    }

    public Light getTheLight() {
        return this.theLight;
    }
}
