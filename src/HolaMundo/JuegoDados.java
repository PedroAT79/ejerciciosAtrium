package HolaMundo;

public class JuegoDados {

	/***
	 * Escribe un programa que simule la tirada de dos dados. El programa deberá
		continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
		dados tengan el mismo valor.
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dado1=0;
		int dado2=0;
		int jugada = 0;
		
		do {
			jugada++;
			dado1 = (int)(Math.random()*6)+1;
			
			dado2 = (int)(Math.random()*6)+1;
			System.out.println("Jugada "+ jugada + "= Dado1: " +dado1 + " Dado2: " + dado2);
			
			
		}while(dado1 !=dado2);
		
		
	}

}
