package places;

import java.util.ArrayList;

import things.Address;
import things.Item;

public class Warehouse {

    //-------------------------------------
    // class variables
    //-------------------------------------
    private static int numberOfWareHouses = 0;

    //-------------------------------------
    // instance variables
    //-------------------------------------
    private ArrayList<Item> items;
    private Address address;


    //-------------------------------------
    // constructors
    //-------------------------------------
    public Warehouse(Address address) {
        this.address = address;
        items = new ArrayList<>();
        numberOfWareHouses++;
    }
    //------------------------------------------------

    public Warehouse(ArrayList<Item> items, Address address) {
        this.items = items;
        this.address = address;
        numberOfWareHouses++;
    }
    //------------------------------------------------

    public static int getNumberOfWareHouses() {
        return numberOfWareHouses;
    }
    //------------------------------------------------

    public static void setNumberOfWareHouses(int numberOfWareHouses) {
        Warehouse.numberOfWareHouses = numberOfWareHouses;
    }
    //------------------------------------------------

    public ArrayList<Item> getItems() {
        return items;
    }
    //------------------------------------------------

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    //------------------------------------------------

    public Address getAddress() {
        return address;
    }
    //------------------------------------------------

    public void setAddress(Address address) {
        this.address = address;
    }

    //------------------------------------------------

    public void displayAddress() {
        System.out.println();
        System.out.println(address.getAddressName());
        System.out.println(address.getStreetAddress());
        System.out.println(address.getCity() + ", " + address.getState() + " " + address.getZipCode());
        System.out.println();
    }

    //------------------------------------------------
    public void displayInfo() {
        displayAddress();
        // STEP 7
        // WRITE YOUR CODE BELOW THIS LINE

        // Define an array of class names (from the Item class)
        String[] classNames = Item.getClassification();

        // Create a basic array of ArrayLists. Each ArrayList will hold the items that belong to a specific class
        ArrayList<Item>[] itemsInClasses = new ArrayList[classNames.length];

        // Initialize each ArrayList in the array
        for (int i = 0; i < itemsInClasses.length; i++) {
            itemsInClasses[i] = new ArrayList<Item>();
        }

        // Loop through all the items in the list
        for (Item item : items) {
            // Get the class type of the current item
            char classType = item.getId().charAt(5);

            // Find the index of the classType in classNames using a simple loop
            int index = -1;
            for (int i = 0; i < classNames.length; i++) {
                if (String.valueOf(classType).equals(classNames[i])) {
                    index = i;
                    break;
                }
            }

            // If the classType is valid, add it to the corresponding ArrayList
            if (index != -1) {
                itemsInClasses[index].add(item);
            }
        }

        // Print the total number of items in the list
        System.out.println("Item count: " + "\t" + items.size());

        // Loop through all the class names
        for (int i = 0; i < classNames.length; i++) {
            // Loop through all the items in this class and print their IDs
            for (Item item : itemsInClasses[i]) {
                System.out.println("\t\t\t" + item.getId());
            }

            // Then print the number of items in this class
            System.out.println("\t\t Classification " + classNames[i] + " count: " + itemsInClasses[i].size());

        }
    }
    //------------------------------------------------
}   //end class