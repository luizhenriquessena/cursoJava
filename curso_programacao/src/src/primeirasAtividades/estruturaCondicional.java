package primeirasAtividades;
import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {

		/*
		 * && = significa o E na condi��o (AND) || = significa o OU na condi��o (OR)
		 * 
		 * == = siginifica o igual != = siginifica o diferente
		 * 
		 * !() = inverte a condi��o � o N�O. Compara a condi��o dentro do () e inverte a
		 * logica da condi��o
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.print("Informe a hora: ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else {
			if (hora > 18) {
				System.out.println("Boa noite!");
			} else {
				System.out.println("Boa tarde!");
			}

		}

		sc.close();

	}

}
