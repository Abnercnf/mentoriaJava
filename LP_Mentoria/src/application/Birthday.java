package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		System.out.println("Exercício 4: Data de aniversário");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type your birthday: ");
		String bdayString = sc.next();
		
		birthdayToAge(bdayString);


	}
	
	public static Integer birthdayToAge(String bdayString) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bday = LocalDate.parse(bdayString);
        String formattedDate = bday.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
		
        
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(bday, currentDate);
        
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        
        System.out.println(years + " years " + months + " months " + days + " and days");
		return years;
	}
	

}