package HolaMundo;

import java.util.Scanner;

public class AdivinaElNumero {

	/***
	 * 	Escribe un programa que piense un n�mero al azar entre 0 y 100. El usuario debe
		adivinarlo y tiene para ello 5 oportunidades. Despu�s de cada intento fallido,
		el programa dir� cu�ntas oportunidades quedan y si el n�mero introducido es
		menor o mayor que el n�mero secreto.
		 (int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		int numeroIntro = 0;
		int contador =0;
		
		Scanner sc = new Scanner(System.in);
		numero = (int)(Math.random()*(100)+1);
		System.out.println("Numero aleatorio: " + numero);
		
		do {
			contador++;
			System.out.println(contador +"� intento");
			System.out.println("Introduce un numero: ");
			numeroIntro = sc.nextInt();
			if(numeroIntro == numero) {
				System.out.println("Enhorabuena ha acertado!!");
			}else {
				System.out.println("Le quedan " + (5-contador)+ " oportunidades");
			}
			
		}while(numeroIntro != numero && contador<5);
		if(numeroIntro != numero) {
			System.out.println("No ha acertado el numero, lo siento");
		}
		
		
	}

}
