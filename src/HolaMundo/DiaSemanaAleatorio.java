package HolaMundo;

public class DiaSemanaAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		String dia = null;
		numero = (int) (Math.random()*7)+1;
		
		switch(numero) {
		case 1:
			dia = "Lunes";
		break;
		case 2:
			dia = "Martes";
		break;
		case 3:
			dia = "Miercoles";
		break;
		case 4:
			dia = "Jueves";
		break;
		case 5:
			dia = "Viernes";
		break;
		case 6:
			dia = "Sabado";
		break;
		case 7:
			dia = "Domingo";
		break;
		}
		System.out.println("Numero: " + numero);
		System.out.println("El dia de la semana es:" + dia);

	}

}
