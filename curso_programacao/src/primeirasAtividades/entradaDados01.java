package primeirasAtividades;
import java.util.Scanner;

public class entradaDados01 {

	public static void main(String[] args) {
		
		// Entrada de Dados
		Scanner sc = new Scanner (System.in); // Obrigat�rio para receber um valor
		
		
		// ####  Receber Palavra ####
		String txt;
		System.out.print("Digite uma palavra, para que seja apresentado ela por completo: ");
		txt = sc.next();
		System.out.println("Voc� digitou a palavra: " + txt);
		//sc.close(); // Liberar vari�vel scanner (Colocar apenas no final do c�digo)
		
		// #### Receber Char, primeiro caractere ####
		char ch1;
		System.out.print("Digite uma palavra, para que seja apresentado a primeira letra: ");
		ch1 = sc.next().charAt(0);
		System.out.println("A primeira letra da palavra que digitou �: " + ch1);
		//sc.close();			

		// #### Receber Char, segundo caractere ####
		char ch2;
		System.out.print("Digite uma palavra, para que seja apresentado a segunda letra: ");
		ch2 = sc.next().charAt(1);
		System.out.println("A segunda letra da palavra que digitou �: " + ch2);
		//sc.close();			
		
		// #### Receber N�mero Inteiro ####
		int ni;
		System.out.print("Digite um n�mero inteiro, para que seja apresentado o n�mero: ");
		ni = sc.nextInt();
		System.out.println("Voc� digitou o n�mero inteiro: " + ni);
		//sc.close();

		// #### Receber N�mero com Ponto Flutuante Double ####
		double nd;
		System.out.print("Digite um n�mero double (ponto flutuante), para que seja apresentado o n�mero: ");
		nd = sc.nextDouble();
		System.out.printf("Voc� digitou o n�mero com ponto flutuante: %.2f%n", nd);
		//sc.close();	
		
		
		
		// #### Receber v�rios valores ####
		String txt1;
		int nu1;
		double db1;
		System.out.println("Informe os valores separador com espa�o.");
		txt1 = sc.next();
		nu1  = sc.nextInt();
		db1  = sc.nextDouble();
		System.out.println("Os valores digitados foram: ");
		System.out.println(txt1);
		System.out.println(nu1);
		System.out.println(db1);
		System.out.printf("Double formatado: %.2f",db1);
		sc.close();
	}

}
