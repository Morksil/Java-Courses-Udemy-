package Bartosz.wieczorek;

public class Contact extends MobilePhone{
    private int phoneNumber;
    private String name;

    public Contact(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
