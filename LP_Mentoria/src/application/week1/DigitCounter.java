package application.week1;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercício 9: Contador de Dígitos");
		System.out.print("Type a number: ");
		Integer number = sc.nextInt();
		String numberString = String.valueOf(number);
		
		System.out.println(numberString.length());
	}
}
