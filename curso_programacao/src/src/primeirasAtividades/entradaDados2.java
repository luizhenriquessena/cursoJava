package primeirasAtividades;
import java.util.Scanner;

public class entradaDados2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// #### Receber Texto at� a quebra de linha ####
		String s1, s2, s3;
		int x;
		
		System.out.print("Informe seu nome completo: ");
		s1 = sc.nextLine();
		System.out.print("Informe sua idade: ");
		x = sc.nextInt();
		sc.nextLine(); // Necess�rio para consumir a quebra de linha pendente.
		System.out.print("Informe seu endere�o: ");
		s2 = sc.nextLine();
		System.out.print("Informe seu e-mail: ");
		s3 = sc.nextLine();
		
		System.out.println("Os valores informados foram: ");
		System.out.println(s1);
		System.out.println(x);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();		
	}

}
