package application.week1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercício 4: Fatorial de um Número");
		System.out.print("Type a number between 1 and 9: ");
		Integer x = sc.nextInt();
		
		for(int i = 0;  i<=10 ; i++) {
			Integer res = x * i;
			System.out.println(x+ " X "+ i + " = " + (res));
		}
	}
}