package ejercicio2;

public class uso_automoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vehiculo auto = new automovil();
vehiculo moto = new motocicleta();

System.out.println("ACELERACION Y FRENADO DEL AUTOMOVIL:\n"+auto.acelerar()+"\n"+auto.frenar()+"\n");
System.out.println("ACELERACION Y FRENADO DE LA MOTOCICLETA:\n"+moto.acelerar()+"\n"+moto.frenar());
	}

}
