package inmutableobject;

public class Main {
    public static void main(String[] args) {
       Adress adress = new Adress("Lopez","A-524","Aguascalientes");
       Employee employee = new Employee(1, "Jonathan", adress);
       System.out.println("employee adress = "+employee.getAdresss());

       //attempt to change the number adress
        Adress newAdress = employee.getAdresss();
        newAdress.setNumber("100");

        System.out.println("employee adress"+employee.getAdresss());

    }
}
