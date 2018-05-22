package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
        }

        boolean isCar = true;

        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        double myValue1 = 20d;
        double myValue2 = 80d;

        double result1=(myValue1+myValue2)*25d;

        double theReminder = result1 %40;
        if(theReminder <= 20){
            System.out.println("Result1 was over of limit.");
        }


    }
}
