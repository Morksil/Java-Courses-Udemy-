package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	int count = 0;
	while(count!=5){
        System.out.println("Count value is " + count);
        count++;
    }
    count=0;
    while(true) {
	    if(count==5){
	        break;
        }
        System.out.println("Count valuse is " + count);
        count++;
    }

    count=1;
    do {
        System.out.println("Count value is " + count);
        count++;
    }while(count!=6);
    }
}
