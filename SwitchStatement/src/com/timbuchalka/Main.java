package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
/*	int value = 1;
	if (value==1) {
        System.out.println("value was 1");
    } else if(value ==2) {
        System.out.println("Value was 2");
    } else {
        System.out.println("Value was not 1 or 2");
    }*/

    int switchValue = 3;
	switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Value was 3 or 4 or 5");
            System.out.println("Actually it was " + switchValue);
            break;
        default:
            System.out.println("Value was not 1 or 2");
            break;
    }

    char symbol = 'C';
	switch (symbol) {
        case 'A':
            System.out.println("A");
            break;
        case 'B':
            System.out.println("B");
            break;
        case 'C':
            System.out.println("C");
            break;
        case 'D':
            System.out.println("D");
            break;
        case 'E':
            System.out.println("E");
            break;
        default:
            System.out.println("Not found.");
            break;
    }

    String month = "JaNuary";
	switch (month.toLowerCase()) {
        case "january":
            System.out.println("Jan");
            break;
        case "february":
            System.out.println("Feb");
            break;
        default:
            System.out.println("Not sure.");
    }

    }
}
