package HolaMundo;

import java.util.Scanner;

public class CajaFuerteBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		* 7. Realiza el control de acceso a una caja fuerte. La combinación
		* será un número de 4 cifras. El programa nos pedirá la combinación
		* para abrirla. Si no acertamos, se nos mostrará el mensaje
		* “Lo siento, esa no es la combinación” y si acertamos se nos dirá
		* “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
		* oportunidades para abrir la caja fuerte.
		*
		* @author Luis José Sánchez
		*/
		
		
		int combinacion = 6575;
		int intento = 0;
		int numeroIntroducido;
		Scanner sc = new Scanner(System.in);
			
		do {
			System.out.println("Introduzca un numero de 4 cifras:");
			intento++;
			numeroIntroducido = sc.nextInt();
			
			if(numeroIntroducido == combinacion) {
				System.out.println("Enhorabuena ha introducido la clave correcta en el intento nº " + intento );
			}else {
				System.out.println("intento numero: "+ intento);
				System.out.println("Vuelva a intentarlo");
				
			}
					
		}while(intento<4 && numeroIntroducido != combinacion);
		if(intento == 4 && numeroIntroducido != combinacion) {
			System.out.println("Ha agotado los intentos");
		}
		

	}

}
