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
		
		String[] separado= n.split("            ");

		for(String almacena : separado){
			
			System.out.println("Los elementos almacenados de forma separada son : "+almacena);
			datos.add(new String (almacena));

		}
		
	
	
		System.out.println("Posicion del arreglo "+datos.size());
		
		
	}

	
	
	

	

	public void ventasMes() {
		
	  
	  int a = 11;
	  int b=0;
	  Float operacion1 ;
	  
	  

	  for (int n = 0 ;n<541909;a++) {
		  
		  	
		  	b=a+2;

			Float n1 = Math.abs(Float.valueOf(datos.get(a)));
			
			Float n2 = Math.abs(Float.valueOf(datos.get(b)));
			
			 operacion1=n1*n2;
			 String op2 = Float.toString(operacion1);
			 totalMes.add(op2);
			
			a=a+7;
			n++;
			
			
			System.out.println("operare los siguientes valores  "+n1+"  *  "+n2+"  =  "+operacion1);
			
	  }


	}
	
	
	
	public String buscarFactura( ) {
		
		String busqueda=gui.pedirDato();
		String res = null;
		
		int posicion = datos.indexOf(busqueda);

		if (posicion >= 0) {
		
		  System.out.println("La factura de id : " + busqueda +"\n"+"Tiene la descripcion de producto :"+datos.get(posicion+2));
		  return res = res +datos.get(posicion+2);
		}else {
		
		  System.out.println("El elemento " + busqueda + " NO está en la lista");
		  return res = res + "El elemento " + busqueda + " NO está en la lista";
		}
	
	}
	
  public double totalVentas() {

	  float suma=0;
	  
	  for(int i=0;i<totalMes.size();i++){ 
		    Float valor =null;
		   
		        valor =  Float.valueOf(totalMes.get(i));
		   
		    suma+=valor;
		
	  }
	  System.out.println("El valor total de ventas es  : "+suma);
	  return suma;
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
