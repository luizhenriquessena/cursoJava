import java.util.Scanner;

public class tarefaAula49 {

	public static void main(String[] args) {

		// #### Exercício 01 ####
/*		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 2002) {
			System.out.println("Senha Invalida");
			x = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		sc.close();
		
		// #### Exercício 02 ####
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) 
				System.out.println("primeiro");
			else if (x < 0 && y > 0) 
				System.out.println("segundo");
			else if (x < 0 && y < 0)
				System.out.println("terceiro");
			else  
				System.out.println("quarto");
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
*/		
		// #### Exercício 03 ####
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		int a = 0; //1
		int g = 0; //2
		int d = 0; //3
		
		while (combustivel != 4) {
			
			if (combustivel == 1)
				a += 1;
			else if (combustivel == 2)
				g += 1;
			else if (combustivel == 3)
				d += 1;
			combustivel = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		
		sc.close();
		
	}

}
