package inmutableobject;
public final class Employee {
    private final int id;
    private final String name;
    private final Adress adress;

    public Employee(int id, String name, Adress adress) {
            super();
            this.id = id;
            this.name = name;
                        //protect some could change the adress
            this.adress = new Adress(adress.getStreet(),adress.getNumber(),adress.getCity());
        }

    //only getters 
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Adress getAdresss() {    //protect creating a new instance 
        return new Adress(adress.getStreet(), adress.getNumber(), adress.getCity());
    }

    // if some want to change the name we return a new object
    public Employee changeName(String newName) {
        return new Employee(id, newName, adress);
    }
}
