package abstractFactory;

import abstractFactory.inter.FabricaAbstracta;
import abstractFactory.inter.IConexionBD;
import abstractFactory.inter.IConexionREST;
import abstractFactory.inter.impl.ConexionMySQL;
import abstractFactory.inter.impl.ConexionOracle;
import abstractFactory.inter.impl.ConexionPostgreSQL;
import abstractFactory.inter.impl.ConexionSQLServer;
import abstractFactory.inter.impl.ConexionVacia;

public class ConexionBDFabrica implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
