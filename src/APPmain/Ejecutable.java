package APPmain;

import EJERCICIO1.Articulos;
import EJERCICIO1.Fabricantes;
import Ejercicio2.Departamentos;
import Ejercicio2.Empleados;
import Ejercicio3.Almacenes;
import Ejercicio3.Cajas;
import Ejercicio4.Peliculas;
import Ejercicio4.Salas;
import Ejercicio5.Despachos;
import Ejercicio5.Directores;
import Ejercicio6.Piezas;
import Ejercicio6.Proveedores;
import Ejercicio6.Suministra;
import Ejercicio7.Asignado_A;
import Ejercicio7.Cientificos;
import Ejercicio7.Proyecto;
import Ejercicio8.Cajeros;
import Ejercicio8.Maquinas_registradoras;
import Ejercicio8.Productos;
import Ejercicio8.Venta;
import Ejercicio9.Equipos;
import Ejercicio9.Facultad;
import Ejercicio9.Investigadores;
import Ejercicio9.Reserva;
 

public class Ejecutable {

	public static void main(String[] args) {
		// LLAMADA A METODOS MYSQL
		connectionBase.openConnection();
		
		connectionBase.createDB("Ejercicio1");
		
		
		Fabricantes.createTable("Ejercicio1","Fabricantes");
		Fabricantes.insertData("Ejercicio1","Fabricantes","Mediamarkt");
		Fabricantes.insertData("Ejercicio1","Fabricantes","Pccomponentes");
		Fabricantes.insertData("Ejercicio1","Fabricantes","Coolmod");
		Fabricantes.insertData("Ejercicio1","Fabricantes","Corte Ingles");
		Fabricantes.insertData("Ejercicio1","Fabricantes","InfoSpy");
		Fabricantes.getValues("Ejercicio1","Fabricantes");
		
		
		Articulos.createTable("Ejercicio1","Articulos");
		Articulos.insertData("Ejercicio1","Articulos","Bobina",23,1);
		Articulos.insertData("Ejercicio1","Articulos","Condensador",44,2);
		Articulos.insertData("Ejercicio1","Articulos","Transistor",122,3);
		Articulos.insertData("Ejercicio1","Articulos","Goma de mascar",3000,4);
		Articulos.insertData("Ejercicio1","Articulos","TV",1200,5);
		Articulos.getValues("Ejercicio1","Articulos");
		
		
		connectionBase.createDB("Ejercicio2");

		Departamentos.createTable("Ejercicio2","Departamentos");
		Departamentos.insertData("Ejercicio2","Departamentos","Dep 1",23);
		Departamentos.insertData("Ejercicio2","Departamentos","Dep 2",44);
		Departamentos.insertData("Ejercicio2","Departamentos","Dep 3",122);
		Departamentos.insertData("Ejercicio2","Departamentos","Dep 4",3000);
		Departamentos.insertData("Ejercicio2","Departamentos","Dep 5",1200);
		Departamentos.getValues("Ejercicio2","Departamentos");
		
		
		Empleados.createTable("Ejercicio2","Empleados");
		Empleados.insertData("Ejercicio2","Empleados","12345678","Jose","Tomas",1);
		Empleados.insertData("Ejercicio2","Empleados","81234859","Maria","del carmen",2);
		Empleados.insertData("Ejercicio2","Empleados","59294832","Carlos","Bautista",3);
		Empleados.insertData("Ejercicio2","Empleados","49283479","Paco","Lozano",4);
		Empleados.insertData("Ejercicio2","Empleados","49238466","Ingrid","Lopera",5);
		Empleados.getValues("Ejercicio2","Empleados");
		
		
		connectionBase.createDB("Ejercicio3");

		Almacenes.createTable("Ejercicio3","Almacenes");
		Almacenes.insertData("Ejercicio3","Almacenes","A",200);
		Almacenes.insertData("Ejercicio3","Almacenes","B",100);
		Almacenes.insertData("Ejercicio3","Almacenes","C",500);
		Almacenes.insertData("Ejercicio3","Almacenes","D",150);
		Almacenes.insertData("Ejercicio3","Almacenes","E",120);
		Almacenes.getValues("Ejercicio3","Almacenes");
		
		Cajas.createTable("Ejercicio3","Cajas");
		Cajas.insertData("Ejercicio3","Cajas","ASIFE","Bobinas",20,1);
		Cajas.insertData("Ejercicio3","Cajas","OEIFH","Bobinas",50,2);
		Cajas.insertData("Ejercicio3","Cajas","SOWIR","Bobinas",2000,3);
		Cajas.insertData("Ejercicio3","Cajas","SMCIE","Bobinas",1233,4);
		Cajas.insertData("Ejercicio3","Cajas","RIDKR","Bobinas",70,5);
		Cajas.getValues("Ejercicio3","Cajas");
		
		
		connectionBase.createDB("Ejercicio4");

		Peliculas.createTable("Ejercicio4","Peliculas");
		Peliculas.insertData("Ejercicio4","Peliculas","Mission Impossible",16);
		Peliculas.insertData("Ejercicio4","Peliculas","Minioms",0);
		Peliculas.insertData("Ejercicio4","Peliculas","Frozen",13);
		Peliculas.insertData("Ejercicio4","Peliculas","Excalibur",18);
		Peliculas.insertData("Ejercicio4","Peliculas","Vallhala",18);
		Peliculas.getValues("Ejercicio4","Peliculas");
		
		Salas.createTable("Ejercicio4","Salas");
		Salas.insertData("Ejercicio4","Salas","A",1);
		Salas.insertData("Ejercicio4","Salas","B",2);
		Salas.insertData("Ejercicio4","Salas","C",3);
		Salas.insertData("Ejercicio4","Salas","D",4);
		Salas.insertData("Ejercicio4","Salas","E",5);
		Salas.getValues("Ejercicio4","Salas");

	
		connectionBase.createDB("Ejercicio5");

		Despachos.createTable("Ejercicio5","Despachos");
		Despachos.insertData("Ejercicio5","Despachos",1,15);
		Despachos.insertData("Ejercicio5","Despachos",2,5);
		Despachos.insertData("Ejercicio5","Despachos",3,7);
		Despachos.insertData("Ejercicio5","Despachos",4,4);
		Despachos.insertData("Ejercicio5","Despachos",5,3);
		Despachos.getValues("Ejercicio5","Despachos");
		
		Directores.createTable("Ejercicio5","Directores");
		Directores.insertData("Ejercicio5","Directores","12345678","Alfonoso Lopez","12345678",1);
		Directores.insertData("Ejercicio5","Directores","23488294","Miriam Rodriguez","12345678",1);
		Directores.insertData("Ejercicio5","Directores","92384662","Angel Moro","12345678",1);
		Directores.insertData("Ejercicio5","Directores","12940294","Miguel Blesa","92384662",1);
		Directores.insertData("Ejercicio5","Directores","48928464","Antonio Rato","92384662",1);
		Directores.getValues("Ejercicio5","Directores");
	
		
		connectionBase.createDB("Ejercicio6");

		Piezas.createTable("Ejercicio6","Piezas");
		Piezas.insertData("Ejercicio6","Piezas","Bobina");
		Piezas.insertData("Ejercicio6","Piezas","Transistor");
		Piezas.insertData("Ejercicio6","Piezas","Condensador");
		Piezas.insertData("Ejercicio6","Piezas","TV");
		Piezas.insertData("Ejercicio6","Piezas","Teclado");
		Piezas.getValues("Ejercicio6","Piezas");
		
		Proveedores.createTable("Ejercicio6","Proveedores");
		Proveedores.insertData("Ejercicio6","Proveedores","AAAA","PCcomponentes");
		Proveedores.insertData("Ejercicio6","Proveedores","BBBB","Corte Ingles");
		Proveedores.insertData("Ejercicio6","Proveedores","CCCC","Mediamarkt");
		Proveedores.insertData("Ejercicio6","Proveedores","DDDD","Coolmod");
		Proveedores.insertData("Ejercicio6","Proveedores","RRRR","Amazon");
		Proveedores.getValues("Ejercicio6","Proveedores");
		
		Suministra.createTable("Ejercicio6","Suministra");
		Suministra.insertData("Ejercicio6","Suministra",1,"AAAA",5);
		Suministra.insertData("Ejercicio6","Suministra",2,"BBBB",29);
		Suministra.insertData("Ejercicio6","Suministra",3,"CCCC",54);
		Suministra.insertData("Ejercicio6","Suministra",4,"DDDD",290);
		Suministra.insertData("Ejercicio6","Suministra",5,"RRRR",500);
		Suministra.getValues("Ejercicio6","Suministra");
		
		
		connectionBase.createDB("Ejercicio7");

		Cientificos.createTable("Ejercicio7","Cientificos");
		Cientificos.insertData("Ejercicio7","Cientificos","12345678","Miguel Blesa");
		Cientificos.insertData("Ejercicio7","Cientificos","29482834","Antonio Recio");
		Cientificos.insertData("Ejercicio7","Cientificos","09238472","Judith Becker");
		Cientificos.insertData("Ejercicio7","Cientificos","29846236","Bicho");
		Cientificos.insertData("Ejercicio7","Cientificos","92834652","Raquel");
		Cientificos.getValues("Ejercicio7","Cientificos");
		
		Proyecto.createTable("Ejercicio7","Proyecto");
		Proyecto.insertData("Ejercicio7","Proyecto","AAAA","Manhatan",100);
		Proyecto.insertData("Ejercicio7","Proyecto","BBBB","Pajaro de hierro",500);
		Proyecto.insertData("Ejercicio7","Proyecto","CCCC","Taco",300);
		Proyecto.insertData("Ejercicio7","Proyecto","DDDD","Macarrones",200);
		Proyecto.insertData("Ejercicio7","Proyecto","EEEE","Espaguetis",500);
		Proyecto.getValues("Ejercicio7","Proyecto");
		
		Asignado_A.createTable("Ejercicio7","Asignado_A");
		Asignado_A.insertData("Ejercicio7","Asignado_A","12345678","AAAA");
		Asignado_A.insertData("Ejercicio7","Asignado_A","29482834","BBBB");
		Asignado_A.insertData("Ejercicio7","Asignado_A","09238472","CCCC");
		Asignado_A.insertData("Ejercicio7","Asignado_A","29846236","DDDD");
		Asignado_A.insertData("Ejercicio7","Asignado_A","92834652","EEEE");
		Asignado_A.getValues("Ejercicio7","Asignado_A");
		
		
		connectionBase.createDB("Ejercicio8");

		Cajeros.createTable("Ejercicio8","Cajeros");
		Cajeros.insertData("Ejercicio8","Cajeros","Miguel Blesa");
		Cajeros.insertData("Ejercicio8","Cajeros","Antonio Recio");
		Cajeros.insertData("Ejercicio8","Cajeros","Judith Becker");
		Cajeros.insertData("Ejercicio8","Cajeros","Mariana Rajoi");
		Cajeros.insertData("Ejercicio8","Cajeros","El chorizo de Rato");
		Cajeros.getValues("Ejercicio8","Cajeros");
		
		Productos.createTable("Ejercicio8","Productos");
		Productos.insertData("Ejercicio8","Productos","Bobina",100);
		Productos.insertData("Ejercicio8","Productos","TV",200);
		Productos.insertData("Ejercicio8","Productos","Teclado",150);
		Productos.insertData("Ejercicio8","Productos","Grafica",130);
		Productos.insertData("Ejercicio8","Productos","Cuadro",500);
		Productos.getValues("Ejercicio8","Productos");
		
		Maquinas_registradoras.createTable("Ejercicio8","Maquinas_registradoras");
		Maquinas_registradoras.insertData("Ejercicio8","Maquinas_registradoras",1);
		Maquinas_registradoras.insertData("Ejercicio8","Maquinas_registradoras",2);
		Maquinas_registradoras.insertData("Ejercicio8","Maquinas_registradoras",3);
		Maquinas_registradoras.insertData("Ejercicio8","Maquinas_registradoras",4);
		Maquinas_registradoras.insertData("Ejercicio8","Maquinas_registradoras",5);
		Maquinas_registradoras.getValues("Ejercicio8","Maquinas_registradoras");	
		
		Venta.createTable("Ejercicio8","Venta");
		Venta.insertData("Ejercicio8","Venta",1,1,1);
		Venta.insertData("Ejercicio8","Venta",2,2,2);
		Venta.insertData("Ejercicio8","Venta",3,3,3);
		Venta.insertData("Ejercicio8","Venta",4,4,4);
		Venta.insertData("Ejercicio8","Venta",5,5,5);
		Venta.getValues("Ejercicio8","Venta");
		
		connectionBase.createDB("Ejercicio9");

		Facultad.createTable("Ejercicio9","Facultad");
		Facultad.insertData("Ejercicio9","Facultad","Oxford");
		Facultad.insertData("Ejercicio9","Facultad","Londres");
		Facultad.insertData("Ejercicio9","Facultad","Meet");
		Facultad.insertData("Ejercicio9","Facultad","Nassa");
		Facultad.insertData("Ejercicio9","Facultad","Nothredan");
		Facultad.getValues("Ejercicio9","Facultad");
		
		Investigadores.createTable("Ejercicio9","Investigadores");
		Investigadores.insertData("Ejercicio9","Investigadores","48204629","Lorena Garcia",1);
		Investigadores.insertData("Ejercicio9","Investigadores","12938424","Ingrid Lopez",1);
		Investigadores.insertData("Ejercicio9","Investigadores","23444234","Carlos Sanchez",1);
		Investigadores.insertData("Ejercicio9","Investigadores","66547775","Mariano Carrillo",1);
		Investigadores.insertData("Ejercicio9","Investigadores","98733452","Miguel Gas",1);
		Investigadores.getValues("Ejercicio9","Investigadores");
		
		Equipos.createTable("Ejercicio9","Equipos");
		Equipos.insertData("Ejercicio9","Equipos","1234","Equipo 1",1);
		Equipos.insertData("Ejercicio9","Equipos","1235","Equipo 2",2);
		Equipos.insertData("Ejercicio9","Equipos","1236","Equipo 3",3);
		Equipos.insertData("Ejercicio9","Equipos","1237","Equipo 4",4);
		Equipos.insertData("Ejercicio9","Equipos","1238","Equipo 5",5);
		Equipos.getValues("Ejercicio9","Equipos");	
		
		Reserva.createTable("Ejercicio9","Reserva");
		Reserva.insertData("Ejercicio9","Reserva","48204629","1234","2020-11-02","2020-12-03");
		Reserva.insertData("Ejercicio9","Reserva","12938424","1234","2020-12-02","2021-12-03");
		Reserva.insertData("Ejercicio9","Reserva","23444234","1234","2021-09-02","2020-10-03");
		Reserva.insertData("Ejercicio9","Reserva","66547775","1234","2020-03-02","2020-12-03");
		Reserva.insertData("Ejercicio9","Reserva","98733452","1234","2020-07-02","2021-12-03");
		Reserva.getValues("Ejercicio9","Reserva");
		
		
		
		connectionBase.closeConnection();
	}

	
	
}
