package in.sp.beans;

public class Address {
    private String houseno;
    private String city;
    private String pincode;
    
    public Address(String houseno, String city, String pincode) {
    	this.houseno = houseno;
    	this.city = city;
    	this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
    }
}