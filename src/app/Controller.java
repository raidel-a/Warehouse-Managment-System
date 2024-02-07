package app;


import Vehicle.Truck;
import places.Warehouse;
import things.Address;
import things.Driver;
import things.Item;
import things.Names;

import java.util.ArrayList;
import java.util.Random;

public class Controller {

    public static void main(String[] args){



        System.out.println("---------------------------------------");
        System.out.println("Step 1");
        System.out.println("---------------------------------------");
        System.out.println();

        // Update the information int the yourInfoHeader() method
        // below with your personal information
        // run your code to make sure your project compiles and runs
        // if it does not run fix it before move on.

        yourInfoHeader();




        System.out.println("---------------------------------------");
        System.out.println("Step 2");
        System.out.println("---------------------------------------");
        System.out.println();

        // Hint: look at the Address UML diagram
        // and the code in the Address class constructor

        // Create and address instance named address1
        // with the following inputs:

        // AddressName -> "FIU South Warehouse"
        // streetAddress -> "11200 SW 8th St"
        // city -> "Miami"
        // state -> "Florida"
        // zipCode -> "33199"

        // WRITE YOUR CODE BELOW THIS LINE

        Address address1 = new Address(
                "FIU South Warehouse",
                "11200 SW 8th St",
                "Miami",
                "Florida",
                "33199"
        );

        address1.showInfo();


        System.out.println("---------------------------------------");
        System.out.println("Step 3");
        System.out.println("---------------------------------------");
        System.out.println();

        //-----------------------------
        // STEP 3
        //-----------------------------
        // creating a Warehouse instance named fiuSouthWarehouse
        // with the address1 instance
        // Hint: look at the UML Diagram and Constructor of the
        //       Warehouse class
        // WRITE YOUR CODE BELOW THIS LINE

        Warehouse fiuSouthWarehouse = new Warehouse(address1);


        // sending a signal to the  fiuNorthWarehouse instance
        // call the displayAddress method on the fiuSouthWarehouse instance
        // WRITE YOUR CODE BELOW THIS LINE

       fiuSouthWarehouse.displayAddress(); // verify address1 was added to south warehouse



        System.out.println("---------------------------------------");
        System.out.println("Step 4");
        System.out.println("---------------------------------------");
        System.out.println();
        // Create and address instance named address2
        // with the following inputs:

        // AddressName -> "FIU North Warehouse"
        // streetAddress -> "3000 NE 151st St"
        // city -> "North Miami Beach",
        // state -> "Florida"
        // zipCode -> "33181"
        // WRITE YOUR CODE BELOW THIS LINE

        Address address2 = new Address(
                "FIU North Warehouse",
                "3000 NE 151st St",
                "North Miami Beach",
                "Florida",
                "33181");

        // creating a Warehouse instance named fiuNorthWarehouse
        // with the address2 instance
        // WRITE YOUR CODE BELOW THIS LINE

        Warehouse fiuNorthWarehouse = new Warehouse(address2);

        // sending a signal to the  fiuNorthWarehouse instance
        // call the displayAddress method on the fiuSouthWarehouse instance
        // WRITE YOUR CODE BELOW THIS LINE

        fiuNorthWarehouse.displayAddress();

        System.out.println("---------------------------------------");
        System.out.println("Step 5");
        System.out.println("---------------------------------------");
        System.out.println();

        // IMPORTANT UNDERSTAND THIS STEP
        // example of using something that is classified as static
        // notice that Warehouse.  <- were are talking to the class here
        // there is one class entity where with instance you can have 0.... n many instance working
        // independently
        // Write the code using println that outputs the number of the warehouse that
        // have been created. Hence look for a static method that can do this
        // WRITE YOUR CODE BELOW THIS LINE

       System.out.println("Number of warehouses created: " + Warehouse.getNumberOfWareHouses());


        System.out.println("---------------------------------------");
        System.out.println("Step 6");
        System.out.println("---------------------------------------");
        System.out.println();
        // Here you are creating some random items and adding them to the fiuNorthWarehouse
        // this is an example of call-by-reference  -> first parameter and call-by-value -> second parameter
        // Question: which entity are you communicating with : instance or class
        // write the code that creates 10 Items and adds them to the fiuNorthWarehouse
        // Hint: Review the UML diagram of the Controller class... you need to call a method here
        //       Review the code of the class to figure it out
        // WRITE YOUR CODE BELOW THIS LINE

        Controller.createAddItemToWarehouse(fiuNorthWarehouse, 10);
        System.out.println("Number of items in North warehouse: " + fiuNorthWarehouse.getItems().size()); //check the items where created and added

        System.out.println("---------------------------------------");
        System.out.println("Step 7");
        System.out.println("---------------------------------------");
        System.out.println();

        // Go to the Warehouse class and write the code for the displayInfo()
        // so it matches the output format of the output given in the instructions.
        // NOTE YOUR ITEM OUTPUT VALUES WILL BE DIFFERENT FROM MINE
        // BECAUSE THEY ARE CREATED RANDOMLY ---> STUDY THE CODE OF THE
        // ITEM CONSTRUCTORS TO UNDERSTAND THIS

        // when you have the coded your the displayInfo() that
        // you think will work... uncomment the code below and run your code
        // if it is not working correctly fix your displayInfo() code

        // CODE TO UNCOMMENT

        fiuNorthWarehouse.displayInfo();


        System.out.println("---------------------------------------");
        System.out.println("Step 8");
        System.out.println("---------------------------------------");
        System.out.println();

        // creating  a Driver instance
        Random rndGen = new Random();
        int firstNameIndex = rndGen.nextInt(Names.firstNames.length);
        int lastNameIndex = rndGen.nextInt(Names.lastNames.length);
        int maxAge = 70;
        int minAge = 20;



        // Use the maxAge and minAge variables to create a
        // random age is between 70-20
        // do not use the nextDouble() on a random instance.
        // Remember that you have rndGen variable still in scope
        // for above
        // Hint: use nextInt() on the rndGen variable
        // WRITE YOUR CODE BELOW THIS LINE

        int age = rndGen.nextInt(maxAge - minAge + 1) + minAge;

        // Now create a new Driver instance named driver1 with the
        // firstNameIndex, lastNameIndex, age
        // Hint: use the firstNameIndex, lastNameIndex with the Name class
        //       to get the random names
        // WRITE YOUR CODE BELOW THIS LINE

        String firstName = Names.firstNames[firstNameIndex];
        String lastName = Names.lastNames[lastNameIndex];

        Driver driver1 = new Driver(firstName, lastName, age);


        System.out.println();

        // Call the display method on the driver1 variable
        // WRITE YOUR CODE BELOW THIS LINE

        driver1.display();


        System.out.println("---------------------------------------");
        System.out.println("Step 9");
        System.out.println("---------------------------------------");
        System.out.println();

        // Create a Truck instance named truck1 using the
        // driver1 variable and a load capacity of 5
        // WRITE YOUR CODE BELOW THIS LINE

        Truck truck1 = new Truck(driver1, 5);

        // Call the display method on the driver1 variable
        // WRITE YOUR CODE BELOW THIS LINE

        driver1.display();

        System.out.println("---------------------------------------");
        System.out.println("Step 10");
        System.out.println("---------------------------------------");
        System.out.println();

        // Load truck1 with 7 items from fiuNorthWarehouse
        // You need to write the loadTruck() method in the truck1 first

        // WRITE YOUR CODE BELOW THIS LINE

        truck1.loadTruck(fiuNorthWarehouse, 7);
        //Load truck1 with 5 items from fiuNorthWarehouse
        truck1.loadTruck(fiuNorthWarehouse,5);

        System.out.println("---------------------------------------");
        System.out.println("Step 11");
        System.out.println("---------------------------------------");
        System.out.println();

        // Call the displayInfo method on fiuNorthWarehouse variable
        // WRITE YOUR CODE BELOW THIS LINE

        fiuNorthWarehouse.displayInfo();
        System.out.println();

        // Call the displayCargo method on truck1 variable
        // WRITE YOUR CODE BELOW THIS LINE

        truck1.displayCargo();

        System.out.println("---------------------------------------");
        System.out.println("Step 12");
        System.out.println("---------------------------------------");
        System.out.println();

        // Unload the truck1 to the fiuSouthWarehouse
        // look at the UML diagram for a method in truck class to do this
        // You need to write the code for this method in the truck class
        // the method shell is already there
        // WRITE YOUR CODE BELOW THIS LINE

        truck1.unloadTruck(fiuSouthWarehouse);

        // Call the displayCargo method on the truck1 variable
        // WRITE YOUR CODE BELOW THIS LINE

        truck1.displayCargo();

        // Call the displayInfo method on the fiuSouthWarehouse variable
        // WRITE YOUR CODE BELOW THIS LINE

        fiuSouthWarehouse.displayInfo();

        System.out.println("---------------------------------------");
        System.out.println("Step 13");
        System.out.println("---------------------------------------");
        System.out.println();

        // Load truck1 with 5 items from fiuNorthWarehouse
        // WRITE YOUR CODE BELOW THIS LINE

        truck1.loadTruck(fiuNorthWarehouse, 5);

        // Unload the truck1 to the fiuSouthWarehouse
        // WRITE YOUR CODE BELOW THIS LINE

        truck1.unloadTruck(fiuSouthWarehouse);

        // Call the displayInfo method on the fiuSouthWarehouse variable
        // WRITE YOUR CODE BELOW THIS LINE

        fiuSouthWarehouse.displayInfo();

        // Call the displayInfo method on fiuNorthWarehouse variable
        // WRITE YOUR CODE BELOW THIS LINE

        fiuNorthWarehouse.displayInfo();

        // Call the displayCargo method on truck1 variable
        // WRITE YOUR CODE BELOW THIS LINE

        truck1.displayCargo();

    }//end main


    // ------------------------------------------------------

    public static void createAddItemToWarehouse(Warehouse warehouse, int numberOfItemsToCreate){

        for(int i=1; i<= numberOfItemsToCreate; i++){
            Item item = new Item();
            warehouse.getItems().add(item);             // understand this
        }//end for

    }

    // ------------------------------------------------------



    public static void yourInfoHeader(){

        System.out.println("======================================");
        System.out.println(" Student Info Header");
        System.out.println("======================================");
        System.out.println("PROGRAMMER: " + "Raidel Almeida");
        System.out.println("PANTHER ID: " + "3932877");
        System.out.println();
        System.out.println("CLASS: \t\t COP3337");
        System.out.println("SECTION: \t " + "RVBB 1238");
        System.out.println("SEMESTER: \t " + "FALL 2023");
        System.out.println("CLASS TIME: \t " + "Online");
        System.out.println();
        System.out.println("ASSIGNMENT:  " + "Coding Assignment  1");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("======================================");
        System.out.println();

    }//end yourInfoHeader

}//end class
