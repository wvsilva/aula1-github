import java.util.Scanner;

public class divisaoDePares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b == 0) {
				System.out.println("Divis�o impossivel");
			}
			else {
				double x = (double) a / b;
				System.out.println(x);
				//System.out.printf("%.1f%n", div); -- n�o foi especificado formata��o
			}
		}
		
		sc.close();
	}

}
