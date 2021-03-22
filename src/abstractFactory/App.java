package abstractFactory;

import abstractFactory.inter.FabricaAbstracta;
import abstractFactory.inter.IConexionBD;
import abstractFactory.inter.IConexionREST;

public class App {

	public static void main(String[] args) {

		//FrabricaAbastracta fabrica dde fabricas

													/*Fabrica 1*/
		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();


														/*fabrica 2*/
		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
	}

}
