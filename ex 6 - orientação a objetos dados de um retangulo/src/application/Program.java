package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();

		System.out.printf("AREA = %.2f %n", retangulo.area());
		System.out.printf("PERIMETER = %.2f %n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f %n", retangulo.diagonal());
		sc.close();
	}

}
