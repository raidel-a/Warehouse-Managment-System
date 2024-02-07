package things;

public class Address {

    //---------------------------------------------------
    // instance variables
    //---------------------------------------------------

    private String addressName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    //---------------------------------------------------
    // constructor
    //---------------------------------------------------


    public Address(String addressName, String streetAddress, String city, String state, String zipCode) {
        this.addressName = addressName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //---------------------------------------------------
    // setter and getters methods
    //---------------------------------------------------


    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //---------------------------------------------------
    // utility methods
    //---------------------------------------------------
    public void showInfo(){
        System.out.println(addressName);
        System.out.println(streetAddress);
        System.out.println(city  + ", " + state + " " + zipCode);
    }

}
