import java.util.Locale;
import java.util.Scanner;

public class tarefaAula30 {

	public static void main(String[] args) {
		// #### Exercício 1 ####
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	/*	
		System.out.println("Exercicio 1");
		int n1, n2, r1;

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		r1 = n1 + n2;

		System.out.println("SOMA = " + r1);

		
		
		// #### Exercício 2 ####
		System.out.println("Exercicio 2");
		
		double x, raio, r2;

		x = 3.14159;
		raio = sc.nextDouble();
		r2 = x * Math.pow(raio, 2);

		System.out.printf("A=%.4f%n", r2);

		
		
		// #### Exercício 3 ####
		System.out.println("Exercicio 3");
		int A, B, C, D, DIF;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIF = A * B - C* D;
		
		System.out.println("DIFERENCA = " + DIF);

		
		
		// #### Exercício 4 ####
		System.out.println("Exercicio 4");
		int nFunc, horas;
		double valor, salario;;
		
		nFunc = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("NUMBER = " + nFunc);
		System.out.printf("SALARY = U$ %.2f%n",salario);

				
		
		// #### Exercício 5 ####
		System.out.println("Exercicio 5");
		int cp1, cp2, np1, np2;
		double vp1, vp2, total;
		
		cp1 = sc.nextInt();
		np1 = sc.nextInt();
		vp1 = sc.nextDouble();
		
		total = np1 * vp1;
		
		cp2 = sc.nextInt();
		np2 = sc.nextInt();
		vp2 = sc.nextDouble();		
		
		total = total + (np2 * vp2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
*/
		
		
		// #### Exercício 6 ####
		System.out.println("Exercicio 6");
		double A1, B1, C1, ra, rb, rc, rd, re, pi;
		
		pi = 3.14159;
		A1 = sc.nextDouble();
		B1 = sc.nextDouble();
		C1 = sc.nextDouble();
		
		ra = (A1 * C1) / 2;
		rb = pi * Math.pow(C1,2);
		rc = ((A1 + B1) * C1) / 2;
		rd = B1 * B1;
		re = A1 * B1;
				
		System.out.printf("TRIANGULO: %.3f%n", ra);
		System.out.printf("CIRCULO: %.3f%n", rb);
		System.out.printf("TRAPEZIO: %.3f%n", rc);
		System.out.printf("QUADRADO: %.3f%n", rd);
		System.out.printf("RETANGULO: %.3f%n", re);
		
		sc.close();
	}

}
