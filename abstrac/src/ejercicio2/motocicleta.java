package ejercicio2;

public class motocicleta extends vehiculo {
	private String frase;

	public motocicleta() {

	}

	public String acelerar() {
		frase = "Motocicleta acelerando";
		return frase;
	}

	public String frenar() {
		frase = "Motocicleta frenando";
		return frase;
	}
}
