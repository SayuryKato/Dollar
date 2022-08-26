package app;

import java.util.Locale;
import java.util.Scanner;

import util.Converter;

public class Programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual é o preço do Dolar? ");
		double dolar = sc.nextDouble();
		System.out.println("\nQuantos Dolar vao ser comprados? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("\n\nValor a ser pago em reais é: %.2f", Converter.dolarReal(quantidade, dolar));

	}

}
