package ejercicio1;

public class uso_recCir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		figura circulo = new circulo(9);
		figura rectangulo = new rectangulo(3,4);
		System.out.printf("El area del circulo es: %1.2f",circulo.calcularArea());
		System.out.printf("\nEl area del rectangulo es: "+rectangulo.calcularArea());
	}

}
