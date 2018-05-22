package com.timbuchalka;

public class VipCustomer {

    private String name;
    private double credit;
    private String email;

    public VipCustomer() {
        this("Default name", 5000.0,"default");
    }

    public VipCustomer(String name, double credit) {
        this(name,credit,"default");
    }

    public VipCustomer(String name, double credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}
