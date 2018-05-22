package Bartosz.wieczorek;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList grocerylist = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocerylist.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        grocerylist.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Please enter current item: ");
        String position = scanner.nextLine();
        System.out.println("Please enter new item: ");
        String newItem = scanner.nextLine();
        grocerylist.modifyGroceryItem(position,newItem);
    }

    public static void removeItem() {
        System.out.println("Please enter name: ");
        String itemNo = scanner.nextLine();
        grocerylist.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Enter the item you want to find in the list: ");
        String position = scanner.nextLine();
        if (grocerylist.onFile(position)) {
            System.out.println("Wanted item: " + position + " is on the list.");
        }else {
            System.out.println("Item" + position +" has not been found.");
        }

    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(grocerylist.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String> (grocerylist.getGroceryList());

        String[] myArray = new String[grocerylist.getGroceryList().size()];
        myArray = grocerylist.getGroceryList().toArray(myArray);

    }



}
