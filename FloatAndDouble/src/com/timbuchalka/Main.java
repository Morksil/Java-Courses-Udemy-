package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
	    int myIntValue=5/2;
	    //width of float = 32 (4 bytes)
	    float myFloatValue=(float) 5/3; // lub 5.2f;
        //width of double = 64 (8 bytes)
	    double myDoubleValue=5d/3d;
        System.out.println("myIntValue =" + myIntValue);
        System.out.println("myFLoatValue =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds*0.45359237d;
        System.out.println(pounds + " pounds equals " + kilograms);
    }
}
