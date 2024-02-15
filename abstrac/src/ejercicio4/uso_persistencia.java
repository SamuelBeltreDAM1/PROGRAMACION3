package ejercicio4;

import javax.swing.JOptionPane;

public class uso_persistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
persistencia archi = new persistenciaArchivos();
persistencia base = new persistenciaBaseDatos();

boolean bucle = false;

while(bucle == false) {
 int op =Integer.parseInt((JOptionPane.showInputDialog(null, "Guardar archivo en el explorador de archivos (PULSE 1)\n"
		+ "Añadir datos en la base de datos (PULSE 2)\n"+"Salir (PULSE 3)")));
 if(op == 1) {
	 String archivo = JOptionPane.showInputDialog("Archivo que quieres guardar");
	 archi.guardarDatos(archivo);
	 archi.mostrarDatos();
 }else if(op == 2) {
	 String datos = JOptionPane.showInputDialog("Informacion que quieres guardar");
	 base.guardarDatos(datos);
	 base.mostrarDatos();
 }else if(op == 3) {
	 JOptionPane.showMessageDialog(null, "Has salido");
	 bucle = true;
 }else {
	 JOptionPane.showMessageDialog(null, "Con este numero no se puede operar");
 }
}
	}

}
