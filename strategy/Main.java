package strategy;

import strategy.strategy.AntivirusAvanzado;
import strategy.strategy.Contexto;

public class Main {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
