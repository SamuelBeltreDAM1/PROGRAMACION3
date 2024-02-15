package ejercicio4;

import javax.swing.JOptionPane;

public class persistenciaBaseDatos extends persistencia{
	
private String archivo;
	
	public persistenciaBaseDatos() {
		
	}
	
	public void guardarDatos(String archivo) {
	this.archivo=archivo;
	
	}
	public void mostrarDatos() {
		 JOptionPane.showInternalMessageDialog(null, "se ha guardado esta informacion en la base de datos: "+archivo);
	}
}
