import java.util.Scanner;

public class testeTempoDeJogo {

	public static void main(String[] args) {
		int tempoInicial, tempoFinal, resposta;
		Scanner input = new Scanner(System.in);
		
		tempoInicial = input.nextInt();
		tempoFinal = input.nextInt();
		
		if (tempoInicial >= tempoFinal) {
			resposta = (tempoFinal - tempoInicial) + 24;
		}
		else {
			resposta = tempoFinal -tempoInicial;
		}
		
		System.out.println("O JOGO DUROU " + resposta + " HORA(S)");
		input.close();
	}
}
