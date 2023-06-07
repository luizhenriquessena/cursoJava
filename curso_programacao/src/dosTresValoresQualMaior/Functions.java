package dosTresValoresQualMaior;

import java.util.Scanner;

public class Functions {
	
	public static void main(String [] args) {
		
		System.out.println("Favor informar 3 numero inteiros para que seja verificado qual é o maior.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Primeiro numero: ");
		int n1 = sc.nextInt();
		System.out.print("Segundo numero: ");
		int n2 = sc.nextInt();
		System.out.print("Terceiro numero: ");
		int n3 = sc.nextInt();
		
		/*
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior numero e: " + n1);
		}
		else if (n2 > n3) {
			System.out.println("O maior numero e: " + n2);
		}
		else {
			System.out.println("O maior numero e: " + n3);
		}
		*/
		
		int result = max(n1, n2, n3);
		mostrarResultado(result);
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int v1;
		
		if (a > b && a > c) {
			v1 = a;
		}
		else if (b > c) {
			v1 = b;
		}
		else {
			v1 = c;
		}
		
		return v1;
	}
	
	public static void mostrarResultado(int numero) {
		System.out.println("O maior valor e: "+ numero);
	}

}
