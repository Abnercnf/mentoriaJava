//package composition.exerciseOne.entities;
//
//import org.example.composition.exerciseOne.entities.enums.CareerLevel;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//public class App {
//    public static void main( String[] args ) throws ParseException {
//
//        Scanner sc = new Scanner(System.in);
//        SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
//
//        System.out.print("Department:");
//        String department = sc.nextLine();
//        System.out.print("Worker:");
//        System.out.print("Name:");
//        String workerName = sc.nextLine();
//        System.out.print("Level:");
//        String workerLevel = sc.nextLine();
//        System.out.print("Salary:");
//        Double workerSalary = sc.nextDouble();
//        Worker worker = new Worker(workerName, CareerLevel.valueOf(workerLevel), workerSalary, new Department(department));
//
//        System.out.println("Contracts:");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            System.out.println("Contract Number #" + i + "data:");
//            System.out.println("Date: ");
//            Date contractDate = dtFormat.parse(sc.next());
//            System.out.println("Hourly Rate: ");
//            Double hourlyRate = sc.nextDouble();
//            System.out.print("Duration in hours: ");
//            int hours = sc.nextInt();
//            HourContract contract = new HourContract(contractDate, hourlyRate, hours);
//            worker.addContract(contract);
//        }
//
//        System.out.println();
//        System.out.println("Month and Year: ");
//        String monthYear = sc.next();
//        int month = Integer.parseInt(monthYear.substring(0, 2));
//        int year = Integer.parseInt(monthYear.substring(3));
//        System.out.println("Name: " + worker.getName());
//        System.out.println("Department: " + worker.getDepartment());
//        System.out.println("Income for: " + monthYear + ": " + String.format("%.2f", worker.income(year, month) ));
//
//        sc.close();
//    }
//}
