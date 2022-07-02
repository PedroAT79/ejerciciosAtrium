package HolaMundo;

import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float precioSinIva;
	float precioConIva;
	float iva = 0.21f;
	
	
	System.out.println("Introduzca el importe correspondiente a la base imponible ( precio sin IVA):");
	Scanner sc = new Scanner(System.in);
	precioSinIva = sc.nextFloat();
	precioConIva = precioSinIva*(1+iva);
	
	System.out.println("Base Imponible: " + precioSinIva);
	System.out.println("El precio con IVA es: " + precioConIva + "Euros");
	System.out.println("El Cantidad correspondiente al IVA aplicado es: " + (precioSinIva*iva )+ "Euros");
	
	
	
	
	
	
		
	}

}
