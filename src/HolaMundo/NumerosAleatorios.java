package HolaMundo;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		for(int i=0; i<10; i++) {
			
			numero = (int) (Math.random()*10+1);
			System.out.println(numero);
		}
		

	}

}
