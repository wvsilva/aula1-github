package student;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}

	public double passOrFailed() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}

}
