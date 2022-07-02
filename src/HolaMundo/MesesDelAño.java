package HolaMundo;

import java.util.Scanner;

public class MesesDelAño {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroMes;
		String nombreMes;
		
		System.out.println("Introduzca el numero del mes que quiere saber:");
		Scanner sc = new Scanner(System.in);
		numeroMes = sc.nextInt();
		
		switch(numeroMes) {
		case 1:
			nombreMes = "Enero";
			break;
		
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
			
		case 4:
			nombreMes = "Abril";
			break;
			
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
			
		case 7:
			nombreMes = "Julio";
			break;
		case 8:	
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes = "no existe ese Mes";
			
		}
		
		System.out.println("El mes " + numeroMes + " es: " + nombreMes);
		
		

	}

}
