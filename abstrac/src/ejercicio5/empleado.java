package ejercicio5;

public abstract class empleado {
	private int horasT;
	private double sueldoPorHora;
	private double complementos;
	private double irpf;

	public empleado(int horasT,double sueldoPorHora,double complementos,double irpf) {
		this.horasT=horasT;
		this.sueldoPorHora=sueldoPorHora;
		this.complementos=complementos;
		this.irpf=irpf;
	}
	
    public int getHorasT() {
		return horasT;
	}
	public double getSueldoPorHora() {
		return sueldoPorHora;
	}
	public double getComplementos() {
		return complementos;
	}
	public double getIrpf() {
		return irpf/100;
	}

public abstract void calcularSalario();
}
