// Plik Company.java
import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("John Doe", 80000, 0);
        employees[1] = new Worker("Jane Smith", 60000, "Sales Associate");
        employees[2] = new Employee("Alice Johnson", 70000);
        employees[3] = new Worker("Bob Brown", 55000, "Technician");
        employees[4] = new Worker("Charlie Davis", 65000, "Customer Support");

        int nonManagersCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagersCount++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);

        employees[0].setSalary(75000);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
