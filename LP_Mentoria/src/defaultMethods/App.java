package interfaces.defaultMethods;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Amount: ");
        Double amount = sc.nextDouble();
        System.out.println("Months: ");
        Integer months = sc.nextInt();

        UsaInterestRateService interestRate = new UsaInterestRateService(2.0);
        double payment = interestRate.payment(amount, months);
        System.out.println("Result: ");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
