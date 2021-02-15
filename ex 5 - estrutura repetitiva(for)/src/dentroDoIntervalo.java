import java.util.Scanner;

public class dentroDoIntervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0; 
		int out = 0;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int input = sc.nextInt();
			
			if(input <= 20 && input >= 10) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
