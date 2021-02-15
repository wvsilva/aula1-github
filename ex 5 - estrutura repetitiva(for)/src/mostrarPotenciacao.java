import java.util.Scanner;

public class mostrarPotenciacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int quad = i * i;
			int cub = (int) Math.pow(i, 3);
			System.out.println(i+" "+quad+" "+cub);
		}
		
		sc.close();
	}

}
