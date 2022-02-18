package co.edu.unbosque.controller;

import co.edu.unbosque.csv.CsvReader;
import co.edu.unbosque.csv.Producto;
import co.edu.unbosque.model.AlmacenarDatos;
import co.edu.unbosque.view.View;

public class Controller {

	private CsvReader lectura;
	private AlmacenarDatos almDatos;
	
	private View gui;
	
	public Controller() {
		
		almDatos=new AlmacenarDatos();
		lectura=new CsvReader();
		gui = new View();
		
	
		funcionar();
		//gui.mostrarResultados(m.procesarDato(gui.pedirDato()));
	}
	
	public void funcionar() {
		
//		int opcion = 0;
//		
//		opcion = gui.leerDatoEntero("Seleccione una opcion"+
//									"\n1.Cargar el Archivo"+
//									"\n2.Total de Ventas"+
//									"\n3.Solicitar detalle de factura"+
//									"\n4.Cantidad de unidades vendidas"+
//									"\n5.Promedio de ventas mensuales"+
//									"\n6.Descripciones");
//		
//		switch (opcion) {
//		case 1: {
//			
//			}
//		case 2: {
//			
//			}
//		case 3: {
//			
//			}
//		case 4: {
//			
//			}
//		case 5: {
//			
//			}
//		case 6: {
//			
//			}	
//		}
//		
	
		
		lectura.main(null);
	
		
		System.out.println("________________________________________________________");
		
		
		//int busqueda=gui.pedirDatoEntero("Ingrese el id");
		
		//String busqueda=gui.pedirDato();
		
		//lectura.setBusqueda(busqueda);
		//almDatos.setBusqueda(busqueda);
		
		


		
	}
	
}
