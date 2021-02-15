package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Inn;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Inn[] vect = new Inn[10];
		
		System.out.print("How many rooms will be rented? ");
		int rented = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <=rented; i++) {

			System.out.println();
			System.out.println("Rent #"+ i +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Romm: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Inn(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");

		for (int b = 0; b < 10; b++) {
			if (vect[b] != null) {
				System.out.println(b + ": "+ vect[b].toString());
			}
		}
		sc.close();
	}

}
