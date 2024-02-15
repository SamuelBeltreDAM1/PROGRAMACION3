package ejercicio2;

public class automovil extends vehiculo{
	
	private String frase;
	
	public automovil() {
		
	}

	public String acelerar() {
		frase = "Automovil acelerando";
		return frase;
	}
	public String frenar() {
		frase = "Automovil frenando";
		return frase;
	}
}
