import java.util.Scanner;

public class testeSeNegativo {

	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		
		if (x < 0) {
			System.out.println("Negativo!");
		}
		else {
			System.out.println("Positivo!");
		}
		input.close();
	}

}
