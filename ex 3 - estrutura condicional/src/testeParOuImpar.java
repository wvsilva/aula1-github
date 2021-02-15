import java.util.Scanner;

public class testeParOuImpar {

	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Par!");
		}
		else {
			System.out.println("Impar!");
		}
		input.close();
	}

}
