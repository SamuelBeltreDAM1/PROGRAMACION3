package ejercicio5;

import javax.swing.JOptionPane;

public class uso_empleado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horasT;
		double sueldoPorHora;
		double complementos;
		double irpf;
				
		boolean bucle = false;
		while (bucle == false) {
			int op = Integer.parseInt(
					JOptionPane.showInputDialog("Calcular salario siendo trabajador completo (PULSE 1)\n"
							+ "Calcular salario siendo trabajador parcial (PULSE 2)\n"
							+ "Salir (PULSE 3)"));
			
			if (op == 1) {
				
				horasT = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas trabajadas durante este mes"));
				sueldoPorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Sueldo por hora"));
				complementos = Double.parseDouble(JOptionPane.showInputDialog(null, "Sueldo total de la suma de los complementos salariales que recibes"));
				irpf  = Double.parseDouble(JOptionPane.showInputDialog(null, "Dinero que te quita hacienda(IRPF)"));
				
				empleado empleado1 = new empleadoTiempoC(horasT,sueldoPorHora,complementos,irpf);
				empleado1.calcularSalario();
				
			} else if (op == 2) {
				
				horasT = Integer.parseInt(JOptionPane.showInputDialog(null, "Horas trabajadas durante este mes"));
				sueldoPorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Sueldo por hora"));
				complementos = Double.parseDouble(JOptionPane.showInputDialog(null, "Suma de todos los complementos salariales que recibes"));
				irpf  = Double.parseDouble(JOptionPane.showInputDialog(null, "Dinero que te quita hacienda (IRPF)"));
				
				empleado empleado2 = new empleadoTiempoP(horasT,sueldoPorHora,complementos,irpf);
				empleado2.calcularSalario();

			} else if(op ==3){
				JOptionPane.showMessageDialog(null, "Has salido");
				bucle = true;
			}else {
				JOptionPane.showMessageDialog(null, "No se puede operar con "+op);
			}
		}
	}
}
