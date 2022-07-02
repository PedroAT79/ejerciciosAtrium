package HolaMundo;

import java.util.Scanner;

public class VolumenCono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Formula de volumen del cono = 1/3 * Pi * r^2 *h
		
		float volumenCono;
		float radio;
		float altura;
		
		
		
		System.out.println("Introduzca el radio del cono:");
		Scanner sc = new Scanner(System.in);
		radio = sc.nextFloat();
		radio = (float) Math.pow(radio, 2);
		System.out.println("Radio^2: " + radio);
		
		System.out.println("Introduzca la altura del cono:");
		altura = sc.nextFloat();
		volumenCono =(float) Math.PI*radio*altura/3;		
		
		System.out.println("El volumen del cono es: " + volumenCono);
		
	}

}
