import javax.swing.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1
//        List<String> languages = Arrays.asList("Java", "JavaScript", "C++", "Python");
//
//        // Filter languages that start with 'J' and collect them into a new list
//        List<String> languagesStartWithJ =
//                languages.stream()
//                        .filter(language -> language.startsWith("J"))
//                        .collect(Collectors.toList());
//
//        System.out.println("Languages that start with J: " + languagesStartWithJ);

        //2
//        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,6,7,8,9);
//
//        // declare a Predicate to check if it is even number
//        Predicate<Integer> isEven= num-> num % 2 == 0;
//
//        //declare a Predicate to check if the number grater than 5
//
//        Predicate<Integer> isGraterThan5 = num ->num >5;
//
//        //chain tha 2Predicates
//
//        List<Integer> evenANDGraterThan5Num = numbers.stream()
//                .filter(isEven.and(isGraterThan5)).toList();
//
//        System.out.println("even AND Grater Than 5 Num" + evenANDGraterThan5Num);

        //3
        // write a String Length using built-in Functional Interface

//        Function<String ,Integer> StringLength = str-> str.length();
//        Function<String ,Integer> StringLength = String::length; // using method reference
//
//        System.out.println("The length of String " +"Yaman " +StringLength.apply("Yaman"));


        //4
        // write a BiFunction built-in functional interfaces to Calculate Area of a Rectangle
        //BiFunction takes 2 argument and return a result

//        BiFunction<Double,Double,Double> CalculateAreaOfRectangle = (width,length)->
//                width* length;
//         System.out.println("The are of Rectangle = "+CalculateAreaOfRectangle.apply(22.5,33.2));

        //5
        // write a Consumer built-in functional interfaces to Print Names in Uppercase
        // consumer accept one argument and return no result

//        List<String> names= Arrays.asList("yaman","ali","habeeb");
//
//        Consumer<String> print = name-> System.out.println(name.toUpperCase());
//        names.forEach(print);

        //6 write a Supplier that Current Date and Time
        // the supplier Functional interface takes no input and return a result

//        Supplier<LocalDateTime>  currentDateTimeSupplier = LocalDateTime::now;
//        System.out.println("The date and time is "+ currentDateTimeSupplier.get());

        //7 use comparator functional interface sort a list
        // of Employee objects based on their salary and then by name if the salaries are equal.

        // Create a list of employees
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("yaman", 5000.9));
//        employees.add(new Employee("Ahmad", 647.2));
//        employees.add(new Employee("Charlie", 75000.4));
//        employees.add(new Employee("David", 60000.7));

        //Imperative Style: This approach is more imperative
//        Comparator<Empolyee> employeeComparator = (e1, e2) -> {
//            int salaryComparison = Double.compare(e2.getSalary(), e1.getSalary());
//            if (salaryComparison == 0) {
//                return e1.getName().compareTo(e2.getName()); //method in Java is used to compare two strings or objects
//            }
//            return salaryComparison;
//        };
//        Collections.sort(Employee, employeeComparator); //he Collections.sort() method in Java is a powerful utility for sorting lists.
//        // It can sort elements based on their natural ordering or using a custom comparator
//
//        // Print sorted list of employees
//        System.out.println("Sorted Employees:");
//        for (Empolyee employee : Employee) {
//            System.out.println(employee);
//
//        }


        // Declarative Style: This approach is more declarative and concise.
        // Sort employees by name (ascending) and then by salary (ascending)

//        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName)
//                .thenComparing(Comparator.comparingDouble(Employee::getSalary));
//
//        Collections.sort(employees, employeeComparator);
//
//        // Print sorted list of employees
//        System.out.println("Sorted Employees:");
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }


        // 8 demonstrate how to sort a list of Product objects based on their price
        // and then by name if the prices are equal.
//        List<Product> products = List.of(
//                new Product("Table" , 700),
//                new Product("door",900)
//        ); //Java 9 introduced static factory methods like List.of(), which create immutable lists. Once created,
        // these collections cannot be modified; you cannot add, remove, or change elements in the list

