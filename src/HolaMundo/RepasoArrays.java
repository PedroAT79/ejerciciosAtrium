package HolaMundo;

public class RepasoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero;
		numero = new int[4];
		
		numero[0]=1;
		
		System.out.println(numero[0]);
		
		
		int[] z = new int[5];
		z[0] = 1;
		z[1] = 2;
		z[2] = 3;
		z[3] = 4;
		z[4] = 5;
		
		System.out.println(z);
		
		for(int i=0; i<z.length; i++) {
			System.out.println(z[i]);
		}
			
		
	char[] caracter = new char[2];
	caracter[0] = 'h';
	caracter[1] = 'j';
	
	for(int j=0; j<caracter.length;j++) {
		System.out.println(caracter[j]);
	}

	}

}


