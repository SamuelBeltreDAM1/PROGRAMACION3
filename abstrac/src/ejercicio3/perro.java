package ejercicio3;

public class perro extends animal {

	private String frase;

	public perro() {

	}

	public String hacerSonido() {
		frase = "GUAU GUAU";
		return frase;
	}

	public String moverse() {
		frase = "el perro se esta moviendo";
		return frase;
	}
}
