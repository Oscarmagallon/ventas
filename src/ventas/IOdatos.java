package ventas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOdatos {
	public static void guardarDatos(String rutaFichero, Ventas vVentas[]) {
		
		File f = new File(rutaFichero);
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f);
				DataOutputStream escribir = new DataOutputStream(fo)){
			
			for (Ventas v : vVentas) {
				if (v !=null) {
					escribir.writeUTF(v.getCliente());
					escribir.writeInt(v.getUniVendidas());
					escribir.writeInt(v.getCodProducto());
					escribir.writeDouble(v.getPrecio());
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Has terminado de leer");
			}
		
		
	}

	public static Ventas[] cargarDatos(String rutaFichero) {
		
		Ventas[] vector = new Ventas[10];
		
		int cont=0;
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try (FileInputStream fi = new FileInputStream(f);
				DataInputStream leer = new DataInputStream(fi) ){
			
			while (true) {
				String nombre_Cliente=leer.readUTF();
				int cod_prod=leer.readInt();
				int unidades_ven=leer.readInt();
				double precio_uni=leer.readDouble();
				
				Ventas v = new Ventas(nombre_Cliente, cod_prod, unidades_ven, precio_uni);
				
				vector[cont] = v;
				
				cont++;
			}
			
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		return vector;
	}

	
}