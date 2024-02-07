# Warehouse Managment System
### COP3337_Code_Assignment_1

This project is a Java application that simulates a warehouse management system. It includes classes for handling items, warehouses, addresses, and vehicles.

## Project Structure

The project is structured into three main packages:

1. `app`: Contains the main application logic.
2. `places`: Contains classes related to locations such as `Warehouse`.
3. `Vehicle`: Contains classes related to transportation such as `Truck`.

### `app` Package

The `app` package contains the `Controller` class which is the entry point of the application. It includes methods for creating items and adding them to a warehouse, displaying information, and more.

```java
public class Controller {
    public static void main(String[] args) {/*...*/}
    public static void createAddItemToWarehouse(Warehouse warehouse, int numberOfItemsToCreate) {/*...*/}
    public static void yourInfoHeader() {/*...*/}
}
```

### `places` Package

The `places` package includes the `Warehouse` class which represents a warehouse with an address and a list of items. It provides methods for managing the warehouse such as adding items, displaying the address, and more.

```java
public class Warehouse {
    public Warehouse(Address address) {/*...*/}
    public ArrayList<Item> getItems() {/*...*/}
    public Address getAddress() {/*...*/}
    public void displayAddress() {/*...*/}
    public void displayInfo() {/*...*/}
}
```

### `Vehicle` Package

The `Vehicle` package currently contains the `Truck` class. More classes related to transportation can be added to this package in the future.

```java
public class Truck {/*...*/}
```

## Setup

To set up the project, you need to have a Java Development Kit (JDK) installed on your machine. Once you have that, you can clone the project and open it in your preferred IDE.

## Running the Project

To run the project, navigate to the `Controller` class in the `app` package and run the `main` method.

## Contributing

Contributions are welcome. Please fork the project and create a pull request with your changes.

## License

This project is licensed under the MIT License.
