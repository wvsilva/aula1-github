import java.util.Locale;
import java.util.Scanner;

public class diferentesCalculos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double a, b, c, areaDoTriangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo, pi = 3.14159;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com os tr�s n�meros: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		input.close();
		
		areaDoTriangulo = (a * c) / 2;
		areaDoCirculo = pi * (Math.pow(c, 2));
		areaDoTrapezio = ((a + b) * c) / 2;
		areaDoQuadrado = Math.pow(b, 2);
		areaDoRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f %n", areaDoTriangulo);
		System.out.printf("CIRCULO: %.3f %n", areaDoCirculo);
		System.out.printf("TRAP�ZIO: %.3f %n", areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f %n", areaDoQuadrado);
		System.out.printf("RET�NGULO: %.3f %n", areaDoRetangulo);				
	}

}
