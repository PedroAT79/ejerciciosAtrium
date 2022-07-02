package HolaMundo;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la tabla de multiplicar que quiere mostrar:");
		numero = sc.nextInt();
		for(int i=0; i<=10; i++) {
			System.out.println(numero + " x " + i +" = " + numero*i);
			
		}
		
		
		
	}

}
