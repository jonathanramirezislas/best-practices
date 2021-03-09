package inmutableobject;

public class Adress {
    private String street;
    private String number;
    private String city;

    public Adress(String street, String number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" + " street='" + getStreet() + "'" + ", number='" + getNumber() + "'" + ", city='" + getCity() + "'"
                + "}";
    }

}
