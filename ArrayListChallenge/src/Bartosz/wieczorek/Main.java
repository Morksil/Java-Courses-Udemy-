package Bartosz.wieczorek;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        mobilePhone.addNewContact(456,"Adam");
        mobilePhone.addNewContact(789,"Ewa");

        mobilePhone.printContacts();

        mobilePhone.modifyContact("Ewa","Ola",456321789);

        mobilePhone.printContacts();
    }
}
