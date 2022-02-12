package co.edu.unbosque.model.csv;

import com.opencsv.bean.CsvBindByName;

public class Producto {
	

	@CsvBindByName(column = "idFactura")
	private int idFactura;
	@CsvBindByName(column = "idProducto")
	private int idProducto;
	@CsvBindByName(column = "descripcion")
	private String descripcion;
	@CsvBindByName(column = "cantidad")
	private int cantidad;
	@CsvBindByName(column = "precioUnitario")
	private double precioUnitario;
	@CsvBindByName(column = "idCliente")
	private String idCliente;
	@CsvBindByName(column = "pais")
	private String pais;
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	public String toString() {
		
		return " idFactura=" + idFactura + 
			   ", idProducto=" + idProducto +
			   ", descripcion=" + descripcion +
			   ", cantidad=" + cantidad +
			   ", precioUnitario=" + precioUnitario + 
			   ", idCliente=" + idCliente + 
			   ", pais=" + pais + "]";
	}
	


	
	
	
	
	
}
