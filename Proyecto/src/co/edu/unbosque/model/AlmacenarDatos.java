package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Collections;

import co.edu.unbosque.view.View;

public class AlmacenarDatos {


	private ArrayList<String>datos;
	public ArrayList<String>totalMes;
	private View gui;



	public AlmacenarDatos() {

		datos = new ArrayList<String>();
		totalMes = new ArrayList<String>();
		gui=new View();
		
		
	}
	

	public void insertarNumero(String n ) {
		
		String[] separado= n.split("   ");

		for(String almacena : separado){
			
		
			System.out.println("Los elementos almacenados de forma separada son : "+almacena);
			
			datos.add(new String (almacena));
		    
		
			
		}
		
	
	
		System.out.println("Imprimiendo desde almacenar "+datos.size());
		
		
	}

	
	
	

	

	public void ventasMes() {
		
	  
	  int a = 11;
	  int b=0;
	  float operacion1 = 0;
	  float operacion2 = 0;
	  for (int n = 0 ;n<4;a++) {
		  
		  	
		  	b=a+2;

			float n1 = Float.valueOf(datos.get(a));
			
			float n2 = Float.valueOf(datos.get(b));
			
			 operacion1=n1*n2;
			 String op2 = Float.toString(operacion1);
			 totalMes.add(op2);
			
			a=a+7;
			n++;
			System.out.println("operare los siguientes valores"+n1+"  *  "+n2+"  =  "+operacion1);
			
			//String op2 = Float.toString(operacion1);
			//totalMes.add(op2);
			
			
	  }

		   System.out.println("Viendo tamaño arreglo desde ventas del mes "+datos.size());
		    
	  
		
	}
	
	
	
	public void buscarFactura( ) {
		
		String busqueda=gui.pedirDato();
		
		int posicion = datos.indexOf(busqueda);

		if (posicion >= 0) {
		
		  System.out.println("La factura de id : " + busqueda +"\n"+"Tiene la descripcion de producto :"+datos.get(posicion+2));

		}else {
		
		  System.out.println("El elemento " + busqueda + " NO está en la lista");
	
		}
	
	}
	
  public void totalVentas() {

	  double suma=0;
	  
	  for(int i=0;i<totalMes.size();i++){ 
		    Float valor =null;
		   
		        valor =  Float.valueOf(totalMes.get(i));
		   
		    suma+=valor;
		
	  }
	  System.out.println("El valor total de ventas es  : "+suma);
	  
	  }
	  


	public ArrayList<String> getTotalMes() {
		return totalMes;
	}
	
	
	public void setTotalMes(ArrayList<String> totalMes) {
		this.totalMes = totalMes;
	}

	public ArrayList<String> getDatos() {
		return datos;
	}


	public void setDatos(ArrayList<String> datos) {
		this.datos = datos;
	}


}
