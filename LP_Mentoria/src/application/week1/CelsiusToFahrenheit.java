package application.week1;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercício 4: Fatorial de um Número");
		System.out.print("Type the temperature in celsius: ");
		Double celsius = sc.nextDouble();
		Double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println(fahrenheit+ "ºF");
	}
}
