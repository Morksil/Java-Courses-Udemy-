package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000,3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000,4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000,5.0));*/

        for(int i=2; i<9; i++) {
            System.out.println("10,000 at  " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        for(int i=8; i>1; i--) {
            System.out.println("10,000 at  " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        int primeNumbers=0;
        for(int i=50;i<100;i++) {

            if(isPrime(i)==true) {
                primeNumbers++;
                System.out.println("Number "+ i +" is a prime number");
            }

            if (primeNumbers==3) {
                System.out.println("exiting from a loop.");
                break;
            }

        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }
    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for(int i=2;i<= (long) Math.sqrt(n);i++) {
            if(n%i ==0) {
                return false;
            }
        }
        return true;
    }
}
