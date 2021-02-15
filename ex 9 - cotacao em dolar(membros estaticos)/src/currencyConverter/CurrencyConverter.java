package currencyConverter;

public class CurrencyConverter {
	
	public static final double IOF= 0.06;
	
	public static double paidReais(double dollar, double bought) {
		return  dollar*bought*(1.0+IOF);
	}
	
}
