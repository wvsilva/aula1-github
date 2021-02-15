import java.util.Scanner;
import java.util.Locale;

public class calculeConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int item, quantidade; 
		float conta, preco;
		Scanner input = new Scanner(System.in);
		
		item = input.nextInt();
		quantidade = input.nextInt();
		
		if (item == 1) {
			preco =  4.00f;
		}
		else if (item == 2) {
			preco = 4.50f;
		}
		else if (item == 3) {
			preco = 5.00f;
		}
		else if (item == 4) {
			preco = 2.00f;
		}
		else {
			preco = 1.50f;
		}
		
		conta = preco * quantidade;
		
		System.out.printf("Total: R$ %.2f", conta);
		input.close();
	}
}
