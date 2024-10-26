public class Employee {

    private String name;
    private Double salary;

    Employee(String name, Double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
