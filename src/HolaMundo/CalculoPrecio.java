package HolaMundo;

import java.util.Scanner;

public class CalculoPrecio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		* Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
		*
		* Capítulo 4. Sentencia condicional.
		*
		* 23. Escribe un programa que calcule el precio final de un producto según su
		* base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
		* reducido o superreducido) y el código promocional. Los tipos de IVA general,
		* reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
		* promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
		* respectivamente que no se aplica promoción, el precio se reduce a la mitad,
		* se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
		* si se muestran los valores correctos, aunque los números no estén tabulados.
		*
		* Ejemplo:
		* Introduzca la base imponible: 25
		* Introduzca el tipo de IVA (general, reducido o superreducido): reducido
		* Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
		* Base imponible 25.00
		* IVA (10%) 2.50
		* Precio con IVA 27.50
		* * Cód. promo. (mitad): -13.75
		* TOTAL 13.75
		*
		* @author Luis José Sánchez
		*/
		
		float precioBase;
		float ivaAplicable = 0;
		String iva;
		String codigo;
		float precioFinal;
		float descuento = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible:");
		precioBase = sc.nextFloat();
		
		System.out.println("Introduzca el tipo de IVA a aplicar: \ngeneral - reducido - superreducido");
		iva = sc.next();
		
		switch(iva) {
		case "general":
			ivaAplicable = 0.21f*precioBase;
		break;
		
		case "reducido":
			ivaAplicable = 0.1f*precioBase;
		break;
		
		case "superreducido":
			ivaAplicable = 0.04f*precioBase;
		break;
		default:
			System.out.println("Tipo de IVA no soportado, vuelva ha intentarlo de nuevo");
		}
		
		System.out.println("Ahora introduzca el codigo promocional: \n nopro, mitad, meno5 o 5porc");
		codigo = sc.next();
		
		switch(codigo) {
		case "nopro":
			descuento = 0;
		break;
		
		case "mitad":
			descuento = (precioBase + ivaAplicable)/2;
		break;
		
		case "meno5":
			descuento = 5;
			
		break;
		
		case "5porc" :
			descuento = (precioBase + ivaAplicable)*0.05f; 
			
		break;
		default:
			System.out.println("Codigo promocional no valido.");;
				
		}
		
		precioFinal = precioBase + ivaAplicable - descuento;
		
		System.out.println("El precio del producto es:"+ precioFinal + "\n El Iva Aplicable es del tipo " + iva +
				" - cantidad:  " + ivaAplicable + "Euros \n Promocion aplicada es " + codigo + 
				"\n Cantidad reducida por promocion: " + descuento + "Euros."  );
		
		
		
		
		

	}

}
