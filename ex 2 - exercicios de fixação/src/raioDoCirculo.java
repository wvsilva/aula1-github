import java.util.Scanner;
import java.util.Locale;

public class raioDoCirculo {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double raio, area, pi =3.14159;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o raio do círculo: ");
		raio = (double) input.nextDouble();
		input.close();
		
		area = pi * (Math.pow(raio, 2));
		
		System.out.printf("Area do circulo: %.4f", area);
	}
}
