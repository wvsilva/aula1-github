import java.util.Scanner;

public class testeMultiplo {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		
		if (a % b == 0 || b % a ==0) {
			System.out.println("São multiplos!");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		input.close();
	}

}
