package ejercicio3;

public class uso_gatoperro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal perro = new perro();
animal gato = new gato();

System.out.println("SONIDO Y MOVIMIENTO DEL PERRO:\n"+perro.moverse()+"\n"+perro.hacerSonido()+"\n");
System.out.println("SONIDO Y MOVIMIENTO DEL GATO:\n"+gato.moverse()+"\n"+gato.hacerSonido());

	}

}
