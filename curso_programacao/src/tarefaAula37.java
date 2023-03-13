import java.util.Locale;
import java.util.Scanner;

public class tarefaAula37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

/*		// #### EXERCICIO 01 ####
		int n1 = sc.nextInt();

		if (n1 < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		
		
		// #### EXERCICIO 02 ####
		int n2, resto;
		
		n2= sc.nextInt();
		
		resto = n2 % 2;

		if (resto == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		
		
		// #### EXERCICIO 03 (solução 01)####
		int n3, n4;
		
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		if (n3 == n4) 
			System.out.println("Sao Multiplos");
		else {
			if (n3 < n4 )
				if (n4 % n3 == 0) 
					System.out.println("São Multiplos");
				else 
					System.out.println("Nao sao Multiplos");
			else
				if (n3 % n4 == 0) 
					System.out.println("São Multiplos");
				else 
					System.out.println("Nao sao Multiplos");
			
		     }
		// #### EXERCICIO 03 (solução 02)####
		int n3, n4;
		
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		if (n3 % n4 == 0 || n4 % n3 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}	
		
		
		
		// #### EXERCICIO 04 (solução 01)####
		int h1 = sc.nextInt(); 
		int h2 = sc.nextInt();
		int r;
		
		if (h1 == h2) 
			System.out.println("O JOGO DUROU 24 HORAS(S)");
		else {
			if (h1 > h2) {
				r = (24-h1) + h2;
				System.out.println("O JOGO DUROU " + r + " HORA(S)");
			} else {
				r = h2 - h1;
				System.out.println("O JOGO DUROU " + r + " HORA(S)");
			}
		}
		
		// #### EXERCICIO 04 (solução 01)####
		int h1 = sc.nextInt(); 
		int h2 = sc.nextInt();
		int r;
		
		if (h1 < h2) {
			r = h2 - h1;
		}
		else {
			r = 24 - h1 + h2;
		}
		
		System.out.println("O JOGO DUROU " + r + " HORA(S)");	
		
		
		// #### EXERCICIO 05 ####
		Locale.setDefault(Locale.US);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0.00;
		
		if (codigo == 1) 
			total = quantidade * 4;
		else if (codigo == 2) 
			total = quantidade * 4.50;
		else if (codigo == 3) 
			total = quantidade * 5;
		else if (codigo == 4) 
			total = quantidade * 2;
		else if (codigo == 5) 
			total = quantidade * 1.50;
		
		System.out.printf("Total: R$ %.2f%n",total);
		// #### EXERCICIO 06 (solução 01)####
		Locale.setDefault(Locale.US);
		
		double v1 = sc.nextDouble();

		if (v1 >= 0 && v1 <= 25)
			System.out.println("Intervalo [0, 25]");
		else if (v1 >= 25.01 && v1 <= 50)
			System.out.println("Intervalo [25.01, 50]");
		else if (v1 >= 75 && v1 <= 100)
			System.out.println("Intervalo [75, 100]");
		else 
			System.out.println("Fora de intervalo");
		
		

		// #### EXERCICIO 06 (solução 02)####
		Locale.setDefault(Locale.US);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
	
		// #### EXERCICIO 07 (Solução 01)####
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0)
			System.out.println("Origem");
		else if (y == 0)
			System.out.println("Eixo x");
		else if (x > 0 && y > 0)
			System.out.println("Q1");
		else if (x > 0 && y < 0)
			System.out.println("Q4");
		else if (x == 0)
			System.out.println("Eixo y");
		else if (x < 0 && y < 0)
			System.out.println("Q3");
		else if (x > 0 && y > 0)
			System.out.println("Q2");
		

		// #### EXERCICIO 07 (Solução 01)####
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		
		// #### EXERCICIO 08 (Solução 01)####
		Locale.setDefault(Locale.US);
		double valor = sc.nextDouble();
		double v1 = 0;
		double imposto = 0;
		
		if (valor <= 2000)
			System.out.println("Isento");
		else if (valor <= 3000) {
			v1 = valor - 2000;
			imposto = v1 * 0.08; 
			System.out.printf("R$ %.2f",imposto);
		}
		else if (valor <= 4500) {
			v1 = valor - 3000;
			imposto = (1000 * 0.08) + (v1 * 0.18);
			System.out.printf("R$ %.2f",imposto);
		}
		else {
			v1 = valor - 4500;
			imposto = (1000 * 0.08) + (1500 * 0.18) +(v1 * 0.28);
			System.out.printf("R$ %.2f",imposto);
		}

		// #### EXERCICIO 08 (Solução 02)####
		Locale.setDefault(Locale.US);
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
	*/	
		sc.close();
	}

}
