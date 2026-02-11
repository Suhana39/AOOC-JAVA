public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;

        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
