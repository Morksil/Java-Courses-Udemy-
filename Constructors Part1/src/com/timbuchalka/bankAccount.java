package com.timbuchalka;

public class bankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount() {
        this(1332, 20000, "Andrzejoe","ada@gmail.com","456-789-789");
        System.out.println("Empty constructor called.");
    }
    public bankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber) {
        System.out.println("Konstruktor z parametrami został wywołany");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void incrementBalance(int value) {
        System.out.println("Dorzucono do konta" + value);
        this.balance+=value;
        System.out.println("teraz jest tam " + this.balance);
    }

    public void withdrawMoney(int value) {
        System.out.println("Wyrazono chec wyplacenia z konta " + value);
        if(this.balance > value) {
            this.balance-=value;
            System.out.println("Na koncie jest " + this.balance +" po wyplacie.");
        }else {
            System.out.println("not enough money to withdraw");
        }
    }
}
