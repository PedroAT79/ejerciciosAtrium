package HolaMundo;

import java.util.Scanner;

public class OpcionesPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacion;
		int opcion;
		String opcion1;
		float numero1;
		float numero2;
		
				
		System.out.println("Introduzca una opcion: 1 para sumar/restar/multiplicar/dividir, 2 para calcular area de rectangulo, 3 Area de triangulo:");
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
		if(opcion == 1) {
			System.out.println("Introduzca S para sumar, R para restar, M para multiplicar o D para dividir");
			opcion1 = sc.next();
			if(opcion1.equals("s") || opcion1.equals("S") ) {
				System.out.println("Introduce el primer sumando: ");
				numero1 = sc.nextFloat();
				System.out.println("Introduce el segundo sumando: ");
				numero2 = sc.nextFloat();
				System.out.println("El resultado de la suma es " + (numero1+numero2));
							
			}else if(opcion1.equals("r") || opcion1.equals("R")) {
				
				System.out.println("Introduce el primer numero: ");
				numero1 = sc.nextFloat();
				System.out.println("Introduce el segundo numero: ");
				numero2 = sc.nextFloat();
				System.out.println("El resultado de la resta es " + (numero1 -numero2));
				
			}else if (opcion1.equals("m") || opcion1.equals("M")){
				System.out.println("Introduce el primer numero: ");
				numero1 = sc.nextFloat();
				System.out.println("Introduce el segundo numero: ");
				numero2 = sc.nextFloat();
				System.out.println("El resultado de la multiplicacion es " + (numero1  * numero2));
					
				
			}else if (opcion1.equals("D") || opcion1.equals("d")){
				System.out.println("Introduce el primer numero: ");
				numero1 = sc.nextFloat();
				System.out.println("Introduce el segundo numero: ");
				numero2 = sc.nextFloat();
				System.out.println("El resultado de la division es " + (numero1  / numero2));
				
			}
		}else if(opcion == 2) {
				System.out.println("Introduzca la longitud de un lado:");
				numero1 = sc.nextFloat();
				System.out.println("Introduzca la longitud del otro lado:");
				numero2 = sc.nextFloat();
				 float areaRect = numero1*numero2;
				 System.out.println("El area del rectangulo es: " + areaRect);
						
			
		}else if(opcion == 3) {
			System.out.println("Introduzca la base del triangulo: ");
			numero1 = sc.nextFloat();
			System.out.println("Introduzca la altura del triangulo:");
			numero2 = sc.nextFloat();
			 float areaTriangulo = (numero1*numero2)/2;
			 System.out.println("El area del rectangulo es: " + areaTriangulo);
					
			
			
		}else {
			System.out.println("No ha elegido ninguna opcion");
		}
		
		

	}

}
