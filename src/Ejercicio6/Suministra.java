package Ejercicio6;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import APPmain.connectionBase;

public class Suministra {
	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + ""
					+ "(CodigoPieza INT, IdProveedor CHAR(4), Precio INT, FOREIGN KEY (CodigoPieza) REFERENCES Piezas(ID), FOREIGN KEY (IdProveedor) REFERENCES Proveedores(ID))";
			Statement st = connectionBase.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String table_name, Integer CodigoPieza , String IdProveedor, Integer Precio) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (CodigoPieza, IdProveedor, Precio) VALUE(" 
					+ "\"" + CodigoPieza + "\"," 
					+ "\"" + IdProveedor + "\"," 
					+ "\"" + Precio + "\"); ";
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
				System.out.println("CodigoPieza: " + resultSet.getString("CodigoPieza") + " " 
						+ "IdProveedor: "+ resultSet.getString("IdProveedor") + " " 
						+ "Precio: " + resultSet.getString("Precio") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}
}
