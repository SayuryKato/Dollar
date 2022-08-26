package util;

public class Converter {
	public static double IOF = 0.06;
	
	public static double dolarReal(double quantidade, double dolar) {
		return quantidade*dolar*(1.0+IOF);
		
	}

}
