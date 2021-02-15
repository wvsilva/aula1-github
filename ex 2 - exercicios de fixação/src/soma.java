import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a, b, r;
		
		System.out.print("Entre com o primeiro número: ");
		a = input.nextInt();
		System.out.print("Entre com o segundo número: ");
		b = input.nextInt();
		input.close();
		
		r = a + b;
		
		System.out.printf("O resultado da soma:%d", r);
	}

}
