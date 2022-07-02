package HolaMundo;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int numero;
		int contadorDivisibles = 0;
		int contadorNoDiv = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		numero = sc.nextInt();
		
		for(int i=2; i<=numero-1; i++) {
			if(numero%i!=0) {
				contadorNoDiv++;
				
			}else {
				contadorDivisibles++;
			}
			
		}
		if(contadorDivisibles !=0) {
			System.out.println("Numero divisible");
			System.out.println("Divisible entre " + contadorDivisibles + " numeros primos");
		}else {
			System.out.println("Numero primo");
		}
		
	}	

}
