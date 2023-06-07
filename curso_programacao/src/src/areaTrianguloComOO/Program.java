package areaTrianguloComOO;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas dos triangulos A e B.");
		System.out.println("Medida as 3 medidas do primeiro triangulo: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Medida as 3 medidas do segundo triangulo: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();

		double areaY = y.area();
		
		System.out.printf("Area do primeiro triangulo: %.4f%n", areaX);
		System.out.printf("Area do segundo triangulo: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior area e a do primeiro triangulo.");
		}
		else {
			System.out.println("A maior area e a do segundo triangulo");
		}
		
		sc.close();
		
	}

}
