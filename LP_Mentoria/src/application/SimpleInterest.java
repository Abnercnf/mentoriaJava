package application;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		System.out.println("Exercício 1: Juros Simples");
		
		Scanner sc = new Scanner(System.in);
		int numberOfInstallments;
		double loan, amount, fee;
		
		System.out.print("Type the value : ");
		loan = sc.nextDouble();
		
		System.out.print("Type the monthly fee: ");
		fee = sc.nextDouble();   
		
		System.out.print("Type the number of installments: ");
		numberOfInstallments = sc.nextInt();
		
		fee = (fee/100) * loan;
		System.out.printf("Monthly Fee %.2f",fee);
		fee *= numberOfInstallments;
		System.out.printf("\nTotal Fee %.2f", fee);
		amount = loan + fee;
		
		System.out.printf("\nAmount %.2f", amount);

	}
}
