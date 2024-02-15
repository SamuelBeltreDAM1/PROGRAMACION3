package ejercicio4;

import javax.swing.JOptionPane;

public class persistenciaArchivos extends persistencia{

	private String archivo;
	
	public persistenciaArchivos() {
		
	}
	
	public void guardarDatos(String archivo) {
	this.archivo=archivo;
	
	}
	public void mostrarDatos() {
		 JOptionPane.showInternalMessageDialog(null, "se ha guardado este archivo en el explorador de archivos: "+archivo);
	}

}
