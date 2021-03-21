package factory.ejemplo;

import factory.PizzaProducto;
import factory.PizzeriaCaliforniaFactory;
import factory.PizzeriaNewYorkFactory;
import factory.PizzeriaZonaAbstractFactory;

public class Main {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();
        PizzaProducto pizza = california.ordenarPizza("queso");
        
        //california
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());
       
       //new york
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());
        
        //california
        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());
        
        //new york
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());
        
        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
