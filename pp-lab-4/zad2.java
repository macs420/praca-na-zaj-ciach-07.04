// Plik employees/Employee.java
package employees;

public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Employee: {fullName='" + fullName + "', Salary=" + salary + "}";
    }
}
// Plik employees/Manager.java
package employees;

public class Manager extends Employee {
    public int numberOfSubordinates;

    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager: {fullName='" + getFullName() + "', Salary=" + getSalary() + ", Subordinates=" + numberOfSubordinates + "}";
    }
}
// Plik employees/Manager.java
package employees;

public class Manager extends Employee {
    public int numberOfSubordinates;

    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager: {fullName='" + getFullName() + "', Salary=" + getSalary() + ", Subordinates=" + numberOfSubordinates + "}";
    }
}
// Plik employees/Worker.java
package employees;

public class Worker extends Employee {
    public String position;

    public Worker(String fullName, double salary, String position) {
        super(fullName, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker: {fullName='" + getFullName() + "', Salary=" + getSalary() + ", Position=" + position + "}";
    }
}
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

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}


