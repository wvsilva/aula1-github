import java.util.Scanner;
import java.util.Locale;

public class contaDePecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int codigo1, codigo2, numero1, numero2;
		float preco1, preco2, valor;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pe�a 1: Informe o c�digo, n�mero de pe�as e valor unit�rio: ");
		codigo1 = input.nextInt();
		numero1 = input.nextInt();
		preco1 = input.nextFloat();
		
		System.out.println("Pe�a 2: Informe o c�digo, n�mero de pe�as e valor unit�rio: ");
		codigo2 = input.nextInt();
		numero2 = input.nextInt();
		preco2 = input.nextFloat();
		input.close();

		valor = (preco1 * numero1) + (preco2 * numero2);
		System.out.printf("VALOR A SER PAGO: R$ %.2f", valor);
	}

}
