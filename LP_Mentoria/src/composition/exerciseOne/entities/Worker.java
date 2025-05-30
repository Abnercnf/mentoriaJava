//package composition.exerciseOne.entities;
//
//import org.example.composition.exerciseOne.entities.enums.CareerLevel;
//
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//
//public class Worker {
//    private String name;
//    private CareerLevel level;
//    private Double baseSalary;
//
//    private Department department;
//    private List<HourContract> contracts = new ArrayList<>();
//
//    public Worker(){}
//
//    public Worker(String name, CareerLevel level, Double baseSalary, Department department) {
//        this.name = name;
//        this.level = level;
//        this.baseSalary = baseSalary;
//        this.department = department;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public CareerLevel getLevel() {
//        return level;
//    }
//
//    public void setLevel(CareerLevel level) {
//        this.level = level;
//    }
//
//    public Double getBaseSalary() {
//        return baseSalary;
//    }
//
//    public void setBaseSalary(Double baseSalary) {
//        this.baseSalary = baseSalary;
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//
//    public List<HourContract> getContracts() {
//        return contracts;
//    }
//
//    public void addContract(HourContract contract) {
//        contracts.add(contract);
//    }
//
//    public void removeContract(HourContract contract) {
//        contracts.remove(contract);
//    }
//
//    public double income(Integer year, Integer month) {
//        double sum = baseSalary;
//        Calendar cal = Calendar.getInstance();
//        for (HourContract c : contracts){
//            cal.setTime(c.getDate());
//            int c_year = cal.get(Calendar.YEAR);
//            int c_month =  cal.get(Calendar.MONTH) + 1;
//            if (year == c_year && month == c_month ){
//                sum += c.totalIncoming();
//            }
//        }
//        return sum;
//    }
//}
