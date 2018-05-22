package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
/*        bankAccount person = new bankAccount();
        person.setAccountNumber(12345);
        person.setCustomerName("Andrzej");
        person.setEmail("Bartosz.wieczorek1993@gmail.com");
        person.setPhoneNumber("654 789 123");
        person.setBalance(20000);

        System.out.println("person account balance is: " + person.getBalance());
        person.incrementBalance(2500);
        System.out.println("person account balance is: " + person.getBalance());
        person.withdrawMoney(50000);

        bankAccount person2=new bankAccount(987654,15000,"Janus","janusz.wie@gmail.com","654-789-123");
        System.out.println("person2 account balance is: " + person2.getBalance());
        person2.incrementBalance(2000);
        System.out.println("person2 account balance is: " + person2.getBalance());
        person2.withdrawMoney(10000);
        System.out.println("person2 account balance is: " + person2.getBalance());

        bankAccount person3=new bankAccount();
        System.out.println(person3.getBalance());
        System.out.println(person3.getAccountNumber());
        System.out.println(person3.getCustomerName());
        System.out.println(person3.getEmail());
        System.out.println(person3.getPhoneNumber());*/

        VipCustomer customer1 = new VipCustomer();
        System.out.println("First customers name: " + customer1.getName() + " credit limit: "+ customer1.getCredit() + " email: " + customer1.getEmail());

        VipCustomer customer2 = new VipCustomer("John", 5600);
        System.out.println("First customers name: " + customer2.getName() + " credit limit: "+ customer2.getCredit() + " email: " + customer2.getEmail());

        VipCustomer customer3 = new VipCustomer("Bartek",10000,"bartosz.wieczorek1993@gmail.com");
        System.out.println("First customers name: " + customer3.getName() + " credit limit: "+ customer3.getCredit() + " email: " + customer3.getEmail());


    }
}
