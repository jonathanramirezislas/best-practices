package abstractFactory.inter.impl;

import abstractFactory.inter.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST{

	@Override
	public void leerURL(String url) {
		System.out.println("AREA NO ELEGIDA");
	}

}
