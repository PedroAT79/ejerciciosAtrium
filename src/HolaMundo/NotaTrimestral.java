package HolaMundo;

import java.util.Scanner;

public class NotaTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		* 4. Sentencia Condicional
		*
		* 21. Calcula la nota de un trimestre de la asignatura Programación. El programa
		* pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
		* Si la media de los dos controles da un número mayor o igual a 5, el alumno
		* está aprobado y se mostrará la media. En caso de que la media sea un número
		* menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
		* se califica como apto o no apto, por tanto se debe preguntar al usuario
		* ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
		* resultado de la recuperación es apto, la nota será un 5; en caso
		* contrario, se mantiene la nota media anterior.
		*
		* Ejemplo 1:
		* Nota del primer control: 7
		* Nota del segundo control: 10
		* Tu nota de Programación es 8.5
		*
		* Ejemplo 2:
		* Nota del primer control: 6
		* Nota del segundo control: 3
		* ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
		* Tu nota de Programación es 5
		*
		* @author Luis José Sánchez
		*/
		
		//Variables:
		float nota1;
		float nota2;
		String nota3;
		float media;
	
		//Scanner:
		Scanner sc = new Scanner(System.in);
		
		//Pregunto la nota de los 2 primeros examenes:
		System.out.println("Introduzca nota del primer examen:");
		nota1 = sc.nextFloat();
		
		System.out.println("Introduzca nota del segundo examen:");
		nota2 = sc.nextFloat();
		
		media = (nota1+nota2)/2;
		
		if(media>=5) {
			System.out.println("Enhorabuena has aprobado el trimestre");
			System.out.println("Tu nota media del trimestre es: " + media);
			
		}else {
			System.out.println("Introduzca la nota del examen de recuperacion:\n apto/no apto");
			nota3 = sc.next();
			if(nota3.equals("apto")) {
				media = 5;
				System.out.println("Has recuperado el trimestre");
				System.out.println("Nota trimestral:" + media);
			}else {
				System.out.println("Has suspendido el trimestre");
			}
		}
		
		

	}

}
