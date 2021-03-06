package EJERCICIO1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import APPmain.connectionBase;

public class Articulos {
		

	//METODO QUE CREA TABLAS MYSQL
	public static void createTable(String db,String name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);
			
			String Query = "CREATE TABLE "+name+""
					+ "(ID INT PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR(100), Precio INT, Fabricante INT, FOREIGN KEY (Fabricante) REFERENCES Fabricantes(ID))";
			Statement st= connectionBase.conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada con exito!");
			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
			System.out.println("Error creando tabla.");
			
		}
		
	}
	
	//METODO QUE INSERTA DATOS EN TABLAS MYSQL
	public static void insertData(String db, String table_name, String name, Integer Precio, Integer Fabricante) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "INSERT INTO " + table_name + " (Nombre, Precio, Fabricante) VALUE(" 
					+ "\"" + name + "\","
					+ "\"" + Precio + "\","
					+ "\"" + Fabricante + "\"); ";
			Statement st = connectionBase.conexion.createStatement();
			st.executeUpdate(Query);
			
			System.out.println("Datos almacenados correctamente");;
			
		} catch (SQLException ex ) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
		}
					
	}
	
	//METODO QUE OBTIENE VALORES MYSQL
	public static void getValues(String db, String table_name) {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= connectionBase.conexion.createStatement();
			stdb.executeUpdate(Querydb);
						
			String Query = "SELECT * FROM " + table_name;
			Statement st = connectionBase.conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);
			
			while (resultSet.next()) {
				System.out.println("ID: " +  resultSet.getString("ID") + " "
						+ "Nombre: " +  resultSet.getString("Nombre") + " "
						+ "Precio: " +  resultSet.getString("Precio") + " "
						+ "Fabricante: " +  resultSet.getString("Fabricante") + " "
						);
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
	
	}
	 
	
	

}