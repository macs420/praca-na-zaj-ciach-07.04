// Plik Company.java
import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("John Doe", 80000, 0);
        employees[1] = new Worker("Jane Smith", 60000, "Sales Associate");
        employees[2] = new Employee("Alice Johnson", 70000);
        employees[3] = new Worker("Bob Brown", 55000, "Technician");
        employees[4] = new Worker("Charlie Davis", 65000, "Customer Support");
        employees[5] = new Manager("Eva Green", 85000, 0);
        employees[6] = new Worker("Frank White", 58000, "Accountant");

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(3);
                employee.setSalary(75000);
            }
        }

        System.out.println("Zaktualizowane dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
