package ventas;

public class Ventas {

	String cliente;
	int codProducto;
	int uniVendidas;
	double precio;
	
	public Ventas(String cliente, int codProducto, int uniVendidas, double precio) {
		this.cliente = cliente;
		this.codProducto = codProducto;
		this.uniVendidas = uniVendidas;
		this.precio = precio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public int getUniVendidas() {
		return uniVendidas;
	}

	public void setUniVendidas(int uniVendidas) {
		this.uniVendidas = uniVendidas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ventas [cliente=" + cliente + ", codProducto=" + codProducto + ", uniVendidas=" + uniVendidas
				+ ", precio=" + precio + "]";
	}
	

}
