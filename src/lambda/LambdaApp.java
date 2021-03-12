package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {

	public void ordernar() {
		List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		lista.add("Code");
		lista.add("Mito");

	
		// Lambda
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

	public void calcular() {
	
		Operacion operacion = (double x, double y) -> (x+y)/2;
		System.out.println(operacion.calcular(2, 3));
	}

	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		//app.ordernar();
		app.calcular();
	}

}
