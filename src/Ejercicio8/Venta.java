package Ejercicio8;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import APPmain.connectionBase;

public class Venta {

	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + ""
					+ "(Cajero INT, Maquina INT, Producto INT, FOREIGN KEY (Cajero) REFERENCES Cajeros(ID), FOREIGN KEY (Maquina) REFERENCES Maquinas_registradoras(ID), FOREIGN KEY (Producto) REFERENCES Productos(ID))";
			Statement st = connectionBase.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String table_name, Integer Cajero , Integer Maquina, Integer Producto) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (Cajero, Maquina, Producto) VALUE(" 
					+ "\"" + Cajero + "\"," 
					+ "\"" + Maquina + "\"," 
					+ "\"" + Producto + "\"); ";
			Statement st = connectionBase.conexion.createStatement();
			st.executeUpdate(Query);

			System.out.println("Datos almacenados correctamente");
			;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}

	}

	// METODO QUE OBTIENE VALORES MYSQL
	public static void getValues(String db, String table_name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "SELECT * FROM " + table_name;
			Statement st = connectionBase.conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				System.out.println("Cajero: " + resultSet.getString("Cajero") + " " 
						+ "Maquina: " + resultSet.getString("Maquina") + " " 
						+ "Producto: "+ resultSet.getString("Producto") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}
}
