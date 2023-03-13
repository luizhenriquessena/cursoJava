import java.util.Scanner;

public class estruturaFor {

	public static void main(String[] args) {
		/*
		 * for ( inínio ; condição ; incremento) {
		 * 
		 * comando 01
		 * comando 02
		 * 
		 * }
		 * 
		 * */

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < n; i++ /*i = i + 1*/) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
