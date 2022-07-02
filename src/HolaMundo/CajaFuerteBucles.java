package HolaMundo;

import java.util.Scanner;

public class CajaFuerteBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		* 7. Realiza el control de acceso a una caja fuerte. La combinaci�n
		* ser� un n�mero de 4 cifras. El programa nos pedir� la combinaci�n
		* para abrirla. Si no acertamos, se nos mostrar� el mensaje
		* �Lo siento, esa no es la combinaci�n� y si acertamos se nos dir�
		* �La caja fuerte se ha abierto satisfactoriamente�. Tendremos cuatro
		* oportunidades para abrir la caja fuerte.
		*
		* @author Luis Jos� S�nchez
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
				System.out.println("Enhorabuena ha introducido la clave correcta en el intento n� " + intento );
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
