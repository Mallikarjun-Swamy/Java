package collectionFramework.list.arrayList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(105, "Arjun", "Sharma", new BigDecimal("850000.00")));
        employeeList.add(new Employee(102, "Priya", "Patel", new BigDecimal("920000.00")));
        employeeList.add(new Employee(103, "Rohan", "Deshmukh", new BigDecimal("780000.00")));
        employeeList.add(new Employee(104, "Ananya", "Iyer", new BigDecimal("1250000.00")));
        employeeList.add(new Employee(101, "Vikram", "Singh", new BigDecimal("640000.00")));

        System.out.println("Before Sorting");
        System.out.println(employeeList);
        System.out.println();


        //1. BY Using Comparable Which Sorts by Employee ID (Default Sorting)

        Collections.sort(employeeList); //or employeeList.sort(null);

        System.out.println("after sorting by Employee Id in ascending order");
        System.out.println(employeeList);
        System.out.println();


        // 2. By Using Salary Comparator
        EmpSalaryComparator salaryComparator = new EmpSalaryComparator();

        employeeList.sort(salaryComparator);  //or Collections.sort(employeeList, salaryComparator);

        System.out.println("after sorting according salary in ascending order");
        System.out.println(employeeList);
        System.out.println();


        //3. By using FirstName Comparator by using Anonymous Inner Class

        Comparator<Employee> firstNameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp2.getFirstName().compareTo(emp1.getFirstName());
            }
        };

        employeeList.sort(firstNameComparator);

        System.out.println("after sorting according First name according to Reverse of Alphabetical Order");
        System.out.println(employeeList);
        System.out.println();


        // 4. By Using Lambda Expression, Sorting By LastName alphabetically

        employeeList.sort((emp1, emp2)->(emp1.getLastName().compareTo(emp2.getLastName())));

        System.out.println("after sorting according Last name according to Alphabetical Order");
        System.out.println(employeeList);
        System.out.println();


        // 5. By Using Method Reference, Sorting By FirstName alphabetically

        employeeList.sort((Comparator.comparing(Employee::getFirstName)));

        System.out.println("after sorting according First name according to Alphabetical Order");
        System.out.println(employeeList);
        System.out.println();


    }

}


