package highorder;


import java.util.function.Function;

public class HighApp {

	//delcaracion de funciones
	private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
	private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

						//function as param ,
	public void imprimir(Function<String, String> funcion, String valor) {
		System.out.println(funcion.apply(valor));//execute the funtion that we passed from params with the value from params
	}
	
					//input, output both Strings mostar es una funcion que regresa otra funcion
	public Function<String, String> mostrar(String mensaje) {
		return (String x) -> mensaje + x;//funcion a retornanr
	}
	
	

	public static void main(String[] args) {
		HighApp app = new HighApp();
		app.imprimir(app.convertirMayusculas, "jonathan");
		app.imprimir(app.convertirMinusculas, "JONATHAN");
		
		String rpta = app.mostrar("Hola ").apply("Jona");
		System.out.println(rpta);
		
		
		
	}
}
