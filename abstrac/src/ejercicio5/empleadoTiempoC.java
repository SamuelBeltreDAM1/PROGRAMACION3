package ejercicio5;

import javax.swing.JOptionPane;

public class empleadoTiempoC extends empleado{
	private double salarioBruto;
	private double salarioNeto;
	
	public empleadoTiempoC(int horasT,double sueldoPorHora,double complementos,double irpf) {
		super(horasT,sueldoPorHora,complementos,irpf);
		
	}
	
	public void calcularSalario() {
		salarioBruto = super.getHorasT()*super.getSueldoPorHora()+super.getComplementos();
		salarioNeto = salarioBruto*(1-super.getIrpf());
		
		JOptionPane.showMessageDialog(null, "SALARIO BRUTO: "+salarioBruto
				+"\nSALARIO NETO (despues del irpf): "+salarioNeto);
	}
}
