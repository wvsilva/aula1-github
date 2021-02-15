import java.util.Scanner;

public class produtosMaisVendidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0; 
		int gasolina = 0; 
		int diesel = 0;
		int entrada = sc.nextInt();
		
		while(entrada != 4) {
			alcool = (entrada == 1) ? alcool+=1:alcool;
			gasolina = (entrada == 2) ? gasolina+=1:gasolina;
			diesel = (entrada == 3) ? diesel+=1:diesel;
			entrada = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
