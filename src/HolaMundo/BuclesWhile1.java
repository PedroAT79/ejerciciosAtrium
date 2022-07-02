package HolaMundo;

import java.util.Scanner;

public class BuclesWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		* Bucle while que termina cuando se introduce por teclado un
		* número negativo.
		*
		* @author Luis José Sánchez
		*/
		
		int numero = 0;
		int contador = 0;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numeros y pulse intro:");
		System.out.println("Introduzca un numero:");
		while(numero>=0) {
			numero = sc.nextInt();
			contador++;
			suma += numero;	
			
		}
		System.out.println("Has introducido un numero negativo, " + numero + " y " + (contador-1) + " numeros positivos.");
		System.out.println("La suma total de los numeros positivos es: " + (suma-numero));
		
		
	}

}
