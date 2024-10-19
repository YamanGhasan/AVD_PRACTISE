import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alex", 34, 63000, "Engineering", "NewYork"),
                new Employee("Marina", 43, 100000, "Engineering", "NewYork"),
                new Employee("Hasan", 23, 50000, "Sales", "NewYork"),
                new Employee("Elizabeth", 22, 50000, "Sales", "NewYork"),
                new Employee("Kim", 60, 70000, "Finance", "NewYork"),
                new Employee("Safa", 56, 40000, "HR", "NewYork"),
                new Employee("Ahmad", 43, 60000, "HR", "NewYork"),
                new Employee("Merry", 32, 35000, "Production", "SanFransisco"),
                new Employee("Saeed", 54, 43000, "Production", "SanFransisco")
        );


        System.out.println("1-Employees who work in the \"Sales\" department");
        employees.stream()
                .filter(emp -> emp.getDepartment().equals("Sales"))
                .forEach(emp -> System.out.println("Employee Name : " + emp.getName() + " , Employee age :" + emp.getAge()));

        System.out.println("2-Employees earning more than 50,000");
        employees.stream()
                .filter(emp-> emp.getSalary() > 50000)
            .forEach(emp -> System.out.println("Employee Name : " + emp.getName() + " , Employee Salary :" + emp.getSalary()));

        System.out.println("3-Group all employees by the city they live in, and display the list of employees for each \n" +
                "city. ");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity))
                .forEach((city, empList) -> {
                    System.out.println("City: " + city);
                    empList.stream()
                            .map(Employee::getName)
                            .distinct()
                            .forEach(System.out::println);
                });

        System.out.println("4-Sort the list of employees by their salary in descending order and display the top 5 \n" +
                "highest-paid employees with their name and salary");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(5)
                .forEach(emp -> System.out.println("Employee Name: " + emp.getName() + ", Employee Salary: " + emp.getSalary()));

        System.out.println("5-Find the Average Salary of Employees in a engineering Department");
      double EngineeringSalaryAVG = employees.stream().filter(emp -> emp.getDepartment().equals("Engineering"))
                .mapToDouble(Employee -> Employee.getSalary())
                .average()
                .orElse(0.0);

        System.out.println("Average Salary in Engineering: " + EngineeringSalaryAVG);


    }
}




