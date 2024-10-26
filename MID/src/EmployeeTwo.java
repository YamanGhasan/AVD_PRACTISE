  class EmployeeTwo {

        private String name;
        private int age;
        private double salary;
        private String department;
        private String city;

      public EmployeeTwo(String name, int age, double salary, String department, String city) {
          this.name = name;
          this.age = age;
          this.salary = salary;
          this.department = department;
          this.city = city;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }

      public double getSalary() {
          return salary;
      }

      public void setSalary(double salary) {
          this.salary = salary;
      }

      public String getDepartment() {
          return department;
      }

      public void setDepartment(String department) {
          this.department = department;
      }

      public String getCity() {
          return city;
      }

      public void setCity(String city) {
          this.city = city;
      }
  }
