package co.edu.unbosque.model;

public class Operaciones extends AlmacenarDatos{
	
	public void countByStockCode() {
		int code = 1;
		int quantity = 3;
		
		System.out.println("Stock No. "+getDatos().get(code)+"\nUnidades Vendidas: "+getDatos().get(quantity));
		
//		buscarFactura();
	}
	
	public void avgMonthlySales() {
		double avg=0;
		int quantity = 3;
		int pos = getDatos().indexOf(quantity);
		avg = totalVentas() / pos  ;
		
		System.out.println("El promedio de ventas mensuales es: "+avg);
//		return avg;
	}
	
}
