package application;

import java.util.Locale;
import java.util.Scanner;
import student.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.println();
		System.out.printf("Final Grade: %.2f", aluno.finalGrade());
		if (aluno.finalGrade() < 60.0) {
			System.out.println();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", aluno.passOrFailed());
		} else {
			System.out.println();
			System.out.println("PASS");
		}
		sc.close();
	}

}
