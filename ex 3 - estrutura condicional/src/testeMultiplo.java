import java.util.Scanner;

public class testeMultiplo {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		
		if (a % b == 0 || b % a ==0) {
			System.out.println("S�o multiplos!");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		
		input.close();
	}

}
