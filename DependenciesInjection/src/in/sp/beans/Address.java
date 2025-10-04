package in.sp.beans;

public class Address {
    private String houseno;
    private String city;
    private String pincode;
    
    // Getters and Setters
    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
    }
}