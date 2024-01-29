package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelo.Articulo;
//Clase que nos crea un CSV a partir de la lista de articulos
public class ControladorCSV {
	
	public void exportarCSV(List<Articulo> articulos) {
		
		try (PrintWriter writer = new PrintWriter(new File("articulos.csv"))) {

			writer.write("ID,Nombre,Descripción,Precio,Stock\n");

			for (Articulo articulo : articulos) {

				writer.write(articulo.getId() + "," + articulo.getNombre() + "," + articulo.getDescripcion() + ","
						+ articulo.getPrecio() + "," + articulo.getCantidad() + "\n");
			}
		
			System.out.println("Exportación a CSV completada correctamente.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}