package HolaMundo;

import java.util.Scanner;

public class JuegoBuscaMinas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	//Creo tablero de juego de 4 filas x 5 columnas:
		
		int posicionVacia = 0;
		Scanner sc = new Scanner(System.in);
		int posicionY;
		int posicionX;
		int jugada = 6;
		
		
		int[][] tablero = new int[4][5];
		for(int i=0; i<4; i++) {
			for(int j=0;j<5; j++) {
				tablero[i][j] = posicionVacia;
				/*System.out.println("Posicion:"+(i+1)+"/"+(j+1)+": "+tablero[i][j]);*/
			}
		}
	
	// Creo las posiciones de las minas:
	//Valor de la mina:
		int mina = -1;
		int tesoro = 5 ;
		
	// Creo 5 minas en total con posiciones aleatorias:
		
		int posicionMX =0;
		int posicionMY =0;
		
		int posicionTX =0;
		int posicionTY=0;
		for(int i=0; i<5; i++) {
			posicionMX = (int)(Math.random()*(5));
			posicionMY = (int)(Math.random()*(4));
				
			tablero[posicionMY][posicionMX]= mina;	
			System.out.println("Posicion: "+ posicionMY+ "/"+ posicionMX + "Valor: " + tablero[posicionMY][posicionMX]);
		
			
		}
		
	//Creo el tesoro:
			posicionTX = (int)(Math.random()*(5));
			posicionTY = (int)(Math.random()*(4));
			
			System.out.println("Posicion: "+ posicionTY+ "/"+ posicionTX);
			if(tablero[posicionTY][posicionTX] == mina) {
				posicionTX = (int)(Math.random()*(5));
				posicionTY = (int)(Math.random()*(4));
				tablero[posicionTY][posicionTX] = tesoro;
				System.out.println("Repetimos posicion : "+ posicionTY+ "/"+ posicionTX);
			}else {
				tablero[posicionTY][posicionTX] = tesoro;
			}
	//Creo la jugada:
			
		int intento = 0;
		do {
			System.out.println("Introduzca una posicion eje Y: ");
			posicionY = sc.nextInt();
			
			System.out.println("Introduzca una posicion eje X: ");
			posicionX = sc.nextInt();
			tablero[posicionY][posicionX] = jugada;
			intento++;
			if(tablero[posicionY][posicionX] != mina || tablero[posicionY][posicionX] != tesoro) {
				System.out.println("Ha caido en una celda vacia");
				if(intento<5) {
					System.out.println("Siga intentandolo");
				}
			}else if(tablero[posicionY][posicionX] == mina){
				intento++;
				System.out.println("Ohhh, ha caido en una mina");
				
			}else if(tablero[posicionY][posicionX] == tesoro) {
				System.out.println("Ha encontrado el tesoro!!!");
			}
		
			
		}while(intento <=5 || tablero[posicionY][posicionX] == tesoro );
			
	

}}
