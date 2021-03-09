package generics;

public class Bill {

    private String name;
    private double value;

    public Bill(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }

}

