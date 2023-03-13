import java.util.Locale;
import java.util.Scanner;

public class debugEclipse {

	public static void main(String[] args) {
		/*
		 * Clicar duas vezes ao lado do número da linha para criar uma bolinha azul.
		 * Rodas o programa e utilizar o F6 para pular de rotina em rotina após a bolinha azul
		 * 
		 * 
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
	}

}
