package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank user;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		if(option == 'y') {
			System.out.print("how much will be  deposited? ");
			double initialDeposit = sc.nextDouble();
			user = new Bank(number, name, initialDeposit);
		}
		else {
			user = new Bank(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		user.bankDeposit(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter a withdraft value: ");
		user.bankWithdraft(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(user);
		
		sc.close();
	}

}
