package HolaMundo;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola Mundo");
		
		int a;
		int b;
		
		a =7;
		b = 2;
		
		System.out.println(a+b);
		
		double c;
		double d;
		
		c= 5.22d;
		d= 6.23d;
		double y = c+d;
		
		System.out.println(c+d);
		System.out.println(y);
		
		float g = 4.3f;
		double h= 5.32d;
		
		double x = g + h;
		System.out.println(x);
		
		//Casting:
		
		double div;
		
		div = (double)b / (double)a;
		System.out.println("Resultado de la division: "+div);
		
		float div1;
		
		div1 = (float)b /(float) a; 
		
		System.out.println("Resultado de la division con float: "+ div1);
		
		
		//1- Sumar, Restar, Multiplicar y Dividir:
		
		int k = 144;
		int z = 999;
		
		int suma = k +z;
		int resta = k-z;
		int mult = k* z;
		double division = (double)k/(double)z;
		System.out.println("\nEJERCICIO 1");
		System.out.println("Suma: " +suma);
		System.out.println("Resta: " +resta);
		System.out.println("Multiplicacion: " +mult);
		System.out.println("Division: " +division);
		
		
		//3-Ejercicio
		
		String nombre;
		String direccion;
		int telefono;
		
		nombre = "Pedro";
		direccion = "Avd. San Luis Gonzaga";
		telefono = 686578482;
		System.out.println("\nEjercicio 2:");
		System.out.println("Me llamo " + nombre + " vivo en " + direccion + " y mi numero de telefono es " + telefono);
		
	
		
		
		
		
	}

}
