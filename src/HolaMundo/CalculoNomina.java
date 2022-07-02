package HolaMundo;

import java.util.Scanner;

public class CalculoNomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int horasTotales;
	Scanner sc = new Scanner(System.in);
	int precioHora = 12;
	int precioExtra = 16;
	int salarioMes;
	
	System.out.println("Introduce numero de horas en el mes: ");
	horasTotales = sc.nextInt();
	
	if(horasTotales<=40) {
		
		salarioMes = precioHora*horasTotales;
		System.out.println("El salario semanal: " + salarioMes);
		
	}else {
		
		int horasExtras = horasTotales - 40;
		salarioMes = ((precioHora * 40) + (horasExtras*precioExtra));
		
		System.out.println("Horas extras realizadas: " +  horasExtras);
		System.out.println("El salario semanal con extras incluidas: " + salarioMes);
		
	}
		
	}

}
