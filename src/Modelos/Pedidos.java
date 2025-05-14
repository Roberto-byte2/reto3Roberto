package Modelos;

import java.util.Date;

public class Pedidos {
	private int idPedidos;
	private Cliente cliente;
	private double precioTotal;
	private String direccionEnvio;
	private Date fecha;
	public Pedidos() {
		super();
	}
	public Pedidos(int idPedidos, Cliente cliente, double precioTotal, String direccionEnvio, Date fecha) {
		super();
		this.idPedidos = idPedidos;
		this.cliente = cliente;
		this.precioTotal = precioTotal;
		this.direccionEnvio = direccionEnvio;
		this.fecha = fecha;
	}
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public String getDireccionEnvio() {
		return direccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Pedidos [idPedidos=" + idPedidos + ", cliente=" + cliente + ", precioTotal=" + precioTotal
				+ ", direccionEnvio=" + direccionEnvio + ", fecha=" + fecha + "]";
	}
	
	
	

}
