package ventas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Ventas[] vVentas = new Ventas[10];
			IOdatos.guardarDatos("ventas.dat");
			
			vVentas = IOdatos.cargarDatos("ventas.dat");
		}
		
		
		private static int calcularTotal(Ventas[] vVentas, String cliente) {
			
			int suma = 0;
			
			for (Ventas ventas : vVentas) {
				if (cliente.equalsIgnoreCase(ventas.getCliente())) {
					suma += ventas.getPrecio()*ventas.getUniVendidas();
				}
			}
			
			return suma;
		}
		
		private static int contarClientes(Ventas[] vVentas, String cliente) {
			
			int total = 0;
			String clientes;
			
			for (Ventas ventas : vVentas) {
				if (ventas.getCliente().equalsIgnoreCase(cliente)) {
					total++;
				}
			}
			
			
			
			return total;
		}
	}


