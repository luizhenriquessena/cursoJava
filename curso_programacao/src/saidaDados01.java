import java.util.Locale;

public class saidaDados01 {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784; 
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x); // printf imprimir formatado (2f = duas casas decimais) (%n = quebra linha)
		System.out.printf("%.4f%n",x); // printf imprimir formatado (4f = quatro casas decimais)
		System.out.println("Bom dia!!");
		Locale.setDefault(Locale.US);  // Locale utilizado para formatar numero US ( ponto no lugar de virgula)
		System.out.printf("%.4f%n",x); // Impressão após Locale
		System.out.println("RESULTADO = " + x + "METROS"); // (+) utilizado para concatenar
		System.out.printf("RESULTADO = %.2f METROS ou %d %n",x, y); // (%f, %.2f, etc) substitui pelo valor da variável seguindo a ordem.
		
		/* %f = ponto flutuante
		 * %d - inteiro
		 * %s = texto
		 * %n quebra de linha
		 * */ 
		String nome = "Luiz Henrique";
		int idade = 29;
		double renda = 4500.0;
		
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
		
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b; // (double) serve para converter o resultado inteiro para double. Tambem tem (int)
		
		System.out.println(resultado);
		
		

		
		
		
	}

}
