import java.util.Locale;
import java.util.Scanner;

public class produtoDeQuatroNumeros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a, b , c, d, r;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com primeiro n�mero:");
		a = input.nextInt();
		System.out.println("Entre com segundo n�mero:");
		b = input.nextInt();
		System.out.println("Entre com o terceiro n�mero:");
		c = input.nextInt();
		System.out.println("Entre com o quarto n�mero:");
		d = input.nextInt();
		input.close();
		
		r = (a * b) - (c * d);
		
		System.out.printf("O resultado �: %d", r);
	}

}