//        List<Product> products= new ArrayList<>();
//        products.add(new Product("Table" , 700));
//        products.add(new Product("door" , 700));
//
//        // Sort products by price (ascending) and then by name (ascending)
//
//        Comparator<Product> productComparator = (p1,p2)-> {
//            int priceComersion = Double.compare(p1.getPrice(), p2.getPrice());
//            if (priceComersion == 0) {
//                return p1.getName().compareTo(p2.getName());
//            }
//            return priceComersion;
//        };
//        Collections.sort(products, productComparator);
//
//        // Print sorted list of products
//        System.out.println("Sorted Products:");
//        for (Product product : products) {
//            System.out.println(product);
//
//
//}


        //9
//        StringManipulator word = new StringManipulator("yaman");
//        System.out.println("Convert to uppercase:" +  word.convertToUpperCase());
//        System.out.println("is palindrome Word:" +  word.palindromeWord());
//        System.out.println("Convert to Lowercase:" +   word.convertToLowerCase());
//
//        StringOperation toUpercase = str->str.toUpperCase();
//        StringOperation toLowercase= str->str.toLowerCase();
//        StringOperation palindrome = input->{
//            String reverse = new StringBuilder(input).reverse().toString();
//            return input.equalsIgnoreCase(reverse) ? "true " : "false";
//        };
//StringOperation reverse = str-> {
//  return   new StringBuilder(str).reverse().toString();
//};
//
//
//        System.out.println("Convert to uppercase: " + toUpercase.operate("hello"));
//        System.out.println("Convert to lowercase: " + toLowercase.operate("WORLD"));
//        System.out.println("Convert to Reverse : " + reverse.operate("WORLD"));
//        System.out.println("Is a palindrome? " + palindrome.operate("yaman"));

        //10
        //imperative programming : focuses on how perform tasks , it involves writing code that
        //describes the steps needed to achieve  a goal .

//        List<String> names= Arrays.asList("Yaman","Ahamd","Ali");
//        for(String name:names){
//            if(name.startsWith("A")){
//                System.out.println(name);
//            }
//        }

        //11
        //declarative programming : Focuses on what the program should accomplish without specifying how

//     List<String> names =Arrays.asList("Yaman","Ahmad");
//     names.stream()
//             .filter(name->name.startsWith("Y"))
//             .forEach(System.out::println);


        //12
//        Predicate<String> containsDigit= str->str.chars().anyMatch(Character::isDigit);
//
//        // Test the predicate with a sample string
//        String testString = "YAMAN@11";
//        boolean result = containsDigit.test(testString);
//
//        System.out.println("Does \"" + testString + "\" contain a digit? " + result);

        //13
//        Function<Integer,String> convertsAnIntegerToItsBinaryString = Integer::toBinaryString;
//        System.out.println("converts An Integer To Its Binary String "+convertsAnIntegerToItsBinaryString.apply(111));

        //14
//        Consumer<List<String>> printWithIndex = list -> {
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(i + ": " + list.get(i));
//            };
//        };
//    List<String> names=Arrays.asList("YAMAN","Ali");
//      System.out.println("print With Index ");
//        printWithIndex.accept(names);

       //15
//         List<Integer> numbers = Arrays.asList(1,2,4);
//         List<Integer> squaresOfIntger = numbers.stream().map(num ->num * num).collect(Collectors.toList());
//        System.out.println("Squares of Integers " + squaresOfIntger);
//
//        List<Integer> evenNumbers = numbers.stream().filter(num ->num %2==0).toList();
//        System.out.println("Even numbers " + evenNumbers);

//        List<String> names = Arrays.asList("YAMAN","Jojo");
//        Optional<String> nameStartsWithJ= names.stream().filter(name->name.startsWith("J")).findFirst();
//        System.out.println("name Starts With J " + nameStartsWithJ);

     //16
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2),
//                Arrays.asList(3, 4),
//                Arrays.asList(5)
//        );
//
//        // Flatten the list of lists into a single stream of integers
//        Stream<Integer> flatTheListOfLists = listOfLists.stream().flatMap(List::stream);
//
//        // Collect the flattened stream into a List and print it
//        List<Integer> flattenedList = flatTheListOfLists.toList();
//        System.out.println("The flattened list: " + flattenedList);



        //17
