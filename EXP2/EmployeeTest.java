public class EmployeeTest {

    public static void main(String args[]) {

        Employee e1 = new Employee("Rahul", "Sharma", 20000);
        Employee e2 = new Employee("Anita", "Patel", 25000);

        System.out.println("Yearly Salary Before Raise:");
        System.out.println(e1.getFirstName() + " : " + (e1.getMonthlySalary() * 12));
        System.out.println(e2.getFirstName() + " : " + (e2.getMonthlySalary() * 12));

        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        System.out.println("\nYearly Salary After 10% Raise:");
        System.out.println(e1.getFirstName() + " : " + (e1.getMonthlySalary() * 12));
        System.out.println(e2.getFirstName() + " : " + (e2.getMonthlySalary() * 12));
    }
}
