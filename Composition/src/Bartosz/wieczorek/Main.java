package Bartosz.wieczorek;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(100,20,100);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"x2.44");


        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUp();

        Bed theBed = new Bed(20,100,50);
        Light theLight = new Light(5);
        Window theWindow = new Window(4,"quadrant");
        Chair theChair = new Chair(10,"IKEA",20);


        Room theRoom = new Room(theBed,100,150,200,theWindow,theChair,theLight);

        theRoom.getTheLight().turnLightOn();
        theRoom.openWindows();
        theRoom.closeWindows();




    }
}
