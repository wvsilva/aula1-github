import java.util.Locale;
import java.util.Scanner;

public class salarioDoFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int number, hours;
		float salary, money;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o seu número?");
		number = input.nextInt();
		System.out.println("Quantas horas trabalhadas?");
		hours = input.nextInt();
		System.out.println("Quanto você ganha por hora?");
		money = input.nextFloat();
		input.close();
		
		salary = money * hours;
		
		System.out.printf("NUMBER = %d %n", number);
		System.out.printf("SALARY = %.2f", salary);
		
		
		

	}

}
