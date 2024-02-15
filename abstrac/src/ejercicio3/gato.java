package ejercicio3;

public class gato extends animal{

	private String frase;

	public gato() {

	}

	public String hacerSonido() {
		frase = "MIAU ";
		return frase;
	}

	public String moverse() {
		frase = "el gato se esta moviendo";
		return frase;
	}

}
