package Modelos;

public class Categorias {
	private int idCategoria;
	private String nombre;
	
	public Categorias(int idcategoria, String nombre) {
		super();
		this.idCategoria = idcategoria;
		this.nombre = nombre;
	}

	public Categorias() {
		super();
	}

	public int getIdcategoria() {
		return idCategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idCategoria = idcategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categorias [idcategoria=" + idCategoria + ", nombre=" + nombre + "]";
	}
	
	

}
