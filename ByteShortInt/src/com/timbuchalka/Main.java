package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //int has a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //byte has a width of 8
        byte myByte = -128;
        byte myByteValue =(byte) (myByte/2);
        System.out.println("myByteValue = " + myByteValue);
        //shoort has a width of 16
        short myShort = 32767;
        short myNewShort = (short) (myShort/2);
        System.out.println("myNewShort = " + myNewShort);
        //long has a width of 64
        long myLong = 100L;
        long myNewLong = (long) (myLong/2);
        System.out.println("myNewLong = " + myNewLong);

        //----------------------------------------
        System.out.println("        New calculations.");
        byte myNewByteValue = 10;
        short myNewShortValue = 20;
        int myNewIntValue = 50;
        long myNewLongValue = 50000L + 10L*( myNewByteValue+myNewShortValue+myNewIntValue);
        System.out.println("My long value = " + myNewLongValue);
    }

}
