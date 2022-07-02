package HolaMundo;

import java.util.Scanner;

public class HoraDelDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora;
		String saludo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una hora del dia: ");
		hora = sc.nextInt();
		switch(hora) {
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			saludo = "Buenos dias.";
		break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			saludo = "Buenas tardes.";
			break;
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			saludo = "Buenas noches.";
		break;
		default:
			saludo = "No sabe en la hora que vive!!";
		}
		
		System.out.println(saludo);
		

	}

}
