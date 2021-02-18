package ventas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

		Ventas[] vVentas;
		
		vVentas = IOdatos.cargarDatos("ventas.dat");
	}
	
	
	private static int calcularTotal(Ventas[] vVentas, String Nombre_Cliente) {
		
		int suma= 0;
		
		for (Ventas ventas : vVentas) {
			if (Nombre_Cliente.equalsIgnoreCase(ventas.getCliente())) {
				suma += ventas.getPrecio()*ventas.getUniVendidas();
			}
		}
		
		return suma;
	}
		

	public static int calcularClientes(Ventas[] vVentas, String Nombre_Cliente) {
		
		int cont=0;
		
		
		for (Ventas ventas : vVentas) {
			if (Nombre_Cliente.equalsIgnoreCase(ventas.getCliente())) {
				cont++;
			}
		}
		
		return cont;
	}
	
		}
		


