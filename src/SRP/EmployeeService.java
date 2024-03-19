package SRP;

public class EmployeeService {
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.2);
        return employee.getBaseSalary() - tax;
    }
}