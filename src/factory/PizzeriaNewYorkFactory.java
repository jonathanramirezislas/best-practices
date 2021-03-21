package factory;

import factory.producto.PizzaNewYorkItaliana;
import factory.producto.PizzaNewYorkPepperoni;
import factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
   
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;

        switch (tipo) {

            case "vegetariana":
                producto= new PizzaNewYorkVegetariana();
            break;
        
            case "pepperoni":
                producto= new PizzaNewYorkPepperoni();
                break;

            case "italiana":
                producto= new PizzaNewYorkItaliana();
                break;

            default:
                producto= null;
                break;
        }
        return producto;
        /* JAVA 13+*/
        // return switch (tipo) {
        //     case "vegetariana" -> new PizzaNewYorkVegetariana();
        //     case "pepperoni" -> new PizzaNewYorkPepperoni();
        //     case "italiana" -> new PizzaNewYorkItaliana();
        //     default -> null;
        // };

    }
}
