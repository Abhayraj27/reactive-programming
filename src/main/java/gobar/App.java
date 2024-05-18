package gobar;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String... args) {
        Map<Employee, Integer> employeeIntegerMap = new HashMap<>();

        Address a1 = new Address("BLR");
        Address a2 = new Address("DLH");
        Address a3 = new Address("NCR");

        Employee e1 = new Employee("Ram1", a1);
        Employee e2 = new Employee("Ram2", a2);
        Employee e3 = new Employee("Ram3", a3);

        employeeIntegerMap.put(e1, 100);
        employeeIntegerMap.put(e2, 200);
        employeeIntegerMap.put(e3, 220);

        System.out.println(employeeIntegerMap.get(e1) + ":" + e1.hashCode());

        e1.setName("Ram2");
        e1.getAddress().setCity("HELLO");

        System.out.println(employeeIntegerMap.get(e1) + ":" + e1.hashCode());
    }
}
