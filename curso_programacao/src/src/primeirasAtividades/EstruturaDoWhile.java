package primeirasAtividades;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;

		do {
			System.out.print("Digite a temperatura Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.00 + 32.0;
			System.out.printf("Equivalemtne em Fahrenheit: %.2f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}
