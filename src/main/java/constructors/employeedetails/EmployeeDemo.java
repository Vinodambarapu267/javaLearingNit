package constructors.employeedetails;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("vinu","ambarapu",123,50000,3);
        employee.calculateSalary();
        System.out.println(employee);

    }
}
