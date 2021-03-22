package abstractFactory;

import abstractFactory.inter.FabricaAbstracta;
import abstractFactory.inter.IConexionBD;
import abstractFactory.inter.IConexionREST;
import abstractFactory.inter.impl.ConexionRESTCompras;
import abstractFactory.inter.impl.ConexionRESTNoArea;
import abstractFactory.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
