package Ejercicio5;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import APPmain.connectionBase;

public class Directores {
	
	// METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db, String name) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + name + ""
					+ "(DNI VARCHAR(8) PRIMARY KEY, NomApels VARCHAR(255), DNIJefe VARCHAR(8), Despacho INT, FOREIGN KEY (DNIJefe) REFERENCES Directores(DNI), FOREIGN KEY (Despacho) REFERENCES Despachos(Numero))";
			Statement st = connectionBase.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");

		}

	}

	// METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String table_name, String DNI , String NomApels, String DNIJefe, Integer Despacho) {
		try {
			String Querydb = "USE " + db + ";";
			Statement stdb = connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + table_name + " (DNI, NomApels, DNIJefe, Despacho) VALUE(" 
					+ "\"" + DNI + "\"," 
					+ "\"" + NomApels + "\"," 
					+ "\"" + DNIJefe + "\"," 
					+ "\"" + Despacho + "\"); ";
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
				System.out.println("DNI: " + resultSet.getString("DNI") + " " 
						+ "NomApels: "+ resultSet.getString("NomApels") + " " 
						+ "DNIJefe: " + resultSet.getString("DNIJefe") + " "
						+ "Despacho: " + resultSet.getString("Despacho") + " ");
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}

	}
}
