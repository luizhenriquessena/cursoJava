import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {

		/*
		 * && = significa o E na condição (AND) || = significa o OU na condição (OR)
		 * 
		 * == = siginifica o igual != = siginifica o diferente
		 * 
		 * !() = inverte a condição é o NÃO. Compara a condição dentro do () e inverte a
		 * logica da condição
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
