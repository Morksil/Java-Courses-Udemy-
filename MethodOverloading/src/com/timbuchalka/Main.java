package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int newScore =calculateScore("Bartek",500);
        System.out.println("New score is " + newScore);
        calculateScore(50);
        calculateScore();

       calcFeetAndInchesToCentimeters(5,3);
       calcFeetAndInchesToCentimeters(13,13);

       calcFeetAndInchesToCentimeters(157);



    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    }
    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score*1000;
    }
    public static int calculateScore () {
        System.out.println("No player, no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Wrong values.");
            return -1;
        }
        else {
            double feetToCentimeters = feet * 12d * 2.54d;
            //System.out.println(feet + " feet is " + feetToCentimeters + " centimeters.");
            double inchesToCentimeters = inches * 2.54d;
            //System.out.println(inches + " inches is " + inchesToCentimeters + " centimeters.");
            System.out.println(feet + " feet and " + inches + " inches " + " equals " + (feetToCentimeters+inchesToCentimeters));
            return (feetToCentimeters+inchesToCentimeters);
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
                double reszta = inches %12d;
                double ileStop = (inches - reszta)/12d;
            System.out.println(inches + " inches is " + ileStop + " feet and "+ reszta + " inches.");
                //System.out.println(inches + " inches is " +  calcFeetAndInchesToCentimeters(ileStop,reszta)+ " centimeters.");
                return calcFeetAndInchesToCentimeters(ileStop,reszta);
        }
    }

}
