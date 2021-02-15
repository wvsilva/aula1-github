package entites;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		double area = largura * altura;
		return area;
	}
	public double perimetro() {
		double perimetro = 2 * (largura + altura);
		return perimetro;
	}
	public double diagonal() {
		double diagonal = Math.sqrt(((largura * largura) + ( altura * altura)));
		return diagonal;
	}
	/*Em vez de criar uma variavel para return, pode
	colocar apena o return, ex da area: return largura * altura; */ 
}
