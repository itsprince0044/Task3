public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double increment) {
        if (increment > 0) {
            salary += increment;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer", 50000);
        emp.updateSalary(5000);
        emp.displayInfo();
    }
}

    

