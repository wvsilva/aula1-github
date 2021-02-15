import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		
		if(n == 0 || n == 1) {
			n = 1;
			}
		else {
			for(int i = 1; i < x; i++) {
				n *= (x - i);
			}	
		}
		System.out.println(n); 
		
		sc.close();
	}
}

/* Correção: nesse foi feito de forma crescente(Mais simples).

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int fat = 1;
for (int i=1; i<=n; i++) {
	fat = fat * i;
}

System.out.println(fat);

sc.close();
*/
