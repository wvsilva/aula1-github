import java.util.Locale;
import java.util.Scanner;

public class produtoDeQuatroNumeros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a, b , c, d, r;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com primeiro número:");
		a = input.nextInt();
		System.out.println("Entre com segundo número:");
		b = input.nextInt();
		System.out.println("Entre com o terceiro número:");
		c = input.nextInt();
		System.out.println("Entre com o quarto número:");
		d = input.nextInt();
		input.close();
		
		r = (a * b) - (c * d);
		
		System.out.printf("O resultado é: %d", r);
	}

}
