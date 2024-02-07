package things;

import Vehicle.Truck;

public class Driver {


    private String firstName;
    private String lastName;
    private int age;
    private Truck assignedTruck;


    public Driver(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        assignedTruck = null;
    }


    public Driver(String firstName, String lastName, int age, Truck assignedTruck) {
        this(firstName, lastName, age);
        this.assignedTruck = assignedTruck;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Truck getAssignedTruck() {
        return assignedTruck;
    }

    public void setAssignedTruck(Truck assignedTruck) {
        this.assignedTruck = assignedTruck;
    }


    public void display(){
        String isAssignedTruck ="No";

        if(assignedTruck != null){
            isAssignedTruck = "Yes";
        }//end if

        // USED PRINTF HERE
        // know how it works
        System.out.printf("%s %s \t Age: %d  \t Assigned Truck: %s  \n", firstName, lastName, age, isAssignedTruck);

    }



}//end class
