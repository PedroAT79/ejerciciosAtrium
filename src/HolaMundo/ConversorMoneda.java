package HolaMundo;

import java.util.Scanner;

public class ConversorMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pesetas;
		float euros;
		int opcion;
		float conversion;
		System.out.println("Pulse 1 para pasar de Euros a Pesestas u otro numero para pasar de Pesetas a Euros:");
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		if(opcion == 1) {
			System.out.println("Introduzca la cantidad de Euros:");
			euros = sc.nextFloat();
			conversion = euros*166.66f;
			conversion = (int)conversion;
			System.out.println("La cantidad en Pesetas de " + euros + "euros = " + conversion);
		}else {
			System.out.println("Introduzca la cantidad de pesetas:");
			pesetas = sc.nextInt();
			conversion = pesetas / 166.66f;
			System.out.println("La cantidad en Euros de " + pesetas + "ptas = " + conversion);
		}
		
		
		
		
		
		

	}

}
