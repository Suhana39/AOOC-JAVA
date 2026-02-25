class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    public void performanceReport() {
        System.out.println("Performance Report of " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12; // 12% bonus
    }
}

public class Main2 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", "New York", 80000);
        Developer d = new Developer("Bob", "California", 60000);
        Programmer p = new Programmer("Charlie", "Texas", 50000);

        m.performanceReport();
        System.out.println();
        d.performanceReport();
        System.out.println();
        p.performanceReport();
    }
}
