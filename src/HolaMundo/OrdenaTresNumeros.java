package HolaMundo;

import java.util.Scanner;

public class OrdenaTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux;
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 3 numeros enteros");
		System.out.println("Introduce primer numero:");
		a = sc.nextInt();
		
		System.out.println("Introduce segundo numero:");
		b = sc.nextInt();
		
		System.out.println("Introduce tercer numero:");
		c = sc.nextInt();
		
		if(a>b) {
			aux = a;
			a = b;
			b = aux;
			
		}
		
		if(b>c) {
			aux = b;
			b = c;
			c = aux;
		}
		
		if(a>b) {
			aux = a;
			a = b;
			b = aux;
		}
		
		System.out.println("Los numeros ordenados de mayor a menor son: " + a+ " - "  + b+  " - " + c );;
				

	}

}
