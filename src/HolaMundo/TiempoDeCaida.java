package HolaMundo;

import java.util.Scanner;

public class TiempoDeCaida {

	public static void main(String[] args) {
		
		int altura;
		final float gravedad = 9.81f;
		float tiempo;
		
		System.out.println("Introduzca una altura:");
		Scanner sc = new Scanner(System.in);
		altura = sc.nextInt();
		
		tiempo = (float)Math.sqrt(2*altura/gravedad);
		
		System.out.println("El tiempo caer desde " + altura + " metros es: " + tiempo + "segundos");
	
	
	}
	}
	