//        List<String> names=Arrays.asList("YAman","Mohammad","Ali");
//        List<String> sortedNames=names.stream()
//                                    .sorted(Comparator.comparingInt(String::length)).toList();
//                System.out.println("sorted Names : " + sortedNames);



//                List<String> words = Arrays.asList("apple", "banana","lemmon", "kiwi", "grape");
//
//                words.stream()
//                        .filter(word -> word.length() > 5)
//                        .peek(word -> System.out.println("Long word found: " + word)) //The peek() method is used here to print each long word that passes through the filter.
//                        // It allows you to see which words are being processed without modifying them.
//                        .map(String::toUpperCase)
//                        .forEach(System.out::println);





//        Library YamansLibrary =new Library();
//Book FirstBook = new Book("it ends with us","coolleve",new Date(),"book of love story",false,"+18");
//Magazine FirstMagazine = new Magazine("math","abeer",new Date(),"math for intelegant people",true,1);
//        YamansLibrary.addLibraryItem(FirstBook);
//        YamansLibrary.addLibraryItem(FirstMagazine);
//
//        // Display all items in the library
//        YamansLibrary.displayAllItems();
//
//        // Borrow and return a book
//        YamansLibrary.borrowLibraryItem("math");
//        YamansLibrary.returnLibraryItem("math");
//
//        // Search for a magazine by title
//        YamansLibrary.searchItem("Programming");




//
//        List<EmployeeTwo> employees = List.of(
//                new EmployeeTwo("Alex",34,63000,"Engineering","NewYork"),
//                new EmployeeTwo("Marina",43,100000,"Engineering","NewYork"),
//                new EmployeeTwo("Hasan",23,50000,"Sales","NewYork"),
//                new EmployeeTwo("Elizabeth",22,50000,"Sales","NewYork"),
//                new EmployeeTwo("Kim",60,70000,"Finance","NewYork"),
//                new EmployeeTwo("Safa",56,40000,"HR","NewYork"),
//                new EmployeeTwo("Ahmad",43,60000,"HR","NewYork"),
//                new EmployeeTwo("Merry",32,35000,"Production","SanFransisco"),
//                new EmployeeTwo("Saeed",54,43000,"Production","SanFransisco")
//        );
//
//
//
//                System.out.println("1-Employees who work in the \"Sales\" department");
//                employees.stream()
//                        .filter(emp -> emp.getDepartment().equals("Sales"))
//                        .forEach(emp -> System.out.println("Employee Name : " + emp.getName() + " , Employee age :" + emp.getAge()));
//
//                System.out.println("2-Employees earning more than 50,000");
//                employees.stream()
//                        .filter(emp-> emp.getSalary() > 50000)
//                        .forEach(emp -> System.out.println("Employee Name : " + emp.getName() + " , Employee Salary :" + emp.getSalary()));
//
//                System.out.println("3-Group all employees by the city they live in, and display the list of employees for each \n" +
//                        "city. ");
//                employees.stream()
//                        .collect(Collectors.groupingBy(EmployeeTwo::getCity))
//                        .forEach((city, empList) -> {
//                            System.out.println("City: " + city);
//                            empList.stream()
//                                    .map(EmployeeTwo::getName)
//                                    .distinct()
//                                    .forEach(System.out::println);
//                        });
//
//                System.out.println("4-Sort the list of employees by their salary in descending order and display the top 5 \n" +
//                        "highest-paid employees with their name and salary");
//                employees.stream()
//                        .sorted(Comparator.comparingDouble(EmployeeTwo::getSalary).reversed())
//                        .limit(5)
//                        .forEach(emp -> System.out.println("Employee Name: " + emp.getName() + ", Employee Salary: " + emp.getSalary()));
//
//                System.out.println("5-Find the Average Salary of Employees in a engineering Department");
//                double EngineeringSalaryAVG = employees.stream().filter(emp -> emp.getDepartment().equals("Engineering"))
//                        .mapToDouble(EmployeeTwo -> EmployeeTwo.getSalary())
//                        .average()
//                        .orElse(0.0);
//
//                System.out.println("Average Salary in Engineering: " + EngineeringSalaryAVG);









    }

    }
