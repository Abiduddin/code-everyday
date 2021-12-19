package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

    int id;
    String name;
    int age;
    int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
public class ListSortObjects {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Abul", 27, 124));
        list.add(new Employee(2, "Babul", 25, 431));
        list.add(new Employee(3, "Kabul", 29, 234));
        list.add(new Employee(4, "Mofiz", 24, 567));
        list.add(new Employee(5, "Hafiz", 28, 756));

        Collections.sort(list, new Comparator<Employee>(){
            @Override
            public int compare(Employee t, Employee t1) {
                return t.age - t1.age;
            }
        });

//        Collections.sort(list);

        list.forEach((x) -> {
            System.out.println(x.name);
        });
    }
}
