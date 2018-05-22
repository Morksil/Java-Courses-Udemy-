package Bartosz.wieczorek;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> mobilePhone = new ArrayList<Contact>();

    public void addNewContact(int phoneNumber,String name) {
        //Contact contact = new Contact(phoneNumber,name);
        mobilePhone.add(new Contact(phoneNumber,name));
    }

    public void printContacts() {
        System.out.println("You have " + mobilePhone.size() + " contacts on your list.");
        for (int i = 0; i< mobilePhone.size(); i++) {
            Contact contact = mobilePhone.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " - " + contact.getPhoneNumber());
        }
    }

    public void modifyContact(String currentName,String newName,int phoneNumber) {
        int position = findItem(currentName);
        if(position >=0) {
            System.out.println("Contact on this position: " + (position+1) + " has been modified.");
            modifyContacts(newName,position,phoneNumber);

        } else {
            System.out.println( currentName + " not found.");
        }
    }

    private void modifyContacts(String name, int position,int phoneNumber) {
        mobilePhone.set(position,new Contact(phoneNumber,name));
    }

    public int findItem(String name) {
        for(int i=0;i<mobilePhone.size();i++) {
            Contact contact = mobilePhone.get(i);
            if(contact.getName().equals(name)) {
                return mobilePhone.indexOf(contact);
            }
        }
        return -1;
    }

}
