package Modelos;

public class PedidoProducto {
	private int idPedidoProducto;
	private Pedidos pedidos;
	private Productos productos;
	private int unidadades;
	private double precio;
	


	public PedidoProducto() {
		super();
	}

	public PedidoProducto(int idPedidoProducto, Pedidos pedidos, Productos productos, int unidadades, double precio) {
		super();
		this.idPedidoProducto = idPedidoProducto;
		this.pedidos = pedidos;
		this.productos = productos;
		this.unidadades = unidadades;
		this.precio = precio;
	}

	public int getIdPedidoProducto() {
		return idPedidoProducto;
	}

	public void setIdPedidoProducto(int idPedidoProducto) {
		this.idPedidoProducto = idPedidoProducto;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public int getUnidadades() {
		return unidadades;
	}

	public void setUnidadades(int unidadades) {
		this.unidadades = unidadades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "PedidoProducto [idPedidoProducto=" + idPedidoProducto + ", pedidos=" + pedidos + ", productos="
				+ productos + ", unidadades=" + unidadades + ", precio=" + precio + "]";
	}

	
}
