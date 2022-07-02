package HolaMundo;

import java.util.Scanner;

public class CalculoDeNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1;
		float nota2;
		
		System.out.println("Introduzca la nota que ha sacado en el primer examen: ");
		Scanner sc = new Scanner(System.in);
		nota1 = sc.nextFloat();
		
		nota2 = (float)(5 - (nota1*0.4f))/0.6f;
		
		System.out.println("La nota necesaria en el segundo examen es: " + nota2);
		

	}

}
