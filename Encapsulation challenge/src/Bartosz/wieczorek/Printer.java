package Bartosz.wieczorek;

public class Printer {
    private int tonerLevel=100;
    private int numberOfPagesPrinted;
    private boolean isItduplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isItduplex) {
        if(tonerLevel>0 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted =0;
        this.isItduplex = isItduplex;
    }

    public void print(int numberOfPages) {
        this.tonerLevel = this.tonerLevel - 2*numberOfPages;
        if(isItduplex==false) {
            this.numberOfPagesPrinted = this.numberOfPagesPrinted + numberOfPages;
        }else {
            this.numberOfPagesPrinted=this.numberOfPagesPrinted+numberOfPages/2;
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isItduplex() {
        return isItduplex;
    }
}
