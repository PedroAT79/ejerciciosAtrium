package HolaMundo;

import java.util.Scanner;

public class ParODivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();
		
		if(numero%2 == 0)
		{
			System.out.println("El numero introducido es par");
		}
		
		if(numero%5 == 0) {
			System.out.println("El numero introducido es divisible entre 5");
		}
		if(numero%2 != 0 && numero%5!=0) {
			System.out.println("El numero no es divisible entre 2 ni entre 5");
		}
		
		

	}

}
