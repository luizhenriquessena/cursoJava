package primeirasAtividades;

public class funcoesMatematicas {

	public static void main(String[] args) {
	
		double x, y, z, A, B, C;
		
		x = 3.0;
		y = 4.0;
		z = -5.0;
		
		// Math.sqrt = Raiz Quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " �:" + A);
		System.out.println("Raiz quadrada de " + y + " �:" + B);
		System.out.println("Raiz quadrada de " + 25 + " �:" + C);
		
		System.out.println("##############################");
		// Math.pow = elevado a pot�ncia
		A = Math.pow(x,y);
		B = Math.pow(y, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " �:" + A);
		System.out.println(y + " elevado a " + 2 + " �:" + B);
		System.out.println(5 + " elevado a " + 2 + " �:" + C);
		
		System.out.println("##############################");
		// Math.abs = Valor absoluto
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " �: " + A);
		System.out.println("Valor absoluto de " + z + " �: " + B);
	}

}
