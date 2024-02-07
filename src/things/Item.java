package things;

import java.util.Random;

public class Item {

    //------------------------------
    // class variable
    //------------------------------

    public static final Random randomGenerator = new Random();

    public static int idCounter = 1500;
    private static final String idCode = "ITEM";
    private static String[] classification = {"A", "B", "C", "D", "E", "F", "G", "H"};


    //------------------------------
    // instance variable
    //------------------------------

    private String name;
    private String id;
    protected double price;


    //------------------------------
    // constructors
    //------------------------------

    public Item() {

        name = "General";
        id = idCode +
                "-" +
                classification [randomGenerator.nextInt(classification.length) ] +
                "-" +
                idCounter;

        price = randomGenerator.nextInt(100) + randomGenerator.nextDouble();

        idCounter++;
    }

    public Item(String name,  double price) {

        this();
        this.name = name;
        this.price = price;
    }


    //------------------------------
    // class methods
    //------------------------------

    public static int getIdCounter() {
        return idCounter;
    }

    public static String[] getClassification() {
        return classification;
    }


    //------------------------------
    // instance methods
    //------------------------------

    public static void setClassification(String[] classification) {
        Item.classification = classification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println();
        System.out.printf("name: %-20s \n", name);
        System.out.printf("id: %-20s \n", id);
        System.out.printf("price: %-10.2f \n", price);
        System.out.println();

    }

    //-------------------------------
}//end class
